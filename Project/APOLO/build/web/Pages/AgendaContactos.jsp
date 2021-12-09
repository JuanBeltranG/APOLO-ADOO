<%-- 
    Document   : AgendaContactos
    Created on : 7/12/2021, 02:32:18 AM
    Author     : juan-
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="Models.Contacto"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                            src="/img/avatars/profiles/avatar-1.jpg" alt="..." /></div>
                </div>
                <div class="navbar-collapse collapse">
                    <form class="mt-4 mb-3 d-md-none">
                        <div class="input-group-merge input-group-reverse input-group-rounded input-group"><input
                                type="search" placeholder="Search" aria-label="search" class="form-control" /><span
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
            <div class="container-fluid">
                <div class="justify-content-center row">
                    <div class="col-12">
                        <div class="header">
                            <div class="header-body">
                                <div class="align-items-center row">
                                    <div class="col">
                                        <h1 class="header-title text-truncate">Contactos</h1>
                                    </div>
                                    <div class="col-auto">
                                        <div role="group" class="nav d-inline-flex btn-group">
                                                    
                                        </div>
                                        <a href="Pages/contactos.jsp">
                                        <button type="button" class="ms-2 btn btn-primary">Añadir contacto</button>
                                        </a>
                                    </div>
                                </div>
                                <div class="align-items-center row">
                                    <div class="col">
                                        <div class="header-tabs nav-overflow nav nav-tabs">
                                            <div class="nav-item"><a role="button" class="text-nowrap nav-link active"
                                                    tabindex="0">Mostrar todos los contactos
                                                    <!-- --> <span
                                                        class="rounded-pill badge bg-secondary-soft">8</span>
                                                </a></div>
                                            <div class="nav-item"><a role="button" class="text-nowrap nav-link"
                                                    tabindex="0">Eliminados
                                                    <!-- --> <span
                                                        class="rounded-pill badge bg-secondary-soft">0</span>
                                                </a></div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="card">
                            <div class="card-header">
                                <div class="align-items-center row">
                                    <div class="col">
                                        <div
                                            class="input-group-merge input-group-flush input-group-reverse input-group">
                                            <input type="search" placeholder="Buscar" class="form-control" /><span
                                                class="input-group-text"><svg width="1em" height="1em"
                                                    viewBox="0 0 24 24" fill="none" stroke="currentColor"
                                                    stroke-width="2" stroke-linecap="round" stroke-linejoin="round"
                                                    class="feather feather-search ">
                                                    <g>
                                                        <circle cx="11" cy="11" r="8"></circle>
                                                        <line x1="21" y1="21" x2="16.65" y2="16.65"></line>
                                                    </g>
                                                </svg></span></div>
                                    </div>
                                    <div class="me-n3 col-auto">
                                        <style data-emotion="css b62m3t-container">
                                            .css-b62m3t-container {
                                                position: relative;
                                                box-sizing: border-box;
                                            }
                                        </style>
                                        <div class=" css-b62m3t-container">
                                            <style data-emotion="css 7pg0cj-a11yText">
                                                .css-7pg0cj-a11yText {
                                                    z-index: 9999;
                                                    border: 0;
                                                    clip: rect(1px, 1px, 1px, 1px);
                                                    height: 1px;
                                                    width: 1px;
                                                    position: absolute;
                                                    overflow: hidden;
                                                    padding: 0;
                                                    white-space: nowrap;
                                                }
                                            </style><span id="react-select-3-live-region"
                                                class="css-7pg0cj-a11yText"></span><span aria-live="polite"
                                                aria-atomic="false" aria-relevant="additions text"
                                                class="css-7pg0cj-a11yText"></span>
                                            <div
                                                class="form-control-flush form-select form-select-sm select__control css-0">
                                                <div class="select__value-container css-0">
                                                    <div class="select__placeholder css-0"
                                                        id="react-select-3-placeholder">Seleccionar...</div>
                                                    <style data-emotion="css 1hac4vs-dummyInput">
                                                        .css-1hac4vs-dummyInput {
                                                            background: 0;
                                                            border: 0;
                                                            caret-color: transparent;
                                                            font-size: inherit;
                                                            grid-area: 1/1/2/3;
                                                            outline: 0;
                                                            padding: 0;
                                                            width: 1px;
                                                            color: transparent;
                                                            left: -100px;
                                                            opacity: 0;
                                                            position: relative;
                                                            -webkit-transform: scale(.01);
                                                            -moz-transform: scale(.01);
                                                            -ms-transform: scale(.01);
                                                            transform: scale(.01);
                                                        }
                                                    </style><input id="react-select-3-input" tabindex="0"
                                                        inputMode="none" value="" aria-autocomplete="list"
                                                        aria-expanded="false" aria-haspopup="true"
                                                        aria-controls="react-select-3-listbox"
                                                        aria-owns="react-select-3-listbox" role="combobox"
                                                        aria-readonly="true"
                                                        aria-describedby="react-select-3-placeholder"
                                                        class="css-1hac4vs-dummyInput" />
                                                </div>
                                                <div class="select__indicators css-0">
                                                    <style data-emotion="css 1okebmr-indicatorSeparator">
                                                        .css-1okebmr-indicatorSeparator {
                                                            -webkit-align-self: stretch;
                                                            -ms-flex-item-align: stretch;
                                                            align-self: stretch;
                                                            background-color: hsl(0, 0%, 80%);
                                                            margin-bottom: 8px;
                                                            margin-top: 8px;
                                                            width: 1px;
                                                            box-sizing: border-box;
                                                        }
                                                    </style><span
                                                        class="select__indicator-separator css-1okebmr-indicatorSeparator"></span>
                                                    <style data-emotion="css tlfecz-indicatorContainer">
                                                        .css-tlfecz-indicatorContainer {
                                                            color: hsl(0, 0%, 80%);
                                                            display: -webkit-box;
                                                            display: -webkit-flex;
                                                            display: -ms-flexbox;
                                                            display: flex;
                                                            padding: 8px;
                                                            -webkit-transition: color 150ms;
                                                            transition: color 150ms;
                                                            box-sizing: border-box;
                                                        }

                                                        .css-tlfecz-indicatorContainer:hover {
                                                            color: hsl(0, 0%, 60%);
                                                        }
                                                    </style>
                                                    <div class="select__indicator select__dropdown-indicator css-tlfecz-indicatorContainer"
                                                        aria-hidden="true">
                                                        <style data-emotion="css 8mmkcg">
                                                            .css-8mmkcg {
                                                                display: inline-block;
                                                                fill: currentColor;
                                                                line-height: 1;
                                                                stroke: currentColor;
                                                                stroke-width: 0;
                                                            }
                                                        </style><svg height="20" width="20" viewBox="0 0 20 20"
                                                            aria-hidden="true" focusable="false" class="css-8mmkcg">
                                                            <path
                                                                d="M4.516 7.548c0.436-0.446 1.043-0.481 1.576 0l3.908 3.747 3.908-3.747c0.533-0.481 1.141-0.446 1.574 0 0.436 0.445 0.408 1.197 0 1.615-0.406 0.418-4.695 4.502-4.695 4.502-0.217 0.223-0.502 0.335-0.787 0.335s-0.57-0.112-0.789-0.335c0 0-4.287-4.084-4.695-4.502s-0.436-1.17 0-1.615z">
                                                            </path>
                                                        </svg>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-auto">
                                        <div class="dropdown-card dropdown"><button id="react-aria5016654841-15"
                                                aria-expanded="false" type="button"
                                                class="btn btn-white btn-sm btn btn-primary"><svg width="1em"
                                                    height="1em" viewBox="0 0 24 24" fill="none" stroke="currentColor"
                                                    stroke-width="2" stroke-linecap="round" stroke-linejoin="round"
                                                    class="feather feather-sliders me-1">
                                                    <g>
                                                        <line x1="4" y1="21" x2="4" y2="14"></line>
                                                        <line x1="4" y1="10" x2="4" y2="3"></line>
                                                        <line x1="12" y1="21" x2="12" y2="12"></line>
                                                        <line x1="12" y1="8" x2="12" y2="3"></line>
                                                        <line x1="20" y1="21" x2="20" y2="16"></line>
                                                        <line x1="20" y1="12" x2="20" y2="3"></line>
                                                        <line x1="1" y1="14" x2="7" y2="14"></line>
                                                        <line x1="9" y1="8" x2="15" y2="8"></line>
                                                        <line x1="17" y1="16" x2="23" y2="16"></line>
                                                    </g>
                                                </svg> Filtro</button></div>
                                    </div>
                                </div>
                            </div>
                            <div class="table-responsive">
                                <table class="card-table table-nowrap table table-sm table-hover">
                                    <thead>
                                        <tr>
                                            <th colSpan="1">
                                                <div>
                                                    <div style="cursor:pointer" class=""><input type="checkbox"
                                                            class="form-check-input" /></div>
                                                </div>
                                            </th>
                                            <th colSpan="1" title="Toggle SortBy" style="cursor:pointer"
                                                class="is-sortable">Nombre</th>
                                            <th colSpan="1" title="Toggle SortBy" style="cursor:pointer"
                                                class="is-sortable">Polizas Act.</th>
                                            <th colSpan="1" title="Toggle SortBy" style="cursor:pointer"
                                                class="is-sortable">Email</th>
                                            <th colSpan="1" title="Toggle SortBy" style="cursor:pointer"
                                                class="is-sortable">Numero de telefono</th>
                                            <th colSpan="1" title="Toggle SortBy" style="cursor:pointer"
                                                class="is-sortable">Tipo Contacto</th>
                                            <th colSpan="1" title="Toggle SortBy" style="cursor:pointer"
                                                class="is-sortable">Edad</th>
                                            <th colSpan="1"> </th>
                                        </tr>
                                    </thead>
                                    <tbody class="fs-base">
                                        
            <%
            
            for(int i=0; i< ContactosAdesplegar.size(); i++){
                
            Contacto contactoDespliega = ContactosAdesplegar.get(i);
            
            %>
                                        <tr>
                                            <td>
                                                <div>
                                                    <div style="cursor:pointer" class=""><input type="checkbox"
                                                            class="form-check-input" /></div>
                                                </div>
                                            </td>
                                            <td>
                                                <%
                                                String imagenContacto;
                                                if(contactoDespliega.getSexo().equals("Masculino")){
                                                    imagenContacto="Resources/Images/carita-hombre.png";
                                                }else if(contactoDespliega.getSexo().equals("Femenino")){
                                                    imagenContacto="Resources/Images/carita-mujer.png";
                                                }else{
                                                    imagenContacto="Resources/Images/carita-otro.png";
                                                }
                                                
                                                
                                                %>
                                                <div class="avatar avatar-xs me-2">
                                                    <img class="avatar-img rounded-circle" src="<%out.print(imagenContacto);%>" alt="Dianna Smiley" />
                                                </div>
                                                
                                                <a class="text-reset" href="/profile-posts"><% out.print(contactoDespliega.getNombre()) ;%> <%out.print(contactoDespliega.getApat() );%></a>
                                            </td>
                                            <td><% out.print(contactoDespliega.getPolizasActivas()) ;%> </td>
                                            <td><a class="text-reset"
                                                    href="mailto:diana.smiley@company.com"><% out.print(contactoDespliega.getCorreo()) ; %></a>
                                            </td>
                                            <td><a class="text-reset" href="tel:9885683568"><% out.print(contactoDespliega.getTelefono()) ;%></a></td>
                                            <td><span >Cliente</span></td>
                                            <td><% out.print(contactoDespliega.getEdad()) ;%> </td>
                                            <td>
                                                <div class="dropdown"><span class="dropdown-ellipses dropdown-toggle"
                                                        id="react-aria5016654841-16" aria-expanded="false"
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
                <%
                
                }
                
                %>                      

                                    </tbody>
                                </table>
                            </div>
                            <div class="d-flex justify-content-between card-footer">
                                <ul class="card-pagination pagination-tabs pagination">
                                    <li class="ps-0 pe-4 border-end page-item disabled"><span class="page-link"
                                            disabled=""><svg width="1em" height="1em" viewBox="0 0 24 24" fill="none"
                                                stroke="currentColor" stroke-width="2" stroke-linecap="round"
                                                stroke-linejoin="round" class="feather feather-arrow-left me-1">
                                                <g>
                                                    <line x1="19" y1="12" x2="5" y2="12"></line>
                                                    <polyline points="12 19 5 12 12 5"></polyline>
                                                </g>
                                            </svg> Anterior</span></li>
                                </ul>
                                <ul class="card-pagination pagination-tabs pagination">
                                    <li class="page-item active"><span class="page-link">1<span
                                                class="visually-hidden">(current)</span></span></li>
                                    <li class="page-item"><a class="page-link" role="button" tabindex="0">2</a></li>
                                    <li class="page-item"><a class="page-link" role="button" tabindex="0">3</a></li>
                                </ul>
                                <ul class="card-pagination pagination-tabs pagination">
                                    <li class="ps-4 pe-0 border-start page-item"><a class="page-link" role="button"
                                            tabindex="0">Siguiente <svg width="1em" height="1em" viewBox="0 0 24 24"
                                                fill="none" stroke="currentColor" stroke-width="2"
                                                stroke-linecap="round" stroke-linejoin="round"
                                                class="feather feather-arrow-right ms-1">
                                                <g>
                                                    <line x1="5" y1="12" x2="19" y2="12"></line>
                                                    <polyline points="12 5 19 12 12 19"></polyline>
                                                </g>
                                            </svg></a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="main-content">
            <div class="container-fluid">
                <div class="justify-content-center row">

                </div>
            </div>
        </div>
    </div>
    <script id="__NEXT_DATA__"
        type="application/json">{"props":{"pageProps":{}},"buildId":"nrtWV97mGey8aZ6Gr9nFv","scriptLoader":[]}</script>
</body>

</html>