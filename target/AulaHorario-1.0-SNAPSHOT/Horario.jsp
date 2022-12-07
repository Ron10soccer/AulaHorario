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
          <h1>HORARIO</h1>
          <jsp:include page="META-INF/menu.jsp" >
          <jsp:param name="opcion" value="horario" />
          </jsp:include>
          <br>
          <a href="HorarioControlador?action=add"  class="btn btn-primary btn-sm"><i class="fas fa-plus-circle"></i>Nuevo</a>
          <table class="table table-striped"><!--botstrap tabla -->
              <tr>
                  <th>Id</th>
                  <th>Gestion</th>
                  <th>Turno</th>
                  <th>Dia</th>
                  <th>Id Horas</th>
                  <th>Id Aula</th>
                  <th>Id Materia P</th>
                  <th>Id Docente</th>
                  
                  <th></th>
                  <th></th>
                  
                  
              </tr>
              <c:forEach var="item" items="${list_ob}">
              
              <tr>
                   <td>${item.id}</td>
                        <td>${item.gestion}</td>
                        <td>${item.turno}</td>
                        <td>${item.dia}</td>
                        <td>${item.paralelo}</td>
                        <td>${item.docente}</td>
                   <td>
                            <c:forEach var="item2" items="${lista_aulas}">
                                <c:if test="${item.id_aula == item2.id}">
                                    ${item2.descripcion}  
                                </c:if>
                            </c:forEach>
                        </td>
                        
                        <td>${item.dia}</td>

                        <td>
                            <c:forEach var="item2" items="${lista_horas}">
                                <c:if test="${item.id_horas == item2.id}">
                                    ${item2.rango}  
                                </c:if>
                            </c:forEach>
                        </td>
                        
                        <td>${item.turno}</td>
                        <td>${item.gestion}</td>

                  <td><a href="HorarioControlador?action=edit&id=${item.id}"><i class="fa-solid fa-file-pen"></i></a> </td>
                  <td><a href="HorarioControlador?action=delete&id=${item.id}" onclick="return(confirm('Esta seguro de eliminar??'))"><i class="fa-solid fa-eraser"></i></a></td>
              </tr>
              </c:forEach>
          </table>
      </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
    </body>
