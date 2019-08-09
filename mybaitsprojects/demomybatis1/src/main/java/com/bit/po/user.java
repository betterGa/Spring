package com.bit.po;
//持久化对象，要把这个对象放到数据库中
public class user {
    //必须要有primary key
    public int userID;
    public String userName;
    public String userAddr;


    //默认的无参构造
    public user()
    {}

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAddr() {
        return userAddr;
    }

    public void setUserAddr(String userAddr) {
        this.userAddr = userAddr;
    }

    @Override
    public String toString() {
        return "user{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", userAddr='" + userAddr + '\'' +
                '}';
    }
}
