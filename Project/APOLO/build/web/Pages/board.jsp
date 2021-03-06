<%-- 
    Document   : board
    Created on : 6/12/2021, 10:01:08 PM
    Author     : juan-
--%>

<%@page import="Models.Recordatorio"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="Models.Contacto"%>
<!DOCTYPE html>
<html>

<head>
    <meta name="viewport" content="width=device-width" />
    <meta charSet="utf-8" />
    <link rel="shortcut icon" href="Resources/Icon/Apolo.png" type="image/x-icon" />
    <title>Apolo - Tablero</title>
    <meta name="next-head-count" content="4" />
    <link rel="preload" href="https://dashkit-react.vercel.app/_next/static/css/86954328a650be218e9c.css" as="style" />
    <link rel="stylesheet" href="https://dashkit-react.vercel.app/_next/static/css/341d59560d9b0642.css" data-n-g=""><noscript
        data-n-css=""></noscript>
    <script defer="" nomodule="" src="https://dashkit-react.vercel.app/_next/static/chunks/polyfills-a40ef1678bae11e696dba45124eadd70.js"></script>
    <script src="https://dashkit-react.vercel.app/_next/static/chunks/webpack-ce7125b7bd5ab36dbeae.js" defer=""></script>
    <script src="https://dashkit-react.vercel.app/_next/static/chunks/framework-4993881ebc283d7a0259.js" defer=""></script>
    <script src="https://dashkit-react.vercel.app/_next/static/chunks/main-e78a9957bb0ffbd04310.js" defer=""></script>
    <script src="https://dashkit-react.vercel.app/_next/static/chunks/pages/_app-86a21e1a0914d91e1fc0.js" defer=""></script>
    <script src="https://dashkit-react.vercel.app/_next/static/chunks/bee240a3-b9ab83e2fca9452552a1.js" defer=""></script>
    <script src="https://dashkit-react.vercel.app/_next/static/chunks/2045-860e2472fe63271542c2.js" defer=""></script>
    <script src="https://dashkit-react.vercel.app/_next/static/chunks/1572-eabc3632684afac31cf1.js" defer=""></script>
    <script src="https://dashkit-react.vercel.app/_next/static/chunks/pages/index-4f1ea3239c5878d6bcc9.js" defer=""></script>
    <script src="https://dashkit-react.vercel.app/_next/static/nrtWV97mGey8aZ6Gr9nFv/_buildManifest.js" defer=""></script>
    <script src="https://dashkit-react.vercel.app/_next/static/nrtWV97mGey8aZ6Gr9nFv/_ssgManifest.js" defer=""></script>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

    <script>
        var myModal = document.getElementById('myModal')
        var myInput = document.getElementById('myInput')

        myModal.addEventListener('shown.bs.modal', function () {
          myInput.focus()
        })     
    </script>

 <%
 
    List<Contacto> TodosContactos;
    
    TodosContactos = (List<Contacto>)request.getAttribute("TodosContactos");
    
    int numeroContactos = 0;
    ArrayList<Contacto> ContactosAdesplegar = new ArrayList<Contacto>();
    Contacto con;
    
    for(Contacto c: TodosContactos){
        con = new Contacto(
        c.getId_Contacto(),
        c.getId_Agente(),
        c.getNombre(),
        c.getApat(),
        c.getAmat(),
        c.getCorreo(),
        c.getDireccion(),
        c.getTelefono(),
        c.getEdad(),
        c.getSexo(),
        c.getEstadoCivil(),
        c.getPolizasActivas(),
        c.getAnteceFinanci(),
        c.getAntecePenal(),
        c.getAnteceMed()
        );
        
        ContactosAdesplegar.add(con);
        numeroContactos++;
        
    }
    
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
    <div id="__next">
        <nav class="navbar-vertical fixed-start navbar navbar-expand-md navbar-light">
            <div class="container-fluid"><button type="button" aria-label="Toggle navigation"
                    class="navbar-toggler collapsed"><span class="navbar-toggler-icon"></span></button><a href="board.html"
                    class="navbar-brand"><img class="navbar-brand-img" src="Resources/Images/LogoApolo.png" alt="..." /></a>
                <div class="d-md-none dropdown">
                    <div class="avatar avatar-sm avatar-online dropdown-toggle" id="react-aria5016654841-32"
                        aria-expanded="false" role="button"><img class="avatar-img rounded-circle"
                            src="Resources/Images/wicho.jpg" alt="..." /></div>
                </div>
                <div class="navbar-collapse collapse">
                    <form class="mt-4 mb-3 d-md-none">
                        <div class="input-group-merge input-group-reverse input-group-rounded input-group"><input
                                type="search" placeholder="Search" aria-label="Search" class="form-control" /><span
                                class="input-group-text"><svg width="15" height="15" viewBox="0 0 24 24" fill="none"
                                    stroke="currentColor" stroke-width="2" stroke-linecap="round"
                                    stroke-linejoin="round" class="feather feather-search ">
                                    <g>
                                        <circle cx="11" cy="11" r="8"></circle>
                                        <line x1="21" y1="21" x2="16.65" y2="16.65"></line>
                                    </g>
                                </svg></span></div>
                    </form>
                    <div>
                        <div class="navbar-nav">
                            <div class="nav-item">
                                <form action="ConsultarBoard" method="post">
                                <a  role="button" class="nav-link" tabindex="0">
                                    
                                    <svg width="17" height="17" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-home ">
                                        <g>
                                            <path d="M3 9l9-7 9 7v11a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2z"></path>
                                            <polyline points="9 22 9 12 15 12 15 22"></polyline>
                                        </g>
                                    </svg>
                                    <input type="submit" value="Inicio" >
                                </a>
                                </form>
                            </div>
                            <div class="nav-item">
                                <form action="ConsultaContactos" method="post">

                               <a role="button" class="nav-link" tabindex="0">
                                  
                                   
                                    <svg width="17" height="17" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-file ">
                                        <g>
                                            <path d="M13 2H6a2 2 0 0 0-2 2v16a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V9z"></path>
                                            <polyline points="13 2 13 9 20 9"></polyline>
                                        </g>
                                    
                                    </svg>
                                     <input type="submit" value="Agenda" >
                               </a>
                                </form>
                            </div>
                            <div class="nav-item"><a href="Pages/estadisticas.html" data-rr-ui-event-key="/widgets"
                                    class="nav-link"><svg width="17" height="17" viewBox="0 0 24 24" fill="none"
                                        stroke="currentColor" stroke-width="2" stroke-linecap="round"
                                        stroke-linejoin="round" class="feather feather-grid ">
                                        <g>
                                            <rect x="3" y="3" width="7" height="7"></rect>
                                            <rect x="14" y="3" width="7" height="7"></rect>
                                            <rect x="14" y="14" width="7" height="7"></rect>
                                            <rect x="3" y="14" width="7" height="7"></rect>
                                        </g>
                                    </svg>Estadisticas</a></div>
                            <div class="nav-item"><a href="Pages/cuenta.html" role="button" class="nav-link" tabindex="0"><svg width="17"
                                        height="17" viewBox="0 0 24 24" fill="none" stroke="currentColor"
                                        stroke-width="2" stroke-linecap="round" stroke-linejoin="round"
                                        class="feather feather-user ">
                                        <g>
                                            <path d="M20 21v-2a4 4 0 0 0-4-4H8a4 4 0 0 0-4 4v2"></path>
                                            <circle cx="12" cy="7" r="4"></circle>
                                        </g>
                                    </svg>Cuenta<svg width="1em" height="1em" viewBox="0 0 24 24" fill="none"
                                        stroke="currentColor" stroke-width="2" stroke-linecap="round"
                                        stroke-linejoin="round"
                                        class="feather feather-chevron-down ms-auto nav-chevron false">
                                    </svg></a>
                            </div>
                        </div>
                    </div>
                    <div class="mt-auto mb-md-4"></div>
                    <div class="navbar-user d-none d-md-flex"><a class="navbar-user-link" role="button">
                            <div class="icon"><svg width="17" height="17" viewBox="0 0 24 24" fill="none"
                                    stroke="currentColor" stroke-width="2" stroke-linecap="round"
                                    stroke-linejoin="round" class="feather feather-bell ">
                                    <g>
                                        <path d="M18 8A6 6 0 0 0 6 8c0 7-3 9-3 9h18s-3-2-3-9"></path>
                                        <path d="M13.73 21a2 2 0 0 1-3.46 0"></path>
                                    </g>
                                </svg></div>
                        </a>
                        <div class="dropup">
                            <div class="avatar avatar-sm avatar-online dropdown-toggle" id="react-aria5016654841-33"
                                aria-expanded="false" role="button"><img class="avatar-img rounded-circle"
                                    src="Resources/Images/perfilApolo.jpg" alt="..." /></div>
                        </div><a class="navbar-user-link" role="button">
                            <div class="icon"><svg width="17" height="17" viewBox="0 0 24 24" fill="none"
                                    stroke="currentColor" stroke-width="2" stroke-linecap="round"
                                    stroke-linejoin="round" class="feather feather-search ">
                                    <g>
                                        <circle cx="11" cy="11" r="8"></circle>
                                        <line x1="21" y1="21" x2="16.65" y2="16.65"></line>
                                    </g>
                                </svg></div>
                        </a>
                    </div>
                </div>
            </div>
        </nav>
        <div class="main-content">
            <div class="header">
                <div class="container-fluid">
                    <div class="header-body">
                        <div class="row align-items-end row">
                            <div class="col">
                                <h6 class="header-pretitle">Inicio</h6>
                                <h1 class="header-title">Tablero</h1>
                            </div>
                    </div>
                </div>
            </div>
            <div class="container-fluid">
                <div class="row">
                    <div class="col-12">
                        <div class="card">
                            <div class="card-header">
                                <h4 class="card-header-title">Citas</h4>
                            </div>
                            <div class="table-responsive">
                                <table class="table-nowrap card-table table table-sm">
                                    <thead>
                                        <tr>
                                            <th colSpan="1" title="Toggle SortBy" style="cursor:pointer"
                                                class="is-sortable">Objetivo</th>
                                            <th colSpan="1" title="Toggle SortBy" style="cursor:pointer"
                                                class="is-sortable">Prioridad</th>
                                            <th colSpan="1" title="Toggle SortBy" style="cursor:pointer"
                                                class="is-sortable">Fecha</th>
                                            <th colSpan="1" class="text-end">Cliente</th>
                                            <th colSpan="1" class="text-end"> </th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td>Comida con cliente</td>
                                            <td><span class="text-warning">?</span> <!-- -->Media</td>
                                            <td><time dateTime="2021-11-5">05/11/2021</time></td>
                                            <td class="text-end">
                                                <div class="avatar-group"><a class="avatar avatar-xs"
                                                        href="/profile-posts"><img class="avatar-img rounded-circle"
                                                            src="https://dashkit-react.vercel.app/img/avatars/profiles/avatar-1.jpg"
                                                            alt="Dianna Smiley" /> Dianna Smiley</a></div>
                                            </td>
                                            <td class="text-end">
                                                <div class="dropdown"><span class="dropdown-ellipses dropdown-toggle"
                                                        id="react-aria5016654841-38" aria-expanded="false"
                                                        role="button"><svg width="17" height="17" viewBox="0 0 24 24"
                                                            fill="none" stroke="currentColor" stroke-width="2"
                                                            stroke-linecap="round" stroke-linejoin="round"
                                                            class="feather feather-more-vertical ">
                                                            <g>
                                                                <circle cx="12" cy="12" r="1"></circle>
                                                                <circle cx="12" cy="5" r="1"></circle>
                                                                <circle cx="12" cy="19" r="1"></circle>
                                                            </g>
                                                        </svg></span></div>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>Reuni?n formal</td>
                                            <td><span class="text-warning">?</span> <!-- -->Media</td>
                                            <td><time dateTime="2018-08-26">07/11/2021</time></td>
                                            <td class="text-end">
                                                <div class="avatar-group"><a class="avatar avatar-xs"
                                                        href="/profile-posts"><img class="avatar-img rounded-circle"
                                                            src="https://dashkit-react.vercel.app/img/avatars/profiles/avatar-2.jpg"
                                                            alt="Ab Hadley" /> Ab Hadley</a>
                                            </td>
                                            <td class="text-end">
                                                <div class="dropdown"><span class="dropdown-ellipses dropdown-toggle"
                                                        id="react-aria5016654841-39" aria-expanded="false"
                                                        role="button"><svg width="17" height="17" viewBox="0 0 24 24"
                                                            fill="none" stroke="currentColor" stroke-width="2"
                                                            stroke-linecap="round" stroke-linejoin="round"
                                                            class="feather feather-more-vertical ">
                                                            <g>
                                                                <circle cx="12" cy="12" r="1"></circle>
                                                                <circle cx="12" cy="5" r="1"></circle>
                                                                <circle cx="12" cy="19" r="1"></circle>
                                                            </g>
                                                        </svg></span></div>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>Llamada para explicar el contrato</td>
                                            <td><span class="text-success">?</span> <!-- -->Baja</td>
                                            <td><time dateTime="2018-06-19">07/11/2021</time></td>
                                            <td class="text-end">
                                                <div class="avatar-group"><a class="avatar avatar-xs"
                                                        href="/profile-posts"><img class="avatar-img rounded-circle"
                                                            src="https://dashkit-react.vercel.app/img/avatars/profiles/avatar-3.jpg"
                                                            alt="Adolfo Hess" /> Adolfo Hess</a></div>
                                            </td>
                                            <td class="text-end">
                                                <div class="dropdown"><span class="dropdown-ellipses dropdown-toggle"
                                                        id="react-aria5016654841-40" aria-expanded="false"
                                                        role="button"><svg width="17" height="17" viewBox="0 0 24 24"
                                                            fill="none" stroke="currentColor" stroke-width="2"
                                                            stroke-linecap="round" stroke-linejoin="round"
                                                            class="feather feather-more-vertical ">
                                                            <g>
                                                                <circle cx="12" cy="12" r="1"></circle>
                                                                <circle cx="12" cy="5" r="1"></circle>
                                                                <circle cx="12" cy="19" r="1"></circle>
                                                            </g>
                                                        </svg></span></div>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>Renovaci?n de poliza</td>
                                            <td><span class="text-danger">?</span> <!-- -->Alta</td>
                                            <td><time dateTime="2018-06-25">07/11/2021</time></td>
                                            <td class="text-end">
                                                <div class="avatar-group"><a class="avatar avatar-xs"
                                                        href="/profile-posts"><img class="avatar-img rounded-circle"
                                                            src="https://dashkit-react.vercel.app/img/avatars/profiles/avatar-4.jpg"
                                                            alt="Ab Hadley" /> Anne Smith</a></div>
                                            </td>
                                            <td class="text-end">
                                                <div class="dropdown"><span class="dropdown-ellipses dropdown-toggle"
                                                        id="react-aria5016654841-41" aria-expanded="false"
                                                        role="button"><svg width="17" height="17" viewBox="0 0 24 24"
                                                            fill="none" stroke="currentColor" stroke-width="2"
                                                            stroke-linecap="round" stroke-linejoin="round"
                                                            class="feather feather-more-vertical ">
                                                            <g>
                                                                <circle cx="12" cy="12" r="1"></circle>
                                                                <circle cx="12" cy="5" r="1"></circle>
                                                                <circle cx="12" cy="19" r="1"></circle>
                                                            </g>
                                                        </svg></span></div>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>Videollamada para explicar poliza</td>
                                            <td><span class="text-success">?</span> <!-- -->Baja</td>
                                            <td><time dateTime="2018-06-30">07/11/2021</time></td>
                                            <td class="text-end">
                                                <div class="avatar-group"><a class="avatar avatar-xs"
                                                        href="/profile-posts"><img class="avatar-img rounded-circle"
                                                            src="https://dashkit-react.vercel.app/img/avatars/profiles/avatar-5.jpg"
                                                            alt="Daniela Dewitt" /> Johana Gordon</a></div>
                                            </td>
                                            <td class="text-end">
                                                <div class="dropdown"><span class="dropdown-ellipses dropdown-toggle"
                                                        id="react-aria5016654841-42" aria-expanded="false"
                                                        role="button"><svg width="17" height="17" viewBox="0 0 24 24"
                                                            fill="none" stroke="currentColor" stroke-width="2"
                                                            stroke-linecap="round" stroke-linejoin="round"
                                                            class="feather feather-more-vertical ">
                                                            <g>
                                                                <circle cx="12" cy="12" r="1"></circle>
                                                                <circle cx="12" cy="5" r="1"></circle>
                                                                <circle cx="12" cy="19" r="1"></circle>
                                                            </g>
                                                        </svg></span></div>
                                            </td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-xl-5 col-12">
                        <div class="card-fill card">
                            <div class="card-header">
                                <h4 class="card-header-title">Contactos reci?n a?adidos</h4>
                                <a class="small" >Ver todos</a>
                            </div>
                            <div class="card-body">
                                <div class="list-group-flush list-group-activity my-n3 list-group">
                                 
                                 <%
            
            for(int i=0; i< ContactosAdesplegar.size(); i++){
                
            Contacto contactoDespliega = ContactosAdesplegar.get(i);
            
            String imagenContacto;
                if(contactoDespliega.getSexo().equals("Masculino")){
                    imagenContacto="Resources/Images/carita-hombre.png";
                }else if(contactoDespliega.getSexo().equals("Femenino")){
                    imagenContacto="Resources/Images/carita-mujer.png";
                }else{
                    imagenContacto="Resources/Images/carita-otro.png";
                }
            
            %>
                                    
            
            
            <div class="list-group-item">
                                        <div class="row">
                                            <div class="col-auto">
                                                <div class="avatar avatar-sm avatar-online"><img
                                                        class="avatar-img rounded-circle"
                                                        src="<%out.print(imagenContacto);%>" alt="Contacto gen" />
                                                </div>
                                            </div>
                                            <div class="ms-n2 col">
                                                <h5 class="mb-1"><% out.print(contactoDespliega.getNombre()) ;%> <%out.print(contactoDespliega.getApat() );%></h5>
                                                <p class="small text-gray-700 mb-0"><% out.print(contactoDespliega.getEdad()) ;%> a?os</p><small
                                                    class="text-muted"><% out.print(contactoDespliega.getCorreo()) ; %></small>
                                            </div>
                                        </div>
                                    </div>
                                   
                                   <%
                
                }
                
                %>
                                    
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-xl-7 col-12">
                        <div class="card">
                            <div class="card-header">
                                <h4 class="card-header-title">Recordatorios</h4><span
                                    class="badge bg-secondary-soft"><% out.print(numeroRecordatorios) ;%> pendientes</span>
                            </div>
                            <div class="card-body">
                                
                                <div class="checklist" data-rbd-droppable-id="tasks" data-rbd-droppable-context-id="0">
                                
                                <%   
    
                                    for(int i=0; i< RecordatoriosAdesplegar.size(); i++){      
                                    Recordatorio recordatorioDespliega = RecordatoriosAdesplegar.get(i);  
                                %>
                                    <div class="checklist-item" data-rbd-draggable-context-id="0"
                                        data-rbd-draggable-id="task-1">
                                        <div class=""><input type="checkbox" id="task-1"
                                                class="me-3 form-check-input" /><label tabindex="0" role="button"
                                                aria-describedby="rbd-hidden-text-0-hidden-text-0"
                                                data-rbd-drag-handle-draggable-id="task-1"
                                                data-rbd-drag-handle-context-id="0" draggable="false" for="task-1"
                                                class="form-check-label"><%out.print(recordatorioDespliega.getTexto_Recordatorio() );%></label>
                                        </div>
                                    </div>
                                    
                                <% 
                                    }
                                %>
                                    
                                </div>
                            </div>
                            <div class="card-footer">
                                <div class="align-items-center row">
                                    <div class="col"><textarea placeholder="A?adir recordatorio"
                                            class="form-control-auto form-control-flush form-control"></textarea></div>
                                    <div class="col-auto">
                                        <!--<button type="button" class="btn btn-primary btn-sm">A?adir</button>-->
                                         <!-- Button trigger modal -->
                                        <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#staticBackdrop">
                                           A?adir recordatorio
                                        </button>
                                        
                                        <!-- Modal -->
                                        <div class="modal fade" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
                                          <div class="modal-dialog">
                                            <div class="modal-content">
                                              <div class="modal-header">
                                                <h5 class="modal-title" id="staticBackdropLabel">Registro de recordatorio</h5>
                                                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                              </div>
                                                <form action="altaRecordatorio" method="post">
                                              <div class="modal-body">

                                                <div class="row g-2">
                                                  
                                                    <div class="col-md">
                                                      <div class="form-floating">
                                                        <input type="text" class="form-control" id="NombreContacto" name="NombreContacto"  placeholder="Juan Beltran" >
                                                        <label for="floatingInputGrid">Nombre de contacto</label>
                                                      </div>
                                                    </div>
                                                    
                                                </div>
                                                <div class="row g-2">
                                                  
                                                    <div class="col-md">
                                                      <div class="form-floating">
                                                        <input type="date" class="form-control" id="FechaLimite" name="FechaLimite" placeholder="name@example.com" >
                                                        <label for="floatingInputGrid">Fecha limite para cumplir el recordatorio</label>
                                                      </div>
                                                    </div>
                                                    
                                                </div>
                                                <div class="row g-2">
                                                  
                                                    <div class="col-md">
                                                      <div class="form-floating">
                                                        <input type="text" class="form-control" id="TextoRecordatorio" name="TextoRecordatorio" placeholder="Renovar su poliza" >
                                                        <label for="floatingInputGrid">Escribe tu recordatorio</label>
                                                      </div>
                                                    </div>
                                                    
                                                </div>
                                                
                                              </div>
                                              <div class="modal-footer">
                                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cerrar</button>
                                                <!--<button type="button" class="btn btn-primary">Registrar</button>-->
                                                <input type="submit" value="Registrar" class="btn btn-primary" >
                                              </div>
                                                </form>
                                            </div>
                                          </div>
                                        </div>  
                                          
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
                
                
    </div>
     </body>
</html>