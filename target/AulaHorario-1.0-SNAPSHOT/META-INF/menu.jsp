<%
    String opcion = request.getParameter("opcion");
%>
<!--codigo copiado de bootstrap Tabs-->
<!--menu -->
<ul class="nav nav-tabs">
              <li class="nav-item">
                  <a class="nav-link <%=(opcion.equals("aula") ? "active" : "")%>"  href="AulaControlador">AULAS</a>
              </li>
              <li class="nav-item">
                  <a class="nav-link <%= (opcion.equals("cat_usuario") ? "active" : "")%>" href="CatControlador">CAT USUARIO</a>
              </li>
              <li class="nav-item">
                  <a class="nav-link <%= (opcion.equals("docente") ? "active" : "")%>" href="DocenteControlador">DOCENTE</a>
              </li>
              <li class="nav-item">
                  <a class="nav-link <%= (opcion.equals("horario") ? "active" : "")%>"  href="HorarioControlador">HORARIO</a>
              </li>
              <li class="nav-item">
                  <a class="nav-link <%= (opcion.equals("horas") ? "active" : "")%>"  href="HorasControlador">HORAS</a>
              </li>
              <li class="nav-item">
                  <a class="nav-link <%= (opcion.equals("mat_par") ? "active" : "")%>"  href="MatControlador">MATERIA PARALELO</a>
              </li>
                  <li class="nav-item">
                  <a class="nav-link <%= (opcion.equals("materia") ? "active" : "")%>"  href="MateriaControlador">MATERIA</a>
              </li>
              <li class="nav-item">
                  <a class="nav-link <%= (opcion.equals("paralelo") ? "active" : "")%>"  href="ParaleloControlador">PARALELO</a>
              </li>

          </ul>