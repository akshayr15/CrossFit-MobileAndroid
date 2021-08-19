package com.example.crossfit;

public class BicepsData {
    String Name;

    public BicepsData(String name, String description, String image) {
        Name = name;
        Description = description;
        Image = image;
    }

    String Description;
    String Image;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }
}
