<%-- 
    Document   : media
    Created on : 25-feb-2017, 21:13:34
    Author     : adri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Media</title>
  </head>
  <body>
    La media de las 3 notas es:
    <% 
      float media = Float.parseFloat(request.getParameter("nota1"))
              + Float.parseFloat(request.getParameter("nota2"))
              + Float.parseFloat(request.getParameter("nota3"));
      out.print(media/3);
    %>
  </body>
</html>
