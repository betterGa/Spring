<%@ page import="com.bit.vo.items" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>--%>

<html>
<head>
    <title>ShowItemsPageInformation</title>
</head>
<body>
<table border="1" width="100%" align="center">
    <tr>
        <th>ItemsID</th>
        <th>ItemsName</th>
        <th>ItemsPrice</th>
        <%-- <td>ItemsCreateTime</td>--%>
    </tr>

    <%
        List<items> itemsList = (List<items>) request.getAttribute("itemsListKey");
        for(Iterator it = itemsList.iterator(); it.hasNext();){
            items items1 = (items) it.next();
    %>
    <tr>
        <td>
            <%=items1.getItemsID()%>
        </td>
        <td>
            <%=items1.getItemsName()%>
        </td>
        <td>
            <%=items1.getItemsPrice()%>
        </td>
        <td>

        </td>
    </tr>

    <%}%>



</table>
</body>
</html>
