package com.shariff.recylerviewapp;

public class Item {
    private String name,phone;
    private  int img_poster;

    public Item(String name, String phone, int img_poster) {
        this.name = name;
        this.phone = phone;
        this.img_poster = img_poster;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getImg_poster() {
        return img_poster;
    }

    public void setImg_poster(int img_poster) {
        this.img_poster = img_poster;
    }
}
