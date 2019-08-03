package com.bit.servlet;

import com.bit.biz.userInfoDAO;
import com.bit.vo.UserInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet(name = "/LoginServlet")



public class LoginServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);

        response.setContentType("text/html;charset=UTF-8");


        //请求重定向方式跳转到jsp页面
        //response.sendRedirect(request.getContextPath() + "/Success.jsp");

        response.sendRedirect("test.jsp");

    
    }






    /*
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
this.doPost(request,response);

    response.setContentType("text/html;charset=UTF-8");
    PrintWriter writer=response.getWriter();

    //1.获取表单参数
String username=request.getParameter("username");
String password=request.getParameter("password");

        UserInfo userInfo=new UserInfo();
        userInfo.setUsername(username);
        userInfo.setUserpass(password);


        //2.调用业务逻辑（后台的），本来应该调Service,这里用DAO持久层
userInfoDAO userInfoDAO=new userInfoDAO();
        int flag= 0;
        try {
            flag = userInfoDAO.checkUserInfo(userInfo);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(flag==1)
//转向

{
    request.getRequestDispatcher("/setJSP/Success.jsp").forward(request,response);
   /* RequestDispatcher rd = request.getRequestDispatcher("/Success.jsp");
    rd.forward(request, response);


    request.setAttribute("userinfokey",userInfo);
}
else {
            request.getRequestDispatcher("/setJSP/Failure.jsp").forward(request,response);}

           /* RequestDispatcher rd = request.getRequestDispatcher("/Failure.jsp");
            rd.forward(request, response);

            try {
                userInfoDAO.checkUserInfo(userInfo);
            } catch (SQLException e) {
                e.printStackTrace();
            }


        }}


        */
        }

