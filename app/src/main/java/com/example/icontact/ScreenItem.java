package com.example.icontact;

public class ScreenItem {

    //11 May 2020
    //Fauzi Kemal Ibrahim
    //10117238
    //IF-7

    String Title,Description;
            int ScreenImg;

    public ScreenItem(String title, String description, int screenImg){
        Title = title;
        Description = description;
        ScreenImg = screenImg;
    }

    public void setTitle(String title){
        Title = title;
    }

    public void setDescription(String description){
        Description = description;
    }

    public String getTitle(){
        return Title;
    }

    public String getDescription(){
        return Description;
    }

    public int getScreenImg(){
        return ScreenImg;
    }
}
