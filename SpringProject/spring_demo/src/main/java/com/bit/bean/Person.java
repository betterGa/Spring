package com.bit.bean;

public class Person {

    private String pname;

    public String getPname() {
        return pname;
    }

    public Person()
    {}

    public  Person(String name)
    {this.pname=name;

    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String sayHello(String message)
    {return "jiajia"+message;}
}
