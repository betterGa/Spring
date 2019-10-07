package com.bit.vo;

import java.util.Date;

//商品列表
public class items {

    private int itemsID;
    private String itemsName;
    private String itemsPrice;
    private Date itemsCreateTime;

    public items()
    {}

    @Override
    public String toString() {
        return "items{" +
                "itemsID=" + itemsID +
                ", itemsName='" + itemsName + '\'' +
                ", itemsPrice='" + itemsPrice + '\'' +
                ", itemsCreateTime=" + itemsCreateTime +
                '}';
    }

    public int getItemsID() {
        return itemsID;
    }

    public void setItemsID(int itemsID) {
        this.itemsID = itemsID;
    }

    public String getItemsName() {
        return itemsName;
    }

    public void setItemsName(String itemsName) {
        this.itemsName = itemsName;
    }

    public String getItemsPrice() {
        return itemsPrice;
    }

    public void setItemsPrice(String itemsPrice) {
        this.itemsPrice = itemsPrice;
    }

    public Date getItemsCreateTime() {
        return itemsCreateTime;
    }

    public void setItemsCreateTime(Date itemsCreateTime) {
        this.itemsCreateTime = itemsCreateTime;
    }
}
