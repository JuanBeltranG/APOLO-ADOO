package org.apache.jsp.Pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;
import Models.Contacto;

public final class AgendaContactos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width\" />\n");
      out.write("        <meta charSet=\"utf-8\" />\n");
      out.write("        <link rel=\"shortcut icon\" href=\"../Resources/Icon/Apolo.png\" type=\"image/x-icon\" />\n");
      out.write("        <title>Apolo - Tablero</title>\n");
      out.write("        <meta name=\"next-head-count\" content=\"4\" />\n");
      out.write("        <link rel=\"preload\" href=\"https://dashkit-react.vercel.app/_next/static/css/86954328a650be218e9c.css\" as=\"style\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://dashkit-react.vercel.app/_next/static/css/341d59560d9b0642.css\" data-n-g=\"\"><noscript\n");
      out.write("            data-n-css=\"\"></noscript>\n");
      out.write("        <script defer=\"\" nomodule=\"\" src=\"https://dashkit-react.vercel.app/_next/static/chunks/polyfills-a40ef1678bae11e696dba45124eadd70.js\"></script>\n");
      out.write("        <script src=\"https://dashkit-react.vercel.app/_next/static/chunks/webpack-ce7125b7bd5ab36dbeae.js\" defer=\"\"></script>\n");
      out.write("        <script src=\"https://dashkit-react.vercel.app/_next/static/chunks/framework-4993881ebc283d7a0259.js\" defer=\"\"></script>\n");
      out.write("        <script src=\"https://dashkit-react.vercel.app/_next/static/chunks/main-e78a9957bb0ffbd04310.js\" defer=\"\"></script>\n");
      out.write("        <script src=\"https://dashkit-react.vercel.app/_next/static/chunks/pages/_app-86a21e1a0914d91e1fc0.js\" defer=\"\"></script>\n");
      out.write("        <script src=\"https://dashkit-react.vercel.app/_next/static/chunks/bee240a3-b9ab83e2fca9452552a1.js\" defer=\"\"></script>\n");
      out.write("        <script src=\"https://dashkit-react.vercel.app/_next/static/chunks/2045-860e2472fe63271542c2.js\" defer=\"\"></script>\n");
      out.write("        <script src=\"https://dashkit-react.vercel.app/_next/static/chunks/1572-eabc3632684afac31cf1.js\" defer=\"\"></script>\n");
      out.write("        <script src=\"https://dashkit-react.vercel.app/_next/static/chunks/pages/index-4f1ea3239c5878d6bcc9.js\" defer=\"\"></script>\n");
      out.write("        <script src=\"https://dashkit-react.vercel.app/_next/static/nrtWV97mGey8aZ6Gr9nFv/_buildManifest.js\" defer=\"\"></script>\n");
      out.write("        <script src=\"https://dashkit-react.vercel.app/_next/static/nrtWV97mGey8aZ6Gr9nFv/_ssgManifest.js\" defer=\"\"></script>\n");
      out.write("   \n");
      out.write("    ");

   /*     
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
        
    }*/
    
    
      out.write("\n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div id=\"__next\">\n");
      out.write("        <nav class=\"navbar-vertical fixed-start navbar navbar-expand-md navbar-light\">\n");
      out.write("            <div class=\"container-fluid\"><button type=\"button\" aria-label=\"Toggle navigation\"\n");
      out.write("                    class=\"navbar-toggler collapsed\"><span class=\"navbar-toggler-icon\"></span></button><a href=\"board.html\"\n");
      out.write("                    class=\"navbar-brand\"><img class=\"navbar-brand-img\" src=\"../Resources/Images/LogoApolo.png\" alt=\"...\" /></a>\n");
      out.write("                <div class=\"d-md-none dropdown\">\n");
      out.write("                    <div class=\"avatar avatar-sm avatar-online dropdown-toggle\" id=\"react-aria5016654841-32\"\n");
      out.write("                        aria-expanded=\"false\" role=\"button\"><img class=\"avatar-img rounded-circle\"\n");
      out.write("                            src=\"/img/avatars/profiles/avatar-1.jpg\" alt=\"...\" /></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"navbar-collapse collapse\">\n");
      out.write("                    <form class=\"mt-4 mb-3 d-md-none\">\n");
      out.write("                        <div class=\"input-group-merge input-group-reverse input-group-rounded input-group\"><input\n");
      out.write("                                type=\"search\" placeholder=\"Search\" aria-label=\"search\" class=\"form-control\" /><span\n");
      out.write("                                class=\"input-group-text\"><svg width=\"15\" height=\"15\" viewBox=\"0 0 24 24\" fill=\"none\"\n");
      out.write("                                    stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\"\n");
      out.write("                                    stroke-linejoin=\"round\" class=\"feather feather-search \">\n");
      out.write("                                    <g>\n");
      out.write("                                        <circle cx=\"11\" cy=\"11\" r=\"8\"></circle>\n");
      out.write("                                        <line x1=\"21\" y1=\"21\" x2=\"16.65\" y2=\"16.65\"></line>\n");
      out.write("                                    </g>\n");
      out.write("                                </svg></span></div>\n");
      out.write("                    </form>\n");
      out.write("                    <div>\n");
      out.write("                        <div class=\"navbar-nav\">\n");
      out.write("                            <div class=\"nav-item\"><a href=\"board.html\" role=\"button\" class=\"nav-link\" tabindex=\"0\"><svg width=\"17\"\n");
      out.write("                                        height=\"17\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\"\n");
      out.write("                                        stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\"\n");
      out.write("                                        class=\"feather feather-home \">\n");
      out.write("                                        <g>\n");
      out.write("                                            <path d=\"M3 9l9-7 9 7v11a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2z\"></path>\n");
      out.write("                                            <polyline points=\"9 22 9 12 15 12 15 22\"></polyline>\n");
      out.write("                                        </g>\n");
      out.write("                                    </svg>Inicio<svg width=\"1em\" height=\"1em\" viewBox=\"0 0 24 24\" fill=\"none\"\n");
      out.write("                                        stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\"\n");
      out.write("                                        stroke-linejoin=\"round\"\n");
      out.write("                                        class=\"feather feather-chevron-down ms-auto nav-chevron active\">\n");
      out.write("                                    </svg></a>\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"nav-item\"><a href=\"agenda.html\" role=\"button\" class=\"nav-link\" tabindex=\"0\"><svg width=\"17\"\n");
      out.write("                                        height=\"17\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\"\n");
      out.write("                                        stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\"\n");
      out.write("                                        class=\"feather feather-file \">\n");
      out.write("                                        <g>\n");
      out.write("                                            <path d=\"M13 2H6a2 2 0 0 0-2 2v16a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V9z\"></path>\n");
      out.write("                                            <polyline points=\"13 2 13 9 20 9\"></polyline>\n");
      out.write("                                        </g>\n");
      out.write("                                    </svg>Agenda<svg width=\"1em\" height=\"1em\" viewBox=\"0 0 24 24\" fill=\"none\"\n");
      out.write("                                        stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\"\n");
      out.write("                                        stroke-linejoin=\"round\"\n");
      out.write("                                        class=\"feather feather-chevron-down ms-auto nav-chevron false\">\n");
      out.write("                                    </svg></a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"nav-item\"><a href=\"estadisticas.html\" data-rr-ui-event-key=\"/widgets\"\n");
      out.write("                                    class=\"nav-link\"><svg width=\"17\" height=\"17\" viewBox=\"0 0 24 24\" fill=\"none\"\n");
      out.write("                                        stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\"\n");
      out.write("                                        stroke-linejoin=\"round\" class=\"feather feather-grid \">\n");
      out.write("                                        <g>\n");
      out.write("                                            <rect x=\"3\" y=\"3\" width=\"7\" height=\"7\"></rect>\n");
      out.write("                                            <rect x=\"14\" y=\"3\" width=\"7\" height=\"7\"></rect>\n");
      out.write("                                            <rect x=\"14\" y=\"14\" width=\"7\" height=\"7\"></rect>\n");
      out.write("                                            <rect x=\"3\" y=\"14\" width=\"7\" height=\"7\"></rect>\n");
      out.write("                                        </g>\n");
      out.write("                                    </svg>Estadisticas</a></div>\n");
      out.write("                            <div class=\"nav-item\"><a href=\"cuenta.html\" role=\"button\" class=\"nav-link\" tabindex=\"0\"><svg width=\"17\"\n");
      out.write("                                        height=\"17\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\"\n");
      out.write("                                        stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\"\n");
      out.write("                                        class=\"feather feather-user \">\n");
      out.write("                                        <g>\n");
      out.write("                                            <path d=\"M20 21v-2a4 4 0 0 0-4-4H8a4 4 0 0 0-4 4v2\"></path>\n");
      out.write("                                            <circle cx=\"12\" cy=\"7\" r=\"4\"></circle>\n");
      out.write("                                        </g>\n");
      out.write("                                    </svg>Cuenta<svg width=\"1em\" height=\"1em\" viewBox=\"0 0 24 24\" fill=\"none\"\n");
      out.write("                                        stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\"\n");
      out.write("                                        stroke-linejoin=\"round\"\n");
      out.write("                                        class=\"feather feather-chevron-down ms-auto nav-chevron false\">\n");
      out.write("                                    </svg></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"mt-auto mb-md-4\"></div>\n");
      out.write("                    <div class=\"navbar-user d-none d-md-flex\"><a class=\"navbar-user-link\" role=\"button\">\n");
      out.write("                            <div class=\"icon\"><svg width=\"17\" height=\"17\" viewBox=\"0 0 24 24\" fill=\"none\"\n");
      out.write("                                    stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\"\n");
      out.write("                                    stroke-linejoin=\"round\" class=\"feather feather-bell \">\n");
      out.write("                                    <g>\n");
      out.write("                                        <path d=\"M18 8A6 6 0 0 0 6 8c0 7-3 9-3 9h18s-3-2-3-9\"></path>\n");
      out.write("                                        <path d=\"M13.73 21a2 2 0 0 1-3.46 0\"></path>\n");
      out.write("                                    </g>\n");
      out.write("                                </svg></div>\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"dropup\">\n");
      out.write("                            <div class=\"avatar avatar-sm avatar-online dropdown-toggle\" id=\"react-aria5016654841-33\"\n");
      out.write("                                aria-expanded=\"false\" role=\"button\"><img class=\"avatar-img rounded-circle\"\n");
      out.write("                                    src=\"../Resources/Images/perfilApolo.jpg\" alt=\"...\" /></div>\n");
      out.write("                        </div><a class=\"navbar-user-link\" role=\"button\">\n");
      out.write("                            <div class=\"icon\"><svg width=\"17\" height=\"17\" viewBox=\"0 0 24 24\" fill=\"none\"\n");
      out.write("                                    stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\"\n");
      out.write("                                    stroke-linejoin=\"round\" class=\"feather feather-search \">\n");
      out.write("                                    <g>\n");
      out.write("                                        <circle cx=\"11\" cy=\"11\" r=\"8\"></circle>\n");
      out.write("                                        <line x1=\"21\" y1=\"21\" x2=\"16.65\" y2=\"16.65\"></line>\n");
      out.write("                                    </g>\n");
      out.write("                                </svg></div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"main-content\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"justify-content-center row\">\n");
      out.write("                    <div class=\"col-12\">\n");
      out.write("                        <div class=\"header\">\n");
      out.write("                            <div class=\"header-body\">\n");
      out.write("                                <div class=\"align-items-center row\">\n");
      out.write("                                    <div class=\"col\">\n");
      out.write("                                        <h1 class=\"header-title text-truncate\">Contactos</h1>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-auto\">\n");
      out.write("                                        <div role=\"group\" class=\"nav d-inline-flex btn-group\">\n");
      out.write("                                                    \n");
      out.write("                                        </div>\n");
      out.write("                                        <a href=\"contactos.jsp\">\n");
      out.write("                                        <button type=\"button\" class=\"ms-2 btn btn-primary\">Añadir contacto</button>\n");
      out.write("                                        </a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"align-items-center row\">\n");
      out.write("                                    <div class=\"col\">\n");
      out.write("                                        <div class=\"header-tabs nav-overflow nav nav-tabs\">\n");
      out.write("                                            <div class=\"nav-item\"><a role=\"button\" class=\"text-nowrap nav-link active\"\n");
      out.write("                                                    tabindex=\"0\">Mostrar todos los contactos\n");
      out.write("                                                    <!-- --> <span\n");
      out.write("                                                        class=\"rounded-pill badge bg-secondary-soft\">8</span>\n");
      out.write("                                                </a></div>\n");
      out.write("                                            <div class=\"nav-item\"><a role=\"button\" class=\"text-nowrap nav-link\"\n");
      out.write("                                                    tabindex=\"0\">Eliminados\n");
      out.write("                                                    <!-- --> <span\n");
      out.write("                                                        class=\"rounded-pill badge bg-secondary-soft\">0</span>\n");
      out.write("                                                </a></div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"card-header\">\n");
      out.write("                                <div class=\"align-items-center row\">\n");
      out.write("                                    <div class=\"col\">\n");
      out.write("                                        <div\n");
      out.write("                                            class=\"input-group-merge input-group-flush input-group-reverse input-group\">\n");
      out.write("                                            <input type=\"search\" placeholder=\"Buscar\" class=\"form-control\" /><span\n");
      out.write("                                                class=\"input-group-text\"><svg width=\"1em\" height=\"1em\"\n");
      out.write("                                                    viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\"\n");
      out.write("                                                    stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\"\n");
      out.write("                                                    class=\"feather feather-search \">\n");
      out.write("                                                    <g>\n");
      out.write("                                                        <circle cx=\"11\" cy=\"11\" r=\"8\"></circle>\n");
      out.write("                                                        <line x1=\"21\" y1=\"21\" x2=\"16.65\" y2=\"16.65\"></line>\n");
      out.write("                                                    </g>\n");
      out.write("                                                </svg></span></div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"me-n3 col-auto\">\n");
      out.write("                                        <style data-emotion=\"css b62m3t-container\">\n");
      out.write("                                            .css-b62m3t-container {\n");
      out.write("                                                position: relative;\n");
      out.write("                                                box-sizing: border-box;\n");
      out.write("                                            }\n");
      out.write("                                        </style>\n");
      out.write("                                        <div class=\" css-b62m3t-container\">\n");
      out.write("                                            <style data-emotion=\"css 7pg0cj-a11yText\">\n");
      out.write("                                                .css-7pg0cj-a11yText {\n");
      out.write("                                                    z-index: 9999;\n");
      out.write("                                                    border: 0;\n");
      out.write("                                                    clip: rect(1px, 1px, 1px, 1px);\n");
      out.write("                                                    height: 1px;\n");
      out.write("                                                    width: 1px;\n");
      out.write("                                                    position: absolute;\n");
      out.write("                                                    overflow: hidden;\n");
      out.write("                                                    padding: 0;\n");
      out.write("                                                    white-space: nowrap;\n");
      out.write("                                                }\n");
      out.write("                                            </style><span id=\"react-select-3-live-region\"\n");
      out.write("                                                class=\"css-7pg0cj-a11yText\"></span><span aria-live=\"polite\"\n");
      out.write("                                                aria-atomic=\"false\" aria-relevant=\"additions text\"\n");
      out.write("                                                class=\"css-7pg0cj-a11yText\"></span>\n");
      out.write("                                            <div\n");
      out.write("                                                class=\"form-control-flush form-select form-select-sm select__control css-0\">\n");
      out.write("                                                <div class=\"select__value-container css-0\">\n");
      out.write("                                                    <div class=\"select__placeholder css-0\"\n");
      out.write("                                                        id=\"react-select-3-placeholder\">Seleccionar...</div>\n");
      out.write("                                                    <style data-emotion=\"css 1hac4vs-dummyInput\">\n");
      out.write("                                                        .css-1hac4vs-dummyInput {\n");
      out.write("                                                            background: 0;\n");
      out.write("                                                            border: 0;\n");
      out.write("                                                            caret-color: transparent;\n");
      out.write("                                                            font-size: inherit;\n");
      out.write("                                                            grid-area: 1/1/2/3;\n");
      out.write("                                                            outline: 0;\n");
      out.write("                                                            padding: 0;\n");
      out.write("                                                            width: 1px;\n");
      out.write("                                                            color: transparent;\n");
      out.write("                                                            left: -100px;\n");
      out.write("                                                            opacity: 0;\n");
      out.write("                                                            position: relative;\n");
      out.write("                                                            -webkit-transform: scale(.01);\n");
      out.write("                                                            -moz-transform: scale(.01);\n");
      out.write("                                                            -ms-transform: scale(.01);\n");
      out.write("                                                            transform: scale(.01);\n");
      out.write("                                                        }\n");
      out.write("                                                    </style><input id=\"react-select-3-input\" tabindex=\"0\"\n");
      out.write("                                                        inputMode=\"none\" value=\"\" aria-autocomplete=\"list\"\n");
      out.write("                                                        aria-expanded=\"false\" aria-haspopup=\"true\"\n");
      out.write("                                                        aria-controls=\"react-select-3-listbox\"\n");
      out.write("                                                        aria-owns=\"react-select-3-listbox\" role=\"combobox\"\n");
      out.write("                                                        aria-readonly=\"true\"\n");
      out.write("                                                        aria-describedby=\"react-select-3-placeholder\"\n");
      out.write("                                                        class=\"css-1hac4vs-dummyInput\" />\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"select__indicators css-0\">\n");
      out.write("                                                    <style data-emotion=\"css 1okebmr-indicatorSeparator\">\n");
      out.write("                                                        .css-1okebmr-indicatorSeparator {\n");
      out.write("                                                            -webkit-align-self: stretch;\n");
      out.write("                                                            -ms-flex-item-align: stretch;\n");
      out.write("                                                            align-self: stretch;\n");
      out.write("                                                            background-color: hsl(0, 0%, 80%);\n");
      out.write("                                                            margin-bottom: 8px;\n");
      out.write("                                                            margin-top: 8px;\n");
      out.write("                                                            width: 1px;\n");
      out.write("                                                            box-sizing: border-box;\n");
      out.write("                                                        }\n");
      out.write("                                                    </style><span\n");
      out.write("                                                        class=\"select__indicator-separator css-1okebmr-indicatorSeparator\"></span>\n");
      out.write("                                                    <style data-emotion=\"css tlfecz-indicatorContainer\">\n");
      out.write("                                                        .css-tlfecz-indicatorContainer {\n");
      out.write("                                                            color: hsl(0, 0%, 80%);\n");
      out.write("                                                            display: -webkit-box;\n");
      out.write("                                                            display: -webkit-flex;\n");
      out.write("                                                            display: -ms-flexbox;\n");
      out.write("                                                            display: flex;\n");
      out.write("                                                            padding: 8px;\n");
      out.write("                                                            -webkit-transition: color 150ms;\n");
      out.write("                                                            transition: color 150ms;\n");
      out.write("                                                            box-sizing: border-box;\n");
      out.write("                                                        }\n");
      out.write("\n");
      out.write("                                                        .css-tlfecz-indicatorContainer:hover {\n");
      out.write("                                                            color: hsl(0, 0%, 60%);\n");
      out.write("                                                        }\n");
      out.write("                                                    </style>\n");
      out.write("                                                    <div class=\"select__indicator select__dropdown-indicator css-tlfecz-indicatorContainer\"\n");
      out.write("                                                        aria-hidden=\"true\">\n");
      out.write("                                                        <style data-emotion=\"css 8mmkcg\">\n");
      out.write("                                                            .css-8mmkcg {\n");
      out.write("                                                                display: inline-block;\n");
      out.write("                                                                fill: currentColor;\n");
      out.write("                                                                line-height: 1;\n");
      out.write("                                                                stroke: currentColor;\n");
      out.write("                                                                stroke-width: 0;\n");
      out.write("                                                            }\n");
      out.write("                                                        </style><svg height=\"20\" width=\"20\" viewBox=\"0 0 20 20\"\n");
      out.write("                                                            aria-hidden=\"true\" focusable=\"false\" class=\"css-8mmkcg\">\n");
      out.write("                                                            <path\n");
      out.write("                                                                d=\"M4.516 7.548c0.436-0.446 1.043-0.481 1.576 0l3.908 3.747 3.908-3.747c0.533-0.481 1.141-0.446 1.574 0 0.436 0.445 0.408 1.197 0 1.615-0.406 0.418-4.695 4.502-4.695 4.502-0.217 0.223-0.502 0.335-0.787 0.335s-0.57-0.112-0.789-0.335c0 0-4.287-4.084-4.695-4.502s-0.436-1.17 0-1.615z\">\n");
      out.write("                                                            </path>\n");
      out.write("                                                        </svg>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-auto\">\n");
      out.write("                                        <div class=\"dropdown-card dropdown\"><button id=\"react-aria5016654841-15\"\n");
      out.write("                                                aria-expanded=\"false\" type=\"button\"\n");
      out.write("                                                class=\"btn btn-white btn-sm btn btn-primary\"><svg width=\"1em\"\n");
      out.write("                                                    height=\"1em\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\"\n");
      out.write("                                                    stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\"\n");
      out.write("                                                    class=\"feather feather-sliders me-1\">\n");
      out.write("                                                    <g>\n");
      out.write("                                                        <line x1=\"4\" y1=\"21\" x2=\"4\" y2=\"14\"></line>\n");
      out.write("                                                        <line x1=\"4\" y1=\"10\" x2=\"4\" y2=\"3\"></line>\n");
      out.write("                                                        <line x1=\"12\" y1=\"21\" x2=\"12\" y2=\"12\"></line>\n");
      out.write("                                                        <line x1=\"12\" y1=\"8\" x2=\"12\" y2=\"3\"></line>\n");
      out.write("                                                        <line x1=\"20\" y1=\"21\" x2=\"20\" y2=\"16\"></line>\n");
      out.write("                                                        <line x1=\"20\" y1=\"12\" x2=\"20\" y2=\"3\"></line>\n");
      out.write("                                                        <line x1=\"1\" y1=\"14\" x2=\"7\" y2=\"14\"></line>\n");
      out.write("                                                        <line x1=\"9\" y1=\"8\" x2=\"15\" y2=\"8\"></line>\n");
      out.write("                                                        <line x1=\"17\" y1=\"16\" x2=\"23\" y2=\"16\"></line>\n");
      out.write("                                                    </g>\n");
      out.write("                                                </svg> Filtro</button></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"table-responsive\">\n");
      out.write("                                <table class=\"card-table table-nowrap table table-sm table-hover\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th colSpan=\"1\">\n");
      out.write("                                                <div>\n");
      out.write("                                                    <div style=\"cursor:pointer\" class=\"\"><input type=\"checkbox\"\n");
      out.write("                                                            class=\"form-check-input\" /></div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </th>\n");
      out.write("                                            <th colSpan=\"1\" title=\"Toggle SortBy\" style=\"cursor:pointer\"\n");
      out.write("                                                class=\"is-sortable\">Nombre</th>\n");
      out.write("                                            <th colSpan=\"1\" title=\"Toggle SortBy\" style=\"cursor:pointer\"\n");
      out.write("                                                class=\"is-sortable\">Trabajo</th>\n");
      out.write("                                            <th colSpan=\"1\" title=\"Toggle SortBy\" style=\"cursor:pointer\"\n");
      out.write("                                                class=\"is-sortable\">Email</th>\n");
      out.write("                                            <th colSpan=\"1\" title=\"Toggle SortBy\" style=\"cursor:pointer\"\n");
      out.write("                                                class=\"is-sortable\">Numero de telefono</th>\n");
      out.write("                                            <th colSpan=\"1\" title=\"Toggle SortBy\" style=\"cursor:pointer\"\n");
      out.write("                                                class=\"is-sortable\">Servicio</th>\n");
      out.write("                                            <th colSpan=\"1\" title=\"Toggle SortBy\" style=\"cursor:pointer\"\n");
      out.write("                                                class=\"is-sortable\">Compañia</th>\n");
      out.write("                                            <th colSpan=\"1\"> </th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody class=\"fs-base\">\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>\n");
      out.write("                                                <div>\n");
      out.write("                                                    <div style=\"cursor:pointer\" class=\"\"><input type=\"checkbox\"\n");
      out.write("                                                            class=\"form-check-input\" /></div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <div class=\"avatar avatar-xs me-2\"><img\n");
      out.write("                                                        class=\"avatar-img rounded-circle\"\n");
      out.write("                                                        src=\"https://dashkit-react.vercel.app/img/avatars/profiles/avatar-1.jpg\" alt=\"Dianna Smiley\" />\n");
      out.write("                                                </div><a class=\"text-reset\" href=\"/profile-posts\">Dianna Smiley</a>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>Diseñadora</td>\n");
      out.write("                                            <td><a class=\"text-reset\"\n");
      out.write("                                                    href=\"mailto:diana.smiley@company.com\">diana.smiley@company.com</a>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td><a class=\"text-reset\" href=\"tel:9885683568\">9885683568</a></td>\n");
      out.write("                                            <td><span class=\"badge bg-soft-danger\">1/10</span></td>\n");
      out.write("                                            <td>Twitter</td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <div class=\"dropdown\"><span class=\"dropdown-ellipses dropdown-toggle\"\n");
      out.write("                                                        id=\"react-aria5016654841-16\" aria-expanded=\"false\"\n");
      out.write("                                                        role=\"button\"><svg width=\"17\" height=\"17\" viewBox=\"0 0 24 24\"\n");
      out.write("                                                            fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\"\n");
      out.write("                                                            stroke-linecap=\"round\" stroke-linejoin=\"round\"\n");
      out.write("                                                            class=\"feather feather-more-vertical \">\n");
      out.write("                                                            <g>\n");
      out.write("                                                                <circle cx=\"12\" cy=\"12\" r=\"1\"></circle>\n");
      out.write("                                                                <circle cx=\"12\" cy=\"5\" r=\"1\"></circle>\n");
      out.write("                                                                <circle cx=\"12\" cy=\"19\" r=\"1\"></circle>\n");
      out.write("                                                            </g>\n");
      out.write("                                                        </svg></span></div>\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                      \n");
      out.write("\n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"d-flex justify-content-between card-footer\">\n");
      out.write("                                <ul class=\"card-pagination pagination-tabs pagination\">\n");
      out.write("                                    <li class=\"ps-0 pe-4 border-end page-item disabled\"><span class=\"page-link\"\n");
      out.write("                                            disabled=\"\"><svg width=\"1em\" height=\"1em\" viewBox=\"0 0 24 24\" fill=\"none\"\n");
      out.write("                                                stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\"\n");
      out.write("                                                stroke-linejoin=\"round\" class=\"feather feather-arrow-left me-1\">\n");
      out.write("                                                <g>\n");
      out.write("                                                    <line x1=\"19\" y1=\"12\" x2=\"5\" y2=\"12\"></line>\n");
      out.write("                                                    <polyline points=\"12 19 5 12 12 5\"></polyline>\n");
      out.write("                                                </g>\n");
      out.write("                                            </svg> Anterior</span></li>\n");
      out.write("                                </ul>\n");
      out.write("                                <ul class=\"card-pagination pagination-tabs pagination\">\n");
      out.write("                                    <li class=\"page-item active\"><span class=\"page-link\">1<span\n");
      out.write("                                                class=\"visually-hidden\">(current)</span></span></li>\n");
      out.write("                                    <li class=\"page-item\"><a class=\"page-link\" role=\"button\" tabindex=\"0\">2</a></li>\n");
      out.write("                                    <li class=\"page-item\"><a class=\"page-link\" role=\"button\" tabindex=\"0\">3</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                                <ul class=\"card-pagination pagination-tabs pagination\">\n");
      out.write("                                    <li class=\"ps-4 pe-0 border-start page-item\"><a class=\"page-link\" role=\"button\"\n");
      out.write("                                            tabindex=\"0\">Siguiente <svg width=\"1em\" height=\"1em\" viewBox=\"0 0 24 24\"\n");
      out.write("                                                fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\"\n");
      out.write("                                                stroke-linecap=\"round\" stroke-linejoin=\"round\"\n");
      out.write("                                                class=\"feather feather-arrow-right ms-1\">\n");
      out.write("                                                <g>\n");
      out.write("                                                    <line x1=\"5\" y1=\"12\" x2=\"19\" y2=\"12\"></line>\n");
      out.write("                                                    <polyline points=\"12 5 19 12 12 19\"></polyline>\n");
      out.write("                                                </g>\n");
      out.write("                                            </svg></a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"main-content\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"justify-content-center row\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <script id=\"__NEXT_DATA__\"\n");
      out.write("        type=\"application/json\">{\"props\":{\"pageProps\":{}},\"buildId\":\"nrtWV97mGey8aZ6Gr9nFv\",\"scriptLoader\":[]}</script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
