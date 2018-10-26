package com.example.mtayyab.bscs_f15_b;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    private RecyclerView recyclerView;
    private MyAdapter myAdapter;
    private List<Country> countryList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=(RecyclerView) findViewById(R.id.rcv1);
        myAdapter=new MyAdapter(countryList,this);
        RecyclerView.LayoutManager myLayoutManager=new GridLayoutManager(getApplicationContext(),3);
        recyclerView.setLayoutManager(myLayoutManager);
        recyclerView.setAdapter(myAdapter);
        prepareCountryData();
    }
    public void prepareCountryData()
    {
        Country country1=new Country();
        country1.setCountryName("Pakistan");
        country1.setCountryImage(R.drawable.pakistan);
        countryList.add(country1);

        Country country2=new Country();
        country2.setCountryName("Canada");
        country2.setCountryImage(R.drawable.canada);
        countryList.add(country2);

        Country country3=new Country();
        country3.setCountryName("France");
        country3.setCountryImage(R.drawable.france);
        countryList.add(country3);

        Country country4=new Country();
        country4.setCountryName("Germany");
        country4.setCountryImage(R.drawable.germany);
        countryList.add(country4);

        Country country5=new Country();
        country5.setCountryName("Sweden");
        country5.setCountryImage(R.drawable.sweden);
        countryList.add(country5);

        Country country6=new Country();
        country6.setCountryName("New Zealand");
        country6.setCountryImage(R.drawable.newzealand);
        countryList.add(country6);

        Country country7=new Country();
        country7.setCountryName("China");
        country7.setCountryImage(R.drawable.china);
        countryList.add(country7);

        Country country8=new Country();
        country8.setCountryName("Bangladesh");
        country8.setCountryImage(R.drawable.bangladesh);
        countryList.add(country8);

        Country country9=new Country();
        country9.setCountryName("Japan");
        country9.setCountryImage(R.drawable.japan);
        countryList.add(country9);

        Country country10=new Country();
        country10.setCountryName("Australia");
        country10.setCountryImage(R.drawable.australia);
        countryList.add(country10);

        Country country11=new Country();
        country11.setCountryName("Sri Lanka");
        country11.setCountryImage(R.drawable.srilanka);
        countryList.add(country11);

        Country country12=new Country();
        country12.setCountryName("Iran");
        country12.setCountryImage(R.drawable.iran);
        countryList.add(country12);

        Country country13=new Country();
        country13.setCountryName("Italy");
        country13.setCountryImage(R.drawable.italy);
        countryList.add(country13);

        Country country14=new Country();
        country14.setCountryName("Brazil");
        country14.setCountryImage(R.drawable.brazil);
        countryList.add(country14);

        Country country15=new Country();
        country15.setCountryName("Peru");
        country15.setCountryImage(R.drawable.peru);
        countryList.add(country15);

        Country country16=new Country();
        country16.setCountryName("Oman");
        country16.setCountryImage(R.drawable.oman);
        countryList.add(country16);
    }
}
