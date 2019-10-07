package com.bit;

import com.bit.po.user;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class MybatisTest {

    //获取sqlSessionnfactory
    private SqlSessionFactory sqlSessionFactory;


    @Before
    public void testInit()
    {
        String mybatisConfigFile="sqlMapConfig.xml";
        InputStream is=null;
        try {

            is=Resources.getResourceAsStream(mybatisConfigFile);
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



//执行相关操作
    @Test
    public void queryUserByID()
    {

        SqlSession sqlSession=sqlSessionFactory.openSession();
        user user1=sqlSession.selectOne("test.queryUserById",1);
        System.out.println(user1);
        sqlSession.close();
    }


@Test
    public void queryUserByName()
{
    SqlSession sqlSession=sqlSessionFactory.openSession();
    List<user> user2=sqlSession.selectList("test.queryUserByName","vin");
    System.out.println(user2);
    sqlSession.close();
}

    @Test
    public void AddUser()
    {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        user user3=new user();
        user3.setUserName("MMMM");
        user3.setUserAddr("USA");
        int flag=sqlSession.insert("test.addUser",user3);

        //事务相关，执行操作之后需要提交事务
        try{
            sqlSession.commit();
            System.out.println(flag);
        }

        catch (Exception ex)
        {ex.printStackTrace();

//失败了要回滚事务
            sqlSession.rollback();}

        finally {
            sqlSession.close();
        }

    }

    @Test
    public void updateUser()
    {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        try{
        user user4=new user();
        user4.setUserName("HHHH");
        user4.setUserID(9);
        int flag=sqlSession.update("test.updateUser",user4);

        //事务相关，除了查询操作以外，其他执行操作之后需要提交事务。
            sqlSession.commit();
            System.out.println(flag);
        }

        catch (Exception ex)
        {ex.printStackTrace();

//失败了要回滚事务
            sqlSession.rollback();}

        finally {
            sqlSession.close(); }

    }


    @Test
    public void deleteUser()
    {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        try{
            user user5=new user();
            user5.setUserID(9);
            int flag=sqlSession.delete("test.deleteUser",user5);

            //事务相关，除了查询操作以外，其他执行操作之后需要提交事务。
            sqlSession.commit();
            System.out.println(flag);
        }

        catch (Exception ex)
        {ex.printStackTrace();

//失败了要回滚事务
            sqlSession.rollback();}

        finally {
            sqlSession.close(); }

    }


    @Test
    public void delete2User()
    {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        try{

            int flag=sqlSession.delete("test.delete2User",8);

            //事务相关，除了查询操作以外，其他执行操作之后需要提交事务。
            sqlSession.commit();
            System.out.println(flag);
        }

        catch (Exception ex)
        {ex.printStackTrace();

//失败了要回滚事务
            sqlSession.rollback();}

        finally {
            sqlSession.close(); }

    }






}
