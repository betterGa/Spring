package com.bit;

import com.bit.bz.UserBz;
import com.bit.mapper.UserMapper;
import com.bit.po.User;
import com.bit.po.Userex;
import com.sun.deploy.nativesandbox.comm.Response;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;


import java.io.InputStream;
import java.util.List;

public class MybatisTest {

    private SqlSessionFactory sqlSessionFactory=null;

    @Before
    public void testInitialtive()
    {String file="sqlMapConfig.xml";
        InputStream is=null;
        try{
            is=Resources.getResourceAsStream(file);
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
            }
            catch (Exception ex)
            {ex.printStackTrace();}
    }


    @Test
    public void testQueryUserByZH() throws Exception
    {SqlSession sqlSession=sqlSessionFactory.openSession();
    try{
        Userex userex=new Userex();
        userex.setSex("2");
        userex.setUsername("vin");
        UserBz userbz=new UserBz();
UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
List<Userex> userexList=userMapper.queryUserByZH(null);
System.out.println(userexList);
    }
    catch (Exception ex)
    {ex.printStackTrace();}
    }



}
