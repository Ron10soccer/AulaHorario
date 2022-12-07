/*Ojo Revisar*/
package com.emergentes.controlador;

import com.emergentes.dao.AulaDAO;
import com.emergentes.dao.AulaDAOimpl;
import com.emergentes.dao.DocenteDAO;
import com.emergentes.dao.DocenteDAOimpl;
import com.emergentes.dao.HorarioDAO;
import com.emergentes.dao.HorarioDAOimpl;
import com.emergentes.dao.HorasDAO;
import com.emergentes.dao.HorasDAOimpl;
import com.emergentes.dao.Mat_ParDAO;
import com.emergentes.dao.Mat_ParDAOimpl;
import com.emergentes.modelo.Aula;
import com.emergentes.modelo.Docente;
import com.emergentes.modelo.Horario;
import com.emergentes.modelo.Horas;
import com.emergentes.modelo.Mat_Par;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "HorarioControlador", urlPatterns = {"/HorarioControlador"})
public class HorarioControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            Mat_ParDAO dao_matpar = new Mat_ParDAOimpl();
            List<Mat_Par> lista_matpar;

            HorasDAO dao_horas = new HorasDAOimpl();
            List<Horas> lista_horas;

            AulaDAO dao_aula = new AulaDAOimpl();
            List<Aula> lista_aulas;

            DocenteDAO dao_docente = new DocenteDAOimpl();
            List<Docente> lista_docentes;

            HorarioDAO dao = new HorarioDAOimpl();
            int id;
            Horario obj = new Horario();
            String action = (request.getParameter("action") != null) ? request.getParameter("action") : "view";

            switch (action) {

                case "add":
                    lista_matpar = dao_matpar.getAll();
                    request.setAttribute("lista_matpar", lista_matpar);
                    lista_horas = dao_horas.getAll();
                    request.setAttribute("lista_horas", lista_horas);
                    lista_aulas = dao_aula.getAll();
                    request.setAttribute("lista_aulas", lista_aulas);
                    lista_docentes = dao_docente.getAll();
                    request.setAttribute("lista_docentes", lista_docentes);

                    request.setAttribute("objeto", obj);
                    request.getRequestDispatcher("frmhorario.jsp").forward(request, response);
                    break;
                case "edit":
                    lista_matpar = dao_matpar.getAll();
                    request.setAttribute("lista_matpar", lista_matpar);
                    lista_horas = dao_horas.getAll();
                    request.setAttribute("lista_horas", lista_horas);
                    lista_aulas = dao_aula.getAll();
                    request.setAttribute("lista_aulas", lista_aulas);
                    lista_docentes = dao_docente.getAll();
                    request.setAttribute("lista_docentes", lista_docentes);

                    id = Integer.parseInt(request.getParameter("id"));
                    obj = dao.getById(id);
                    System.out.println(obj);
                    request.setAttribute("objeto", obj);
                    request.getRequestDispatcher("frmhorario.jsp").forward(request, response);
                    break;
                case "delete":
                    id = Integer.parseInt(request.getParameter("id"));
                    dao.delete(id);
                    response.sendRedirect(request.getContextPath() + "/HorarioControlador");
                    break;

                case "view":
                    lista_matpar = dao_matpar.getAll();
                    request.setAttribute("lista_matpar", lista_matpar);
                    lista_horas = dao_horas.getAll();
                    request.setAttribute("lista_horas", lista_horas);
                    lista_aulas = dao_aula.getAll();
                    request.setAttribute("lista_aulas", lista_aulas);
                    lista_docentes = dao_docente.getAll();
                    request.setAttribute("lista_docentes", lista_docentes);

                    List<Horario> lista = dao.getAll();
                    request.setAttribute("list_obj", lista);
                    request.getRequestDispatcher("Horario.jsp").forward(request, response);
                    break;

                case "view2":
                    lista_matpar = dao_matpar.getAll();
                    request.setAttribute("lista_matpar", lista_matpar);
                    lista_horas = dao_horas.getAll();
                    request.setAttribute("lista_horas", lista_horas);
                    lista_aulas = dao_aula.getAll();
                    request.setAttribute("lista_aulas", lista_aulas);
                    lista_docentes = dao_docente.getAll();
                    request.setAttribute("lista_docentes", lista_docentes);

                    List<Horario> lista2 = dao.getAll_dias_horas();
                    request.setAttribute("list_obj", lista2);
                    request.getRequestDispatcher("Horario.jsp").forward(request, response);
                    break;

                case "view3":
                    lista_matpar = dao_matpar.getAll();
                    request.setAttribute("lista_matpar", lista_matpar);
                    lista_horas = dao_horas.getAll();
                    request.setAttribute("lista_horas", lista_horas);
                    lista_aulas = dao_aula.getAll();
                    request.setAttribute("lista_aulas", lista_aulas);
                    lista_docentes = dao_docente.getAll();
                    request.setAttribute("lista_docentes", lista_docentes);

                    List<Horario> lista3 = dao.getAll_aulas();
                    request.setAttribute("list_obj", lista3);
                    request.getRequestDispatcher("Horario.jsp").forward(request, response);
                    break;

                case "view4":
                    lista_matpar = dao_matpar.getAll();
                    request.setAttribute("lista_matpar", lista_matpar);
                    lista_horas = dao_horas.getAll();
                    request.setAttribute("lista_horas", lista_horas);
                    lista_aulas = dao_aula.getAll();
                    request.setAttribute("lista_aulas", lista_aulas);
                    lista_docentes = dao_docente.getAll();
                    request.setAttribute("lista_docentes", lista_docentes);

                    List<Horario> lista4 = dao.getAll_docentes();
                    request.setAttribute("list_obj", lista4);
                    request.getRequestDispatcher("Horario.jsp").forward(request, response);
                    break;

            }

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String gestion = request.getParameter("gestion");
        String turno = request.getParameter("turno");
        String dia = request.getParameter("dia");
        int id_horas = Integer.parseInt(request.getParameter("id_horas"));
        int id_aula = Integer.parseInt(request.getParameter("id_aula"));
        int id_mat_par = Integer.parseInt(request.getParameter("id_mat_par"));
        int id_docente = Integer.parseInt(request.getParameter("id_docente"));

        Horario obj = new Horario();

        obj.setId(id);
        obj.setGestion(gestion);
        obj.setTurno(turno);
        obj.setDia(dia);
        obj.setId_horas(id_horas);
        obj.setId_aula(id_aula);
        obj.setId_mat_par(id_mat_par);
        obj.setId_docente(id_docente);

        if (id == 0) {
            try {
                HorarioDAO dao = new HorarioDAOimpl();
                dao.insert(obj);
                response.sendRedirect(request.getContextPath() + "/HorarioControlador");

            } catch (Exception e) {
                System.out.println("Error al insertar " + e.getMessage());
            }
        } else {
            try {
                HorarioDAO dao = new HorarioDAOimpl();
                dao.update(obj);
                response.sendRedirect(request.getContextPath() + "/HorarioControlador");

            } catch (Exception e) {
                System.out.println("Error actualizar" + e.getMessage());
            }
        }
    }

}
