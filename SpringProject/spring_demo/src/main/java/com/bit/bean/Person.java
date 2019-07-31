package com.bit.bean;

public class Person {

    public String getPname() {
        return pname;
    }


    private String pname;
    private String pname1;
    private String pname2;
    private String pname3;
    private int pAge1;

    public Person(String pname, String pname1, String pname2, String pname3, int pAge1) {
        this.pname = pname;
        this.pname1 = pname1;
        this.pname2 = pname2;
        this.pname3 = pname3;
        this.pAge1 = pAge1;
    }

    public  Person(String name)
    {this.pname=name;

    }

    public void Person()
    {}




    public String sayHello(String message)
    {return "jiajia"+message;}
}
