package java.com.bit.db;

import java.sql.*;

public class DbManger {

    private Connection connection=null;
    private Statement statement;
    private ResultSet resultSet=null;

    private String username="root";
    private String password="jdpy1229jiajia";
    private String driver="com.mysql.jdbc.Driver";
    private String url="jdbc:mysql://localhost:3306/tt?useSSL=false";

    public Connection getConnection()
    {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("loading driver successfully...");
        try {
            connection=DriverManager.getConnection(url,username,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("connection db successfully...");
    return connection;}

    public int nonoQueryMehod(String strSql)
        {int flag=0;
        connection=this.connection;
            try {
                statement=connection.createStatement();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                flag=statement.executeUpdate(strSql);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return flag;}

            public ResultSet queryMethod(String strSql)
            {connection=this.connection;
                try {
                    statement=connection.createStatement();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                try {
                    resultSet=statement.executeQuery(strSql);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return resultSet;
            }


            public void closeDb()
            {
            if(resultSet!=null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(statement!=null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(connection!=null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            }}





