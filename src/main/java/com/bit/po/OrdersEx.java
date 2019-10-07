package com.bit.po;

import java.util.Date;

public class OrdersEx extends Orders{
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getSex() {
        return sex;
    }

    @Override
    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getItemsid() {
        return itemsid;
    }

    public void setItemsid(String itemsid) {
        this.itemsid = itemsid;
    }

    @Override
    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String getNote() {
        return note;
    }

    @Override
    public void setNote(String note) {
        this.note = note;
    }

    private String username;
    private String sex;
    private String address;
private String itemsid;
private Date createtime;
private String note;
}
