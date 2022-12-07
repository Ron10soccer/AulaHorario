
package com.emergentes.controlador;

import com.emergentes.dao.CatUsuarioDAO;
import com.emergentes.dao.CatUsuarioDAOimpl;
import com.emergentes.modelo.CatUsusario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "CatControlador", urlPatterns = {"/CatControlador"})
public class CatControlador extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       try {
              
            CatUsuarioDAO dao = new CatUsuarioDAOimpl();
            int id;
            CatUsusario obj = new CatUsusario();
            String action = (request.getParameter("action") != null) ? request.getParameter("action") : "view";

            switch (action) {
                
                case "add":
                    request.setAttribute("catusuario", obj);
                    request.getRequestDispatcher("frmcatusuario.jsp").forward(request, response);
                    break;
                case "edit":
                    id = Integer.parseInt(request.getParameter("id"));
                    obj = dao.getById(id);
                    System.out.println(obj);
                    request.setAttribute("cat_ususario", obj);
                    request.getRequestDispatcher("frmcatusuario.jsp").forward(request, response);
                    break;
                case "delete":
                    id = Integer.parseInt(request.getParameter("id"));
                    dao.delete(id);
                    response.sendRedirect(request.getContextPath() + "/CatControlador");
                    break;
                
                case "view":
                    List<CatUsusario> lista = dao.getAll();
                    request.setAttribute("cat_usuario", lista);
                    request.getRequestDispatcher("cat_usuario.jsp").forward(request, response);
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
        String descripcion = request.getParameter("descripcion");

        CatUsusario obj = new CatUsusario();

        obj.setId(id);
        obj.setDescripcion(descripcion);


        if (id == 0) {
            try {
                CatUsuarioDAO dao = new CatUsuarioDAOimpl();
                dao.insert(obj);
                response.sendRedirect(request.getContextPath() + "/CatControlador");

            } catch (Exception e) {
                System.out.println("Error al insertar " + e.getMessage());
            }
        } else {
            try {
                CatUsuarioDAO dao = new CatUsuarioDAOimpl();
                dao.update(obj);
                response.sendRedirect(request.getContextPath() + "/CatControlador");

            } catch (Exception e) {
                System.out.println("Error actualizar" + e.getMessage());
            }
        }
        
       
    }

    

}
