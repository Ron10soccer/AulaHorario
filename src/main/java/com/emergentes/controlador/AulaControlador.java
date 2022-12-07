
package com.emergentes.controlador;

import com.emergentes.dao.AulaDAO;
import com.emergentes.dao.AulaDAOimpl;
import com.emergentes.modelo.Aula;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "AulaControlador", urlPatterns = {"/AulaControlador"})
public class AulaControlador extends HttpServlet {


    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         try{
              Aula cli = new Aula();
            int id;
             Aula au = new Aula();
            AulaDAO dao = new AulaDAOimpl();
            //evaluador de parametro
            String action = (request.getParameter("action") !=null) ? request.getParameter("action") : "view" ;
        
            switch (action){
                case "add":
                    request.setAttribute("Aula", au);
                    request.getRequestDispatcher("frmaula.jsp").forward(request, response);
                    
                break;
                case "edit":
                    id = Integer.parseInt(request.getParameter("id"));
                    cli = dao.getById(id);
                    request.setAttribute("Aula", cli);
                    request.getRequestDispatcher("frmaula.jsp").forward(request, response);
                
                break;
                case "delete":
                     id = Integer.parseInt(request.getParameter("id"));
                    dao.delete(id);
                    response.sendRedirect("AulaControlador");
                break;
                case "view":
                    //obtener lista de objetos"registros"
                    List<Aula> lista = dao.getAll();
                    request.setAttribute("aula", lista);
                    request.getRequestDispatcher("aula.jsp").forward(request, response);
                break;
                
            }
        }catch(Exception ex){
            System.out.println("Error "+ ex.getMessage());
        }
      }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         int id = Integer.parseInt(request.getParameter("id"));
        
        String descripcion = request.getParameter("descripcion");
        String ubicacion = request.getParameter("ubicacion");
        
        
        Aula cli = new Aula ();
        cli.setDescripcion(descripcion);
        cli.setUbicacion(ubicacion);
        
        AulaDAO dao = new AulaDAOimpl();
        if(id == 0){
            try {
                //Nuevo registro

                dao.insert(cli);
            } catch (Exception ex) {
                System.out.println("Error al insertar "+ ex.getMessage());
            }
        }else{
            try {
                //edicion de registro
                dao.update(cli);
            } catch (Exception ex) {
                System.out.println("Error al editar "+ ex.getMessage());
            }
            response.sendRedirect("ClienteControlador");
        }
        }

    

}
