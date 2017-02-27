<%-- 
    Document   : tabla
    Created on : 27-feb-2017, 19:49:33
    Author     : adri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Tabla</title>
  </head>
  <body>
    <%
      out.println("<h3>La tabla de multiplicar del "+request.getParameter("numero")
              + " es:</h3>");
      out.println("<table border=\"1\">");
      for (int i = 1; i <= 10; i++) {
        out.println("<tr>");
        out.println("<td>"+request.getParameter("numero")+"x"+i+"</td>");
        out.println("<td>"+(Integer.parseInt(request.getParameter("numero")))*i+"</td>");
        out.println("</tr>");
      }
      out.println("</table>");
    %>
  </body>
</html>
