package com.example.mtayyab.bscs_f15_b;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>
{
    private List<Country> countryList;
    private Context mContext;

    MyAdapter(List<Country> countryList,Context c)
    {
        this.countryList=countryList;
        this.mContext=c;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
    {
        LayoutInflater inflater=LayoutInflater.from(viewGroup.getContext());
        View view=inflater.inflate(R.layout.flagview,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position)
    {
        final Country country=countryList.get(position);
        holder.imageView.setImageResource(country.getCountryImage());
        holder.textView.setText(country.getCountryName());
        holder.textView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i=new Intent(mContext,NewActivity.class);
                i.putExtra("NAME",country.getCountryName());
                mContext.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount()
    {
        return countryList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        ImageView imageView;
        TextView textView;
        public MyViewHolder(@NonNull View itemView)
        {
            super(itemView);
            imageView=(ImageView) itemView.findViewById(R.id.imgv1);
            textView=(TextView) itemView.findViewById(R.id.txtv1);
        }
    }
}
