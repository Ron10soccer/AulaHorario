
package com.emergentes.controlador;

import com.emergentes.dao.Mat_ParDAO;
import com.emergentes.dao.Mat_ParDAOimpl;
import com.emergentes.dao.MateriaDAO;
import com.emergentes.dao.MateriaDAOimpl;
import com.emergentes.dao.ParaleloDAO;
import com.emergentes.dao.ParaleloDAOimpl;
import com.emergentes.modelo.Mat_Par;
import com.emergentes.modelo.Materia;
import com.emergentes.modelo.Paralelo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "MatControlador", urlPatterns = {"/MatControlador"})
public class MatControlador extends HttpServlet {

   
   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         try {
            Mat_ParDAO dao = new Mat_ParDAOimpl();
            MateriaDAO daoMat = new MateriaDAOimpl();
            ParaleloDAO daoPar = new ParaleloDAOimpl();
            
            Mat_Par mp = new Mat_Par();
            int id;

            List<Materia> lista_materia = null;
            List<Paralelo> lista_paralelo = null;
            

            String action = (request.getParameter("action") != null) ? request.getParameter("action") : "view";

            switch (action) {
                case "add":
                    lista_materia = daoMat.getAll();
                    lista_paralelo = daoPar.getAll();
        
                    //Enviar lista
                    request.setAttribute("lista_materia", lista_materia);
                    request.setAttribute("lista_paralelo", lista_paralelo);
                    
                    request.setAttribute("matparalelo", mp);
                    request.getRequestDispatcher("frmmatparalelo.jsp").forward(request, response);
                    break;
                case "edit":
                    id = Integer.parseInt(request.getParameter("id"));
                    mp = dao.getById(id);

                    lista_materia = daoMat.getAll();
                    lista_paralelo = daoPar.getAll();
                    

                    request.setAttribute("lista_materia", lista_materia);
                    request.setAttribute("lista_paralelo", lista_paralelo);
                    

                    request.setAttribute("matparalelo", mp);
                    request.getRequestDispatcher("frmmatparalelo.jsp").forward(request, response);
                    break;
                case "delete":
                    id = Integer.parseInt(request.getParameter("id"));
                    dao.delete(id);
                    response.sendRedirect("MatControlador");
                    break;
                case "view":
                    // Obtener la lista de registros
                    List<Mat_Par> lista = dao.getAll();
                    
                     lista_materia = daoMat.getAll();
                    lista_paralelo = daoPar.getAll();
                    
                    //Enviar lista
                    request.setAttribute("lista_materia", lista_materia);
                    request.setAttribute("lista_paralelo", lista_paralelo);
                    
                    request.setAttribute("matparalelos", lista);
                    request.getRequestDispatcher("matparalelo.jsp").forward(request, response);
                    break;
            }

        } catch (Exception ex) {
            System.out.println("Error " + ex.getMessage());
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        int id_materia = Integer.parseInt(request.getParameter("id_materia"));
        int id_paralelo = Integer.parseInt(request.getParameter("id_paralelo"));
        

        Mat_Par mp = new Mat_Par();

       mp.setId(id);
       mp.setId_materia(id_materia);
       mp.setId_paralelo(id_paralelo);


        if (id == 0) {
            Mat_ParDAO dao = new Mat_ParDAOimpl();
            try {
                // Nuevo registro

                dao.insert(mp);
                response.sendRedirect("MatControlador");
            } catch (Exception ex) {
                System.out.println("Error al insertar " + ex.getMessage());
            }
        } else {
            Mat_ParDAO dao = new Mat_ParDAOimpl();
            try {
                // Edicion de registro
                dao.update(mp);
                response.sendRedirect("MatControlador");
            } catch (Exception ex) {
                System.out.println("Error al editar " + ex.getMessage());
            }
        }
        
    }

}
