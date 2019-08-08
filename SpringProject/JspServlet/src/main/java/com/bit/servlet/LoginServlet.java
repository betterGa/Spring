package com.bit.servlet;

import com.bit.biz.userInfoDAO;
import com.bit.vo.UserInfo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.sql.SQLException;

@WebServlet(name = "/LoginServlet")



public class LoginServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);

        response.setContentType("text/html;charset=UTF-8");















        PrintWriter writer=resp.getWriter();
        writer.append("<!DOCTYPE html>\n"+
                "<html lang=\"en\">+\n"+
                "<head>\n"+
                "<meta charset=\"UTF-8\">\n"+
                "<title>景点</title>\n"+
                "</head>\n"+
                "<body>\n"+
                "<table>\n"+
                         "<thead>\n"+
                "<tr>\n"+
                "<td>编号</td>\n"+
                "<td>所在城市</td>\n"+
                "<td>景点名称</td>\n"+
                "</tr>\n"+
                "</thead>\n"+
                "<tbody>");

        int id=1;
        for(ScenicSpot pot:scenicSpotstoArrayList)
        {writer.append("<tr>")
                .append("<td>") .append(String.valueOf(id)) .append("</td>")
                .append("<td>") .append(pot.city) .append("</td>")
                .append("<td>") .append(pot.name) .append("</td>")
                .append("</tr>");
            id=id+1; }

        writer.append("</tbody>\n"+
                "</table>\n"+
                "</body>\n"+
                "</html>"); }

        //request.getRequestDispatcher("Success.jsp").forward(request,response);}}
   //RequestDispatcher rd = request.getRequestDispatcher("/Success.jsp");
    //rd.forward(request, response);
        String url="/Success.jsp";
        ServletContext sc = getServletContext();
        RequestDispatcher rd = sc.getRequestDispatcher(url);
        rd.forward(request, response);



}}



        //请求重定向方式跳转到jsp页面
       // response.sendRedirect(request.getContextPath() + "/Success.jsp");

       // response.sendRedirect("Success.jsp");








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


