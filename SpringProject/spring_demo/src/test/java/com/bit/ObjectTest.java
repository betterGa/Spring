package com.bit;

import com.bit.bean.Person;
import com.bit.bean.UserInfo;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ObjectTest {
    //拿到Spring的API
    //Servlet的API（ServletConfig,ServletContext...）

    private ApplicationContext applicationContext=null;
    @Before
public void testInitial()
{

    applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
    //读取类路径下的这个文件


}

@Test
    public void testMethod()
{
Person person=(Person)applicationContext.getBean("p");
//返回的是个Object类

    //System.out.println(person.sayHello("ohh"));
System.out.println("pname="+person.getPname());

}



}
