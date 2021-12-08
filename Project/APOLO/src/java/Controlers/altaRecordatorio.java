/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlers;

import DAO.RecordatoriosDAO;
import Extras.String_a_Date;
import Models.AgenteSeguros;
import Models.Recordatorio;
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
 * @author danyv
 */
@WebServlet(name = "altaRecordatorio", urlPatterns = {"/altaRecordatorio"})
public class altaRecordatorio extends HttpServlet {

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
            out.println("<title>Servlet altaRecordatorio</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet altaRecordatorio at " + request.getContextPath() + "</h1>");
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
        
        String_a_Date convertidor_fecha = new String_a_Date();
        
        String NombreContacto= request.getParameter("NombreContacto"); 
        Date FechaLimite = convertidor_fecha.covertir(request.getParameter("FechaLimite"));
        String TextoRecordatorio= request.getParameter("TextoRecordatorio"); 
        
        //Obtenemos el correo del agente de seguros que ya estaba previamente cargado en la sesion
        HttpSession session = request.getSession(true);
        AgenteSeguros Agente= (AgenteSeguros)session.getAttribute("usuario");
        
        int Id_Agente = Agente.getID();
        
        Recordatorio nuevoRecordatorio = new Recordatorio(Id_Agente, NombreContacto, FechaLimite, TextoRecordatorio);
        RecordatoriosDAO metodosRecordatorio = new RecordatoriosDAO();
        boolean registroExitoso = metodosRecordatorio.AltaRecordatorio(nuevoRecordatorio);
        
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
