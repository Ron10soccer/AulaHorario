%<@page contentType="text/html" pageEncoding="UTF-8"%>
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
          <h1>Punto de opciones</h1>
          <jsp:include page="META-INF/menu.jsp" >
          <jsp:param name="opcion" value="mat_par" />
          </jsp:include>
          <br>
          <form action="MatControlador" method="post">
              <input type="hidden" name="id" value="${docente.id}">
              
              <div class="mb-3">
                  <label for="" class="form-label" >Nombre</label>
                  <input type="text" class="form-control" name="descripcion" value="${docente.nombre}" placeholder="Escriba La Descripcion">
              </div>
              
              <div class="mb-3">
                  <label for="" class="form-label">apellido</label>
                  <input type="text" class="form-control" name="ubicacion" value="${docente.apellido}" placeholder="Escriba La Ubicacion"">
              </div>
              
              <div class="mb-3">
                  <label for="" class="form-label">Grado De Estudio</label>
                  <input type="text" class="form-control" name="ubicacion" value="${docente.grado_estudio}" placeholder="Escriba La Ubicacion"">
              </div>
             
              <button type="submit" class="btn btn-primary">Submit</button>
          </form>
      </div>


    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
    </body>
</html>

