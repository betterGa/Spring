package com.bit.bean2;

import java.beans.PropertyEditor;
import java.beans.PropertyEditorSupport;
import java.io.DataInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;




//将String通过pattern样式转换成Date
public class DateConvert extends PropertyEditorSupport {

@Override
    public void setAsText(String text) throws IllegalArgumentException {
        System.out.println("text value="+text);
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
     try {
         Date  data = simpleDateFormat.parse(text);
         setValue(data);
         //把String类型转换成Date
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

