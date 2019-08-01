package com.bit.bean2;


//属性的注入

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Bean1 {

    private String strValue;
    private int intValue;
    private String[] arrayValue;
    private List listvalue;
    private Map Mapvalue;
    private Set SetValue;
    private Date dataValue;

    public Date getDataValue() {
        return dataValue;
    }

    public void setDataValue(Date dataValue) {
        this.dataValue = dataValue;
    }




public Bean1(){}


    public String getStrValue() {
        return strValue;
    }

    public void setStrValue(String strValue) {
        this.strValue = strValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public String[] getArrayValue() {
        return arrayValue;
    }

    public void setArrayValue(String[] arrayValue) {
        this.arrayValue = arrayValue;
    }

    public List getListvalue() {
        return listvalue;
    }

    public void setListvalue(List listvalue) {
        this.listvalue = listvalue;
    }

    public Map getMapvalue() {
        return Mapvalue;
    }

    public void setMapvalue(Map mapvalue) {
        Mapvalue = mapvalue;
    }

    public Set getSetValue() {
        return SetValue;
    }

    public void setSetValue(Set setValue) {
        SetValue = setValue;
    }
}

