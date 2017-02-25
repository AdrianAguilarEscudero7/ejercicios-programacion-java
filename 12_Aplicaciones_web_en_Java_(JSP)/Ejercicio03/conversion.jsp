<%-- 
    Document   : conversion
    Created on : 25-feb-2017, 23:12:02
    Author     : adri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Conversión</title>
  </head>
  <body>
    <%
      out.println(request.getParameter("euros") + "€ son:");
      out.println(Double.parseDouble(request.getParameter("euros")) * 166.386 + 
              " pesetas.");
    %>
  </body>
</html>
