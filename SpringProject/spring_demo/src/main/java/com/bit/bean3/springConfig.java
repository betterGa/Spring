package com.bit.bean3;


import com.bit.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

//扫描包
@ComponentScan(basePackages = "com.bit.bean")
public class springConfig {
    @Bean(name="person")
    //相当于<bean id="person" class="com.bit.bean.Person">
    public Person person()
    {Person person=new Person();
    return person; }
}
