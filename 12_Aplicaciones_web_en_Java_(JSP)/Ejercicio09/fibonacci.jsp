<%-- 
    Document   : fibonacci
    Created on : 02-mar-2017, 18:09:35
    Author     : adri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Fibonacci</title>
  </head>
  <body>
    <%
      int numero1 = 0;
      int numero2 = 1;
      int fibo = 1;
      
      for (int i = 1; i <= Integer.parseInt(request.getParameter("nterminos")); i++) {
        if (i < Integer.parseInt(request.getParameter("nterminos"))) {
          out.println(numero1+",");
        } else {
          out.println(numero1);
        }
        fibo = numero2+numero1;
        numero1 = numero2;
        numero2 = fibo;
      }
    %>
  </body>
</html>
