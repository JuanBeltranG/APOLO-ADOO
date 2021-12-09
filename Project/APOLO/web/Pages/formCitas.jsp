<%@page import="Models.AgenteSeguros"%>
<%@page import="Models.Contacto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="DAO.ContactoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
        AgenteSeguros Agente= (AgenteSeguros)session.getAttribute("usuario");
        int Id_Agente = Agente.getID();
    %>
    
    <body>
        <form action="../registra_cita" method="post">
            <select type="" name="Id_Contacto" id="Id_Contacto">
                <option value="0" selected disabled>Seleccione contacto</option>
                <%
                    ContactoDAO controlador_contacto = new ContactoDAO();
                    ArrayList<Contacto> contactos = controlador_contacto.todosContactosAgente(Id_Agente);
                    for(int i = 0; i < contactos.size(); i++){
                        %>
                        <option value="<%out.print(contactos.get(i).getId_Contacto());%>"><%out.print(contactos.get(i).getNombre() + " " + contactos.get(i).getApat() + " " + contactos.get(i).getAmat());%></option>
                        <%
                    }
                %>
            </select>
            <br>
            <input type="text" name="Tipo_Cita" id="Tipo_Cita">
            <br>
            <input type="date" name="Fecha" id="Fecha">
            <br>
            <input type="text" name="Direccion_Cita" id="Direccion_Cita">
            <br>
            <input type="text" name="Proposito_Cita" id="Proposito_Cita">
            <br>
            <input type="text" name="Notas_Importantes" id="Notas_Importantes">
            <br>
            <input type="submit" name="Enviar" id="Enviar">
        </form>
    </body>
</html>
