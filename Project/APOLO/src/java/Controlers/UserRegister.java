
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
@WebServlet(name = "UserRegister", urlPatterns = {"/UserRegister"})
public class UserRegister extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UserRegister</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UserRegister at " + request.getContextPath() + "</h1>");
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
        
        
        String NombreAgente= request.getParameter("Nombre"); 
        String CorreoAgente= request.getParameter("Correo"); 
        String ContraAgente= request.getParameter("Contra"); 
        String TelefonoAgente = request.getParameter("Telefono");
        
        
        AgenteSeguros GuardaAgente = new AgenteSeguros(NombreAgente, CorreoAgente,ContraAgente, TelefonoAgente);
        
        AgenteSegurosDAO metodosAgente = new AgenteSegurosDAO();
        
        boolean altaExitosa = metodosAgente.AltaAgente(GuardaAgente);
        
        if(altaExitosa){
            
            AgenteSegurosDAO consultaAgente = new AgenteSegurosDAO();
            /*Iniciamos sesion*/
            AgenteSeguros agenteLogeado = consultaAgente.ConsultaAgente(CorreoAgente, ContraAgente);
            HttpSession session = request.getSession(true);
            session.setAttribute("usuario", agenteLogeado);
            
            try (PrintWriter out = response.getWriter()) {
               out.println("<script>alert('Registro exitoso');window.location = 'Pages/cuenta.html'; </script>");
            }
            
            
        }
        
        
        
        
        processRequest(request, response);
    }

    
    
    
    
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
