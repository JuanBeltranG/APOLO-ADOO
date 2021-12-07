/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlers;

import DAO.CitaDAO;
import Extras.String_a_Date;
import Models.Cita;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author devil
 */
@WebServlet(name = "registra_cita", urlPatterns = {"/registra_cita"})
public class registra_cita extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet registra_cita</title>");
            out.println("<script>\n" +
"            function presiona1(){\n" +
"                setTimeout(function (){\n" +
"                    window.location.replace('form_citas.jsp');\n" +
"                },0);\n" +
"            }\n" +
"            function presiona2(){\n" +
"                setTimeout(function (){\n" +
"                    window.history.back();\n" +
"                },0);\n" +
"            }\n" +
"        </script>");
            out.println("</head>");
            out.println("<body>");
            
            String_a_Date convertidor_fecha = new String_a_Date();
            HttpSession datos_sesion = request.getSession();
            
            int Id_Agente = (int) datos_sesion.getAttribute("Id_Agente");
            int Id_Contacto = Integer.parseInt(request.getParameter("Id_Contacto"));
            String Tipo_Cita = request.getParameter("Tipo_Cita");
            Date Fecha = convertidor_fecha.covertir(request.getParameter("Fecha"));
            String Direccion_Cita = request.getParameter("Direccion_Cita");
            String Proposito_Cita = request.getParameter("Proposito_Cita");
            String Notas_Importantes = request.getParameter("Notas_Importantes");
            
            Cita nueva_cita = new Cita(0, Id_Contacto, Id_Agente, Tipo_Cita, Fecha, Direccion_Cita, Proposito_Cita, Notas_Importantes);
            
            CitaDAO controlador_cita = new CitaDAO();
            
            int flag = controlador_cita.registraCita(nueva_cita);
            
            if(flag == 0){
                out.println("<script>alert('Error al registrar la cita');</script>");
                out.print("<Script>presiona2();</Script>");
            }
            else{
                out.println("<script>alert('Cita Registrada');</script>");
                out.print("<Script>presiona1();</Script>");
            }
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
