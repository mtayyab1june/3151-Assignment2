package com.example.mtayyab.bscs_f15_b;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity
{
    ImageView imageView2;
    TextView textView2;
    String name;
    int image;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        imageView2=(ImageView) findViewById(R.id.imgv2);
        textView2=(TextView) findViewById(R.id.txtv2);

        name=getIntent().getExtras().getString("NAME");

        if (name.equals("Pakistan"))
        {
            imageView2.setImageResource(R.drawable.pakistan);
            textView2.setText(name);
        }
        else if (name.equals("Canada"))
        {
            imageView2.setImageResource(R.drawable.canada);
            textView2.setText(name);
        }
        else if (name.equals("France"))
        {
            imageView2.setImageResource(R.drawable.france);
            textView2.setText(name);
        }
        else if (name.equals("Germany"))
        {
            imageView2.setImageResource(R.drawable.germany);
            textView2.setText(name);
        }
        else if (name.equals("Sweden"))
        {
            imageView2.setImageResource(R.drawable.sweden);
            textView2.setText(name);
        }
        else if (name.equals("New Zealand"))
        {
            imageView2.setImageResource(R.drawable.newzealand);
            textView2.setText(name);
        }
        else if (name.equals("China"))
        {
            imageView2.setImageResource(R.drawable.china);
            textView2.setText(name);
        }
        else if (name.equals("Bangladesh"))
        {
            imageView2.setImageResource(R.drawable.bangladesh);
            textView2.setText(name);
        }
        else if (name.equals("Japan"))
        {
            imageView2.setImageResource(R.drawable.japan);
            textView2.setText(name);
        }
        else if (name.equals("Australia"))
        {
            imageView2.setImageResource(R.drawable.australia);
            textView2.setText(name);
        }
        else if (name.equals("Sri Lanka"))
        {
            imageView2.setImageResource(R.drawable.srilanka);
            textView2.setText(name);
        }
        else if (name.equals("Iran"))
        {
            imageView2.setImageResource(R.drawable.iran);
            textView2.setText(name);
        }
        else if (name.equals("Italy"))
        {
            imageView2.setImageResource(R.drawable.italy);
            textView2.setText(name);
        }
        else if (name.equals("Brazil"))
        {
            imageView2.setImageResource(R.drawable.brazil);
            textView2.setText(name);
        }
        else if (name.equals("Peru"))
        {
            imageView2.setImageResource(R.drawable.peru);
            textView2.setText(name);
        }
        else if (name.equals("Oman"))
        {
            imageView2.setImageResource(R.drawable.oman);
            textView2.setText(name);
        }
    }
}
