
package com.bit;

import com.bit.bean.Person;
import com.bit.bean.UserInfo;
import com.bit.bean2.Bean1;
import com.bit.bean2.Bean2;
import com.bit.bean2.Bean5;
import com.bit.bean3.springConfig;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
public class ObjectTest {
    //拿到Spring的API
    //Servlet的API（ServletConfig,ServletContext...）

    private ApplicationContext applicationContext=null;
    @Before
public void testInitial()
{

    applicationContext=new ClassPathXmlApplicationContext(new String[] {"applicationContext3.xml"});
    //读取类路径下的这个文件
    }

@Test
    public void testMethod()
{/*
Person person=(Person)applicationContext.getBean("p");
//返回的是个Object类

    //System.out.println(person.sayHello("ohh"));
System.out.println("pname="+person.getPname());
*/



/*
    UserInfo userInfo=(UserInfo) applicationContext.getBean("userInfo");
    System.out.println("pname="+ userInfo.getPerson().getPname());
*/

/*
Bean1 bean1=(Bean1) applicationContext.getBean("bean1");
System.out.println("strValue="+bean1.getStrValue());
System.out.println("intValue="+bean1.getIntValue());
System.out.println("arrayValue="+bean1.getArrayValue());
System.out.println("setValue="+bean1.getSetValue());
System.out.println("mapvalue="+bean1.getMapvalue());
System.out.println("listValue="+bean1.getListvalue());


System.out.println("dataValue="+bean1.getDataValue());*/



/*
Bean2 bean2=(Bean2) applicationContext.getBean("bean2");
System.out.println("--------------Bean3--------------");
System.out.println(bean2.getBean3().getId());
System.out.println(bean2.getBean3().getUsername());
System.out.println(bean2.getBean3().getPassword());
System.out.println("--------------Bean4--------------");
System.out.println(bean2.getBean4().getId());
System.out.println(bean2.getBean4().getUsername());
System.out.println("------------Bean5---------------");
System.out.println(bean2.getBean5().getAge());
*/

/*
Bean5 bean5=(Bean5)applicationContext.getBean("bean5");
Bean5 bean51=(Bean5)applicationContext.getBean("bean5");
if(bean5==bean51)
    System.out.println("singleton");
else System.out.println("multipart");




}



}*/
public class ObjectTest
{

    private AnnotationConfigApplicationContext context;



    @Before
    public void initTest()
    {
        context=new AnnotationConfigApplicationContext(springConfig.class);
    }

    @Test
    public void Test()
    {
   Person person=(Person) context.getBean("person");;
        System.out.println(person.sayHello("ahhhhhh"));
    }



}
