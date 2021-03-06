<%-- 
    Document   : administraCuenta
    Created on : 7/12/2021, 04:47:42 AM
    Author     : juan-
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
        <meta name="viewport" content="width=device-width" />
        <meta charSet="utf-8" />
        <link rel="shortcut icon" href="../Resources/Icon/Apolo.png" type="image/x-icon" />
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

    


%>
</head>

<body>
    <div id="__next">
        <nav class="navbar-vertical fixed-start navbar navbar-expand-md navbar-light">
            <div class="container-fluid"><button type="button" aria-label="Toggle navigation"
                    class="navbar-toggler collapsed"><span class="navbar-toggler-icon"></span></button><a href="board.html"
                    class="navbar-brand"><img class="navbar-brand-img" src="../Resources/Images/LogoApolo.png" alt="..." /></a>
                <div class="d-md-none dropdown">
                    <div class="avatar avatar-sm avatar-online dropdown-toggle" id="react-aria5016654841-32"
                        aria-expanded="false" role="button"><img class="avatar-img rounded-circle"
                            src="/img/avatars/profiles/avatar-1.jpg" alt="..." /></div>
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
                                <form action="../ConsultarBoard" method="post">
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
                                <form action="../ConsultaContactos" method="post">

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
                            <div class="nav-item"><a href="estadisticas.html" data-rr-ui-event-key="/widgets"
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
                            <div class="nav-item"><a href="cuenta.html" role="button" class="nav-link" tabindex="0"><svg width="17"
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
                                    src="../Resources/Images/perfilApolo.jpg" alt="..." /></div>
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
                    <div class="col-xl-8 col-lg-10 col-12">
                        <div class="header mt-md-5">
                            <div class="header-body">
                                <div class="align-items-center row">
                                    <div class="col">
                                        <h6 class="header-pretitle">Configuraci??n</h6>
                                        <h1 class="header-title">Cuenta</h1>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <form>
                            <div class="justify-content-between align-items-center row">
                                <div class="col">
                                    <div class="align-items-center row">
                                        <div class="col-auto">
                                            <div class="avatar"><img class="avatar-img rounded-circle"
                                                    src="../Resources/Images/perfilApolo.jpg" alt="Dianna Smiley" />
                                            </div>
                                        </div>
                                        <div class="ms-n2 col">
                                            <h4 class="mb-1">Tu foto</h4><small class="text-muted">PNG o JPG no
                                                mayor a 1000px x 1000px.</small>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-auto"><button type="button"
                                        class="btn btn-primary btn-sm">Subir</button></div>
                            </div>
                            <hr class="my-5" />
                            <div class="row">
                                <div class="col-md-6 col-12">
                                    <div class="form-group"><label class="form-label">Nombre</label><input
                                            type="text" class="form-control" value="Rosalba" /></div>
                                </div>
                                <div class="col-md-6 col-12">
                                    <div class="form-group"><label class="form-label">Apellido paterno</label><input
                                            type="text" class="form-control" value="Garcia"/></div>
                                </div>
                                <div class="col-md-6 col-12">
                                    <div class="form-group"><label class="form-label">Apellido materno</label><input
                                            type="text" class="form-control" value="Lopez" /></div>
                                </div>
                                <div class="col-12">
                                    <div class="form-group"><label class="mb-1 form-label">Direcci??n de correo electronico</label><small
                                            class="small text-muted form-text">Es el metodo para que nos contactemos contigo,
                                            por lo que debes tener cuidado con la direcci??n que pongas.</small><input type="email"
                                            class="form-control" value="rosalbaGar@gmail.com"/></div>
                                </div>
                                <div class="col-md-6 col-12">
                                    <div class="form-group"><label class="form-label">Numero de telefono</label><input type="text"
                                            placeholder="(__)____-____" class="form-control" value="55 6163 1096" /></div>
                                </div>
                                <div class="col-12 col-md-6 col-md-6 col-12">
                                    <div class="form-group"><label class="form-label">Fecha de nacimiento</label><input type="date"
                                            class="form-control" value="1988-07-22"/></div>
                                </div>
                            </div><button type="button" class="btn btn-primary">Guardar cambios</button>
                            <hr class="my-5" />
                            <hr class="mt-4 mb-5" />
                            <div class="justify-content-between row">
                                <div class="col-12 col-md-6 col-md-6 col-12">
                                    <h4>Eliminar cuenta</h4>
                                    <p class="small text-muted mb-md-0">Eliminar tu cuenta es una acci??n
                                        que no puede ser revertida, tus datos se perderan permanentemente.</p>
                                </div>
                                <div class="col-auto"><button type="button" class="btn btn-danger">Eliminar</button></div>
                            </div>
                        </form><br /><br />
                    </div>
                </div>
            </div>
        </div>
    </div>
   </body>

</html>
