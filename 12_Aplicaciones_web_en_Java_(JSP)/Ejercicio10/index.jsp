<%-- 
    Document   : Ejercicio10
    Created on : 02-mar-2017, 18:35:14
    Author     : adri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ejercicio10</title>
  </head>
  <body>
    <div>
    <%
      for (int i = 1; i <= 100; i++) {
        int r = ((int)(Math.random()*200)+1);
        boolean salir = false;
        boolean primo = true;
        
        for (int j = 2; j < r && !salir; j++) {
          if (r % j == 0) {
            primo = false;
            salir = true;
          }
        }
        if (primo) {
          if (i < 100) {
            out.print("<span style=\"color: red;\">"+r+", </span>");
          } else {
            out.print("<span style=\"color: red;\">"+r+"</span>");
          }
        } else {
          if (i < 100) {
            out.print(r+", ");
          } else {
            out.print(r);
          }
        }
      }
    %>
    </div>
  </body>
</html>
