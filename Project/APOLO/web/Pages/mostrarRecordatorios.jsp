<%-- 
    Document   : mostrarRecordatorios
    Created on : 8/12/2021, 04:52:36 PM
    Author     : danyv
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="Models.Recordatorio"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <%
        
    List<Recordatorio> TodosRecordatorios;
    
    TodosRecordatorios = (List<Recordatorio>)request.getAttribute("RecordatoriosAgente");
    
    int numeroRecordatorios = 0;
    ArrayList<Recordatorio> RecordatoriosAdesplegar = new ArrayList<Recordatorio>();
    Recordatorio rec;
    

    for(Recordatorio r: TodosRecordatorios){
        
        rec = new Recordatorio(
            r.getId_Recordatorio(),
            r.getId_Agente(),
            r.getNombre_Contacto(),
            r.getFecha_Limite(),
            r.getTexto_Recordatorio()
        );
        
        RecordatoriosAdesplegar.add(rec);
        numeroRecordatorios++;
        
    }
    
    %>
    
    </head>
    <body>
        <h1>Recordatorios</h1>
        
        <%
            
            for(int i=0; i< RecordatoriosAdesplegar.size(); i++){
                
            Recordatorio recordatorioDespliega = RecordatoriosAdesplegar.get(i);
            
            
        %>
        <p><%out.print(recordatorioDespliega.getTexto_Recordatorio() );%></p>
        <% 
            }
            
            
            
            
        %>
    </body>
</html>
