/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlers;

import DAO.AgenteSegurosDAO;
import Models.AgenteSeguros;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
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
@WebServlet(name = "UserLogin", urlPatterns = {"/UserLogin"})
public class UserLogin extends HttpServlet {

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
            out.println("<title>Servlet UserLogin</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UserLogin at " + request.getContextPath() + "</h1>");
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
        
        String Correo= request.getParameter("Correo"); 
        String Contra= request.getParameter("Contra");
        
        AgenteSegurosDAO consultaAgente = new AgenteSegurosDAO();
        
        boolean registrado= consultaAgente.ConsultaUsuarioRegistrado(Correo, Contra);
        
        if(registrado){
            
            /*Iniciamos sesion*/
            AgenteSeguros agenteLogeado = consultaAgente.ConsultaAgente(Correo, Contra);
            HttpSession session = request.getSession(true);
            session.setAttribute("usuario", agenteLogeado);
            
            
            
            try (PrintWriter out = response.getWriter()) {
                out.println("<script>alert('Bienvenido "+agenteLogeado.getNombre()+"');window.location = 'ConsultarBoard'; </script>");
            }
            
            // response.sendRedirect("ConsultarBoard");
            //request.getRequestDispatcher("Pages/board.html").forward(request, response); 
            
        }else{
            
            try (PrintWriter out = response.getWriter()) {
                out.println("<script>alert('El correo o contraseña no son validos');window.location = 'Pages/LogIn.html'; </script>");

            }
            request.getRequestDispatcher("Pages/LogIn.html").forward(request, response); 
        }
        
        
        
        
        
        
        
        
        
        
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
