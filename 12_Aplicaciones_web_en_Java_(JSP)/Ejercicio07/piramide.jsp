<%-- 
    Document   : piramide
    Created on : 27-feb-2017, 22:41:37
    Author     : adri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Pirámide</title>
  </head>
  <body>
    <%
      int cantidad = 1;
      int espacios = Integer.parseInt(request.getParameter("altura"))-1;
      int lineas = Integer.parseInt(request.getParameter("altura"));
      
      while (lineas > 0) {
        for (int i = 1; i <= espacios; i++) {
          out.println("<img src=\"ladrilloblanco.jpg\" alt=\"Ladrillo Blanco\">");
        }
        
        for (int i = 1; i <= cantidad; i++) {
          out.println("<img src=\"ladrillo.jpg\" alt=\"Ladrillo\">");
        }
        out.println("<br>");
        cantidad += 2;
        espacios--;
        lineas--;
      }
    %>
  </body>
</html>
