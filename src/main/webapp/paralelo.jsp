<%
    if(session.getAttribute("login") != "ok"){
        response.sendRedirect("login.jsp");
    }
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta<meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" rel="stylesheet">
    <!--bootstrap-->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
          <h1>AULAS</h1>
          <jsp:include page="META-INF/menu.jsp" >
          <jsp:param name="opcion" value="´paralelo" />
          </jsp:include>
          <br>
          <a href="ParaleloControlador?action=add" class="btn btn-primary btn-sm"><i class="fas fa-plus-circle"></i>Nuevo</a>
          <table class="table table-striped"><!--botstrap tabla -->
              <tr>
                  <th>Id</th>
                  <th>Nombre Paralelo</th>
                  
                  
                  <th></th>
                  <th></th>
                  
              </tr>
              <c:forEach var="item" items="${paralelo}">
                  <tr>
                  <td>${item.id}</td>
                  <td>${item.nombre_paralelo}</td>
                  
                  
                  <td><a href="ParaleloControlador?action=edit&id=${item.id}"><i class="fa-solid fa-file-pen"></i></a> </td>
                  <td><a href="ParaleloControlador?action=delete&id=${item.id}" onclick="return(confirm('Esta seguro de Eliminar'))">
                          <i class="fa-solid fa-eraser">
                              
                          </i>
                      </a>
                  </td>
              </tr>
                  
                  
              </c:forEach>
              
              
          </table>
      </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
    </body>
</html>