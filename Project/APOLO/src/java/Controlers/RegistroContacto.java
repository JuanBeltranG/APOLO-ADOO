/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlers;

import DAO.ContactoDAO;
import Models.AgenteSeguros;
import Models.Contacto;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "RegistroContacto", urlPatterns = {"/RegistroContacto"})
public class RegistroContacto extends HttpServlet {

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
            out.println("<title>Servlet RegistroContacto</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegistroContacto at " + request.getContextPath() + "</h1>");
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
        
        
        
        //Obtenemos los datos provenientes del formulario 
        String Nombre= request.getParameter("Nombre"); 
        String Apat= request.getParameter("ApellidoP"); 
        String Amat= request.getParameter("ApellidoM"); 
        
        String Correo = request.getParameter("Correo");
        String Direccion = request.getParameter("Direccion");
        String Telefono = request.getParameter("Telefono");
        int edad = Integer.parseInt(request.getParameter("Edad"));
        String Sexo = request.getParameter("Sexo");
        String EstadoCivil = request.getParameter("Estado_Civil");
        int PolizasActivas = Integer.parseInt(request.getParameter("Polizas_Activas"));
        String AnteceFinanci = request.getParameter("Antecedentes_Financieros");
        String AntecePenal = request.getParameter("Antecedentes_Penales");
        String AnteceMed = request.getParameter("Antecedentes_Medicos");
        
        
        Contacto ContactoGuardar = new Contacto(Nombre, Apat,Amat, Correo, Direccion,Telefono, edad,Sexo,EstadoCivil,PolizasActivas,AnteceFinanci,AntecePenal,AnteceMed );
        
        ContactoDAO metodosContacto = new ContactoDAO();
        
        //Obtenemos el correo del agente de seguros que ya estaba previamente cargado en la sesion
        HttpSession session = request.getSession(true);
        AgenteSeguros Agente= (AgenteSeguros)session.getAttribute("usuario");
        
        //Guardamos el nuevo contacto
        boolean RegistroExitoso = metodosContacto.AltaContacto(Agente.getCorreo(), ContactoGuardar);
        
        if(RegistroExitoso){
            
            try (PrintWriter out = response.getWriter()) {
               out.println("<script>alert('Se registro exitosamente al contacto');window.location = 'Pages/board.html'; </script>");
            }
            
            request.getRequestDispatcher("Pages/board.html").forward(request, response);
            //response.sendRedirect("ConsultaContactos");
            
            
        }else{
            
            try (PrintWriter out = response.getWriter()) {
                out.println("<script>alert('Parece que ocurrio un error, intenta mas tarde');window.location = 'Pages/agenda.html'; </script>");
            }
            
            request.getRequestDispatcher("Pages/agenda.html").forward(request, response); 
            
            
            
        }
        
        
        
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
