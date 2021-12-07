<%-- 
    Document   : contactos
    Created on : 5/12/2021, 11:58:11 PM
    Author     : devil
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
        
        
        <!--
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        -->
        
        
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
                            <div class="nav-item"><a href="board.html" role="button" class="nav-link" tabindex="0"><svg width="17"
                                        height="17" viewBox="0 0 24 24" fill="none" stroke="currentColor"
                                        stroke-width="2" stroke-linecap="round" stroke-linejoin="round"
                                        class="feather feather-home ">
                                        <g>
                                            <path d="M3 9l9-7 9 7v11a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2z"></path>
                                            <polyline points="9 22 9 12 15 12 15 22"></polyline>
                                        </g>
                                    </svg>Inicio<svg width="1em" height="1em" viewBox="0 0 24 24" fill="none"
                                        stroke="currentColor" stroke-width="2" stroke-linecap="round"
                                        stroke-linejoin="round"
                                        class="feather feather-chevron-down ms-auto nav-chevron active">
                                    </svg></a>
                                
                            </div>
                            <div class="nav-item"><a href="agenda.html" role="button" class="nav-link" tabindex="0"><svg width="17"
                                        height="17" viewBox="0 0 24 24" fill="none" stroke="currentColor"
                                        stroke-width="2" stroke-linecap="round" stroke-linejoin="round"
                                        class="feather feather-file ">
                                        <g>
                                            <path d="M13 2H6a2 2 0 0 0-2 2v16a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V9z"></path>
                                            <polyline points="13 2 13 9 20 9"></polyline>
                                        </g>
                                    </svg>Agenda<svg width="1em" height="1em" viewBox="0 0 24 24" fill="none"
                                        stroke="currentColor" stroke-width="2" stroke-linecap="round"
                                        stroke-linejoin="round"
                                        class="feather feather-chevron-down ms-auto nav-chevron false">
                                    </svg></a>
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
                    <div class="col-12">
                        <div class="header">
                            <div class="header-body">
                                <div class="align-items-center row">
                                    <div class="col">
                                        <h1 class="header-title text-truncate">Registro de contacto</h1>
                                    </div>
                                    <div class="col-auto">
                                        <div role="group" class="nav d-inline-flex btn-group">
                                                    
                                        </div>
                                        <a href="agenda.html">
                                        <button type="button" class="ms-2 btn btn-primary">Lista de contactos</button>
                                        </a>
                                    </div>
                                </div>
                            </div>
                            <!-- Inicia Kevin -->
                            <div class="container">
                                    <div class="row">

                                        <div class="col-md-8 col-md-offset-2">
                                            <br>
                                            <form role="form" method="POST" action="../RegistroContacto">

                                                <!--<legend class="text-center">Registro de contacto</legend>-->

                                                <fieldset>
                                                    <legend>Detalles de contacto</legend>

                                                    <div class="form-group col-md-6">
                                                        <label for="ApellidoP">Apellido Paterno</label>
                                                        <input type="text" class="form-control" name="ApellidoP" id="ApellidoP" placeholder="Apellido Paterno">
                                                    </div>

                                                    <div class="form-group col-md-6">
                                                        <label for="ApellidoM">Apellido Materno</label>
                                                        <input type="text" class="form-control" name="ApellidoM" id="ApellidoM" placeholder="Apellido Materno">
                                                    </div>
                                                    
                                                    <div class="form-group col-md-6">
                                                        <label for="Nombre">Nombre(s)</label>
                                                        <input type="text" class="form-control" name="Nombre" id="Nombre" placeholder="Nombre">
                                                    </div>

                                                    <div class="form-group col-md-6">
                                                        <label for="Correo">Email</label>
                                                        <input type="email" class="form-control" name="Correo" id="Correo" placeholder="Email">
                                                    </div>
                                                    
                                                    <div class="form-group col-md-6">
                                                        <label for="Direccion">Direccion</label>
                                                        <input type="text" class="form-control" name="Direccion" id="Direccion" placeholder="Direccion">
                                                    </div>
                                                    
                                                    <div class="form-group col-md-6">
                                                        <label for="Telefono">Telefono</label>
                                                        <input type="text" class="form-control" name="Telefono" id="Telefono" placeholder="55-5555-5555">
                                                    </div>
                                                    
                                                    <div class="form-group col-md-6">
                                                        <label for="Edad">Edad</label>
                                                        <input type="number" class="form-control" name="Edad" id="Edad" placeholder="Edad">
                                                    </div>
                                                    
                                                    <div class="form-group col-md-6">
                                                        <label for="Sexo">Sexo</label>
                                                        <input type="text" class="form-control" name="Sexo" id="Sexo" placeholder="Sexo">
                                                    </div>
                                                    
                                                    <div class="form-group col-md-6">
                                                        <label for="Estado_Civil">Estado Civil</label>
                                                        <input type="text" class="form-control" name="Estado_Civil" id="Estado_Civil" placeholder="Estado Civil">
                                                    </div>
                                                    
                                                    <div class="form-group col-md-6">
                                                        <label for="Polizas_Activas">Polizas Activas</label>
                                                        <input type="number" class="form-control" name="Polizas_Activas" id="Polizas_Activas" placeholder="Polizas Activas">
                                                    </div>
                                                    
                                                    <div class="form-group col-md-6">
                                                        <label for="Antecedentes_Financieros">Antecedentes Financieros</label>
                                                        <textarea class="form-control" name="Antecedentes_Financieros" id="Antecedentes_Financieros"></textarea>
                                                    </div>
                                                    
                                                    <div class="form-group col-md-6">
                                                        <label for="Antecedentes_Penales">Antecedentes Penales</label>
                                                        <textarea class="form-control" name="Antecedentes_Penales" id="Antecedentes_Penales"></textarea>
                                                    </div>
                                                    
                                                    <div class="form-group col-md-6">
                                                        <label for="Antecedentes_Medicos">Antecedentes Medicos</label>
                                                        <textarea class="form-control" name="Antecedentes_Medicos" id="Antecedentes_Medicos"></textarea>
                                                    </div>
                                                    
                                                </fieldset>

                                                <!--<fieldset>
                                                    <legend>Optional Details</legend>

                                                    <div class="form-group col-md-6">
                                                        <label for="country">Country of Residence</label>
                                                        <select class="form-control" name="" id="country">
                                                            <option>Country 1</option>
                                                            <option>Country 2</option>
                                                            <option>Country 3</option>
                                                        </select>
                                                    </div>

                                                    <div class="form-group col-md-12">
                                                        <label for="found_site">How did you find out about the site?</label>
                                                        <select class="form-control" name="" id="found_site">
                                                            <option>Company</option>
                                                            <option>Friend</option>
                                                            <option>Colleague</option>
                                                            <option>Advertisement</option>
                                                            <option>Google Search</option>
                                                            <option>Online Article</option>
                                                            <option value="other" >Other</option>
                                                        </select>
                                                    </div>

                                                    <div class="form-group col-md-12 hidden">
                                                        <label for="specify">Please Specify</label>
                                                        <textarea class="form-control" id="specify" name=""></textarea>
                                                    </div>

                                                </fieldset>-->

                                                <div class="form-group">
                                                    <div class="col-md-12">
                                                        <button type="submit" class="btn btn-primary">
                                                            Registrar
                                                        </button>
                                                    </div>
                                                </div>

                                            </form>
                                        </div>

                                    </div>
                                </div>
                            <!-- Termina Kevin -->
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <script id="__NEXT_DATA__"
        type="application/json">{"props":{"pageProps":{}},"buildId":"nrtWV97mGey8aZ6Gr9nFv","scriptLoader":[]}</script>
</body>

</html>
