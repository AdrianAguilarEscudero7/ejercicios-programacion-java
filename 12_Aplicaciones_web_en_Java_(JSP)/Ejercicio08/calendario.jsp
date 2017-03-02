<%-- 
    Document   : calendario
    Created on : 02-mar-2017, 1:08:28
    Author     : adri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Calendario</title>
  </head>
  <body>
    <table style="text-align: center; margin: auto; margin-top: 14%;" border="1" cellspacing="2" cellpadding="5">
      <%
        request.setCharacterEncoding("UTF-8");
        String[] dia = {"lunes","martes","miércoles","jueves","viernes","sábado","domingo"};
      
        out.println("<caption><b>"+request.getParameter("texto")+"</b></caption>");
        out.println("<tr><th colspan=\"3\">"+request.getParameter("mes")+"</th>");
        out.println("<th colspan=\"4\">"+request.getParameter("anio")+"</th></tr>");
        out.println("<tr><th>L</th><th>M</th><th>X</th><th>J</th><th>V</th><th>S</th><th>D</th></tr>");
        
        boolean salir = false;
        int contador = 0;
        out.print("<tr>");
        for (int i = 1; i < Integer.parseInt(request.getParameter("numdias")); i++) {
          for (int j = 0; j < dia.length && !salir; j++) {
            if (dia[j].equals(request.getParameter("dia1"))) {
              out.println("<td>"+i+"</td>");
              salir = true;
              contador++;
            } else {
              out.println("<td>&nbsp;</td>");
              contador++;
            }
            if (contador == 7) {
              out.println("</tr>");
              out.println("<tr>");
              contador = 0;
            }
          }
          if (salir = true) {
            out.println("<td>"+(i+1)+"</td>");
            contador++;
          }
          if (contador == 7) {
            out.println("</tr>");
            out.print("<tr>");
            contador = 0;
          }
        }
      %>
    </table>
  </body>
</html>
