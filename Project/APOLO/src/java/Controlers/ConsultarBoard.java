/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlers;

import DAO.ContactoDAO;
import DAO.RecordatoriosDAO;
import Models.AgenteSeguros;
import Models.Contacto;
import Models.Recordatorio;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author juan-
 */
@WebServlet(name = "ConsultarBoard", urlPatterns = {"/ConsultarBoard"})
public class ConsultarBoard extends HttpServlet {

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
            out.println("<title>Servlet ConsultarBoard</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ConsultarBoard at " + request.getContextPath() + "</h1>");
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
        
         HttpSession session = request.getSession(true);
        AgenteSeguros Agente= (AgenteSeguros)session.getAttribute("usuario");
        
        ContactoDAO metodosContacto = new ContactoDAO();
        RecordatoriosDAO metodosRecordatorio = new RecordatoriosDAO(); 
        
        List<Recordatorio> RecordatoriosAgente = metodosRecordatorio.ConsultarRecordatorios(Agente.getID());
        request.setAttribute("RecordatoriosAgente", RecordatoriosAgente);
        
        List<Contacto> ContactosAgente = metodosContacto.ConsultaContactos(Agente.getID());
        request.setAttribute("TodosContactos", ContactosAgente);
        
        request.getRequestDispatcher("Pages/board.jsp").forward(request, response);
        
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
        
         
        HttpSession session = request.getSession(true);
        AgenteSeguros Agente= (AgenteSeguros)session.getAttribute("usuario");
        
        ContactoDAO metodosContacto = new ContactoDAO();
        RecordatoriosDAO metodosRecordatorio = new RecordatoriosDAO(); 
        
        List<Recordatorio> RecordatoriosAgente = metodosRecordatorio.ConsultarRecordatorios(Agente.getID());
        request.setAttribute("RecordatoriosAgente", RecordatoriosAgente);
        
       List<Contacto> ContactosAgente = metodosContacto.ConsultaContactos(Agente.getID());
        request.setAttribute("TodosContactos", ContactosAgente);
        
        request.getRequestDispatcher("Pages/board.jsp").forward(request, response);
        
        
        
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
