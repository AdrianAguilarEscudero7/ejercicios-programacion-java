<%-- 
    Document   : conversion
    Created on : 25-feb-2017, 23:12:02
    Author     : adri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.text.DecimalFormat;"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Conversión</title>
  </head>
  <body>
    <%
      DecimalFormat df = new DecimalFormat("###.###");
      
      out.println(request.getParameter("pesetas") + " pesetas son:");
      out.println(df.format(Double.parseDouble(request.getParameter("pesetas"))/166.386) + 
              "€.");
    %>
  </body>
</html>
