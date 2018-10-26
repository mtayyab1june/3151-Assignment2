package com.example.mtayyab.bscs_f15_b;

public class Country
{
    int country_image;
    public String country_name;
    //public int country_code;

    public void setCountryName(String country_name)
    {
        this.country_name=country_name;
    }

    /*public void setCountryCode(int country_code)
    {
        this.country_code=country_code;
    }*/

    public void setCountryImage(int country_image)
    {
        this.country_image=country_image;
    }

    public String getCountryName()
    {
        return country_name;
    }

    /*public int getCountryCode()
    {
        return country_code;
    }*/

    public int getCountryImage()
    {
        return country_image;
    }
}
