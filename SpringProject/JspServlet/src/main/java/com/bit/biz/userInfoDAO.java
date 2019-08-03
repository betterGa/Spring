package com.bit.biz;

import com.bit.vo.UserInfo;

import java.com.bit.db.DbManger;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//DAO:面向对象的数据库接口
public class userInfoDAO {
    //验证用户名密码是否匹配
    public int checkUserInfo(UserInfo userInfo) throws SQLException
    {int flag=0;
    String username=null;
    String password=null;
    String strSql="select t_username,t_userpass from t_user where t_username='"+UserInfo.getUsername() +"'and t_userpass='"+UserInfo.getUserpass()+"'";
        java.com.bit.db.DbManger dbManger=new DbManger();
    Connection connection=dbManger.getConnection();
       ResultSet resultSet=dbManger.queryMethod(strSql);
       while (resultSet.next())
       {username=resultSet.getString("t_name");
       password=resultSet.getString("t_userpass");
     if(username.equals(userInfo.getUserId())&&password.equals(userInfo.getUserpass()))
     {flag=1;return flag;}
       else flag=0; return flag;}
        return flag;
       }
}
