package com.example.marketapp;

public class Item {
    int itemImg;
    String itemName, itemDesc;

    public Item(int itemImg , String itemName, String itemDesc) {
        this.itemImg = itemImg;
        this.itemName=itemName;
        this.itemDesc=itemDesc;
    }

    public int getItemImg() {
        return itemImg;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemImg(int itemImg) {
        this.itemImg = itemImg;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }
}
