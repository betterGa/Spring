<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2019/8/8
  Time: 18:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<html>
<head>
    <title>ShowItemsPageInfomation</title>
</head>
<body>

<table border="1" width="100%" align="center">
    <tr>
        <th>ItemsID</th>
        <th>ItemsName</th>
        <th>ItemsPrice</th>
    <%--<td>ItemsCreateTime</td>--%>



        <c:forEach items="${itemListKey}"var="itemsVar">
            <tr>
            <td>${itemsVar.itemsId}</td>
            <td>${itemsVar.itemsName}</td>
            <td>${itemsVar.itemsPrice}</td>
          <%--  <td>${itemsVar.itemscreatime}</td>--%>





            </tr>
    </c:forEach>
</table>

</body>
</html>
