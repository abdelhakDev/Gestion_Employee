package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <!--\r\n");
      out.write("        ===\r\n");
      out.write("        This comment should NOT be removed.\r\n");
      out.write("\r\n");
      out.write("        Charisma v2.0.0\r\n");
      out.write("\r\n");
      out.write("        Copyright 2012-2014 Muhammad Usman\r\n");
      out.write("        Licensed under the Apache License v2.0\r\n");
      out.write("        http://www.apache.org/licenses/LICENSE-2.0\r\n");
      out.write("\r\n");
      out.write("        http://usman.it\r\n");
      out.write("        http://twitter.com/halalit_usman\r\n");
      out.write("        ===\r\n");
      out.write("    -->\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>Free HTML5 Bootstrap Admin Template</title>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <meta name=\"description\" content=\"Charisma, a fully featured, responsive, HTML5, Bootstrap admin template.\">\r\n");
      out.write("    <meta name=\"author\" content=\"Muhammad Usman\">\r\n");
      out.write("\r\n");
      out.write("    <!-- The styles -->\r\n");
      out.write("    <link id=\"bs-css\" href=\"css/bootstrap-cerulean.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <link href=\"css/charisma-app.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href='bower_components/fullcalendar/dist/fullcalendar.css' rel='stylesheet'>\r\n");
      out.write("    <link href='bower_components/fullcalendar/dist/fullcalendar.print.css' rel='stylesheet' media='print'>\r\n");
      out.write("    <link href='bower_components/chosen/chosen.min.css' rel='stylesheet'>\r\n");
      out.write("    <link href='bower_components/colorbox/example3/colorbox.css' rel='stylesheet'>\r\n");
      out.write("    <link href='bower_components/responsive-tables/responsive-tables.css' rel='stylesheet'>\r\n");
      out.write("    <link href='bower_components/bootstrap-tour/build/css/bootstrap-tour.min.css' rel='stylesheet'>\r\n");
      out.write("    <link href='css/jquery.noty.css' rel='stylesheet'>\r\n");
      out.write("    <link href='css/noty_theme_default.css' rel='stylesheet'>\r\n");
      out.write("    <link href='css/elfinder.min.css' rel='stylesheet'>\r\n");
      out.write("    <link href='css/elfinder.theme.css' rel='stylesheet'>\r\n");
      out.write("    <link href='css/jquery.iphone.toggle.css' rel='stylesheet'>\r\n");
      out.write("    <link href='css/uploadify.css' rel='stylesheet'>\r\n");
      out.write("    <link href='css/animate.min.css' rel='stylesheet'>\r\n");
      out.write("\r\n");
      out.write("    <!-- jQuery -->\r\n");
      out.write("    <script src=\"bower_components/jquery/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("    <script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("\r\n");
      out.write("    <!-- The fav icon -->\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"img/favicon.ico\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <!-- topbar starts -->\r\n");
      out.write("    <div class=\"navbar navbar-default\" role=\"navigation\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"navbar-inner\">\r\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle pull-left animated flip\">\r\n");
      out.write("                <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <a class=\"navbar-brand\" href=\"index.html\"> <img alt=\"Charisma Logo\" src=\"img/logo20.png\" class=\"hidden-xs\"/>\r\n");
      out.write("                <span>Charisma</span></a>\r\n");
      out.write("\r\n");
      out.write("            <!-- user dropdown starts -->\r\n");
      out.write("            <div class=\"btn-group pull-right\">\r\n");
      out.write("                <button class=\"btn btn-default dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                    <i class=\"glyphicon glyphicon-user\"></i><span class=\"hidden-sm hidden-xs\"> admin</span>\r\n");
      out.write("                    <span class=\"caret\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <ul class=\"dropdown-menu\">\r\n");
      out.write("                    <li><a href=\"#\">Profile</a></li>\r\n");
      out.write("                    <li class=\"divider\"></li>\r\n");
      out.write("                    <li><a href=\"login.html\">Logout</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- user dropdown ends -->\r\n");
      out.write("\r\n");
      out.write("            <!-- theme selector starts -->\r\n");
      out.write("            <div class=\"btn-group pull-right theme-container animated tada\">\r\n");
      out.write("                <button class=\"btn btn-default dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                    <i class=\"glyphicon glyphicon-tint\"></i><span\r\n");
      out.write("                        class=\"hidden-sm hidden-xs\"> Change Theme / Skin</span>\r\n");
      out.write("                    <span class=\"caret\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <ul class=\"dropdown-menu\" id=\"themes\">\r\n");
      out.write("                    <li><a data-value=\"classic\" href=\"#\"><i class=\"whitespace\"></i> Classic</a></li>\r\n");
      out.write("                    <li><a data-value=\"cerulean\" href=\"#\"><i class=\"whitespace\"></i> Cerulean</a></li>\r\n");
      out.write("                    <li><a data-value=\"cyborg\" href=\"#\"><i class=\"whitespace\"></i> Cyborg</a></li>\r\n");
      out.write("                    <li><a data-value=\"simplex\" href=\"#\"><i class=\"whitespace\"></i> Simplex</a></li>\r\n");
      out.write("                    <li><a data-value=\"darkly\" href=\"#\"><i class=\"whitespace\"></i> Darkly</a></li>\r\n");
      out.write("                    <li><a data-value=\"lumen\" href=\"#\"><i class=\"whitespace\"></i> Lumen</a></li>\r\n");
      out.write("                    <li><a data-value=\"slate\" href=\"#\"><i class=\"whitespace\"></i> Slate</a></li>\r\n");
      out.write("                    <li><a data-value=\"spacelab\" href=\"#\"><i class=\"whitespace\"></i> Spacelab</a></li>\r\n");
      out.write("                    <li><a data-value=\"united\" href=\"#\"><i class=\"whitespace\"></i> United</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- theme selector ends -->\r\n");
      out.write("\r\n");
      out.write("            <ul class=\"collapse navbar-collapse nav navbar-nav top-menu\">\r\n");
      out.write("                <li><a href=\"#\"><i class=\"glyphicon glyphicon-globe\"></i> Visit Site</a></li>\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                    <a href=\"#\" data-toggle=\"dropdown\"><i class=\"glyphicon glyphicon-star\"></i> Dropdown <span\r\n");
      out.write("                            class=\"caret\"></span></a>\r\n");
      out.write("                    <ul class=\"dropdown-menu\" role=\"menu\">\r\n");
      out.write("                        <li><a href=\"#\">Action</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Another action</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Something else here</a></li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li><a href=\"#\">Separated link</a></li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li><a href=\"#\">One more separated link</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <form class=\"navbar-search pull-left\">\r\n");
      out.write("                        <input placeholder=\"Search\" class=\"search-query form-control col-md-10\" name=\"query\"\r\n");
      out.write("                               type=\"text\">\r\n");
      out.write("                    </form>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- topbar ends -->\r\n");
      out.write("<div class=\"ch-container\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        \r\n");
      out.write("        <!-- left menu starts -->\r\n");
      out.write("        <div class=\"col-sm-2 col-lg-2\">\r\n");
      out.write("            <div class=\"sidebar-nav\">\r\n");
      out.write("                <div class=\"nav-canvas\">\r\n");
      out.write("                    <div class=\"nav-sm nav nav-stacked\">\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                     <ul class=\"nav nav-pills nav-stacked main-menu\">\r\n");
      out.write("                        <li class=\"nav-header\">Menu</li>\r\n");
      out.write("                        <li><a class=\"ajax-link\" href=\"accueil.jsp\"><i class=\"glyphicon glyphicon-home\"></i><span> Accueil</span></a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li><a class=\"ajax-link\" href=\"user.jsp\"><i class=\"glyphicon glyphicon-eye-open\"></i><span> Utilisateurs</span></a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li><a class=\"ajax-link\" href=\"contacts.jsp\"><i\r\n");
      out.write("                                    class=\"glyphicon glyphicon-edit\"></i><span> Contacts</span></a></li>\r\n");
      out.write("                        \r\n");
      out.write("                        <li><a href=\"deco.jsp\"><i class=\"glyphicon glyphicon-lock\"></i><span> Déconnexion</span></a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <label id=\"for-is-ajax\" for=\"is-ajax\"><input id=\"is-ajax\" type=\"checkbox\"> Ajax on menu</label>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--/span-->\r\n");
      out.write("        <!-- left menu ends -->\r\n");
      out.write("\r\n");
      out.write("        <noscript>\r\n");
      out.write("            <div class=\"alert alert-block col-md-12\">\r\n");
      out.write("                <h4 class=\"alert-heading\">Warning!</h4>\r\n");
      out.write("\r\n");
      out.write("                <p>You need to have <a href=\"http://en.wikipedia.org/wiki/JavaScript\" target=\"_blank\">JavaScript</a>\r\n");
      out.write("                    enabled to use this site.</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </noscript>\r\n");
      out.write("\r\n");
      out.write("        <div id=\"content\" class=\"col-lg-10 col-sm-10\">\r\n");
      out.write("            <!-- content starts -->\r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("    <ul class=\"breadcrumb\">\r\n");
      out.write("        <li>\r\n");
      out.write("            <a href=\"#\">Home</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <a href=\"#\">Blank</a>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("    <div class=\"box col-md-12\">\r\n");
      out.write("        <div class=\"box-inner\">\r\n");
      out.write("            <div class=\"box-header well\" data-original-title=\"\">\r\n");
      out.write("                <h2><i class=\"glyphicon glyphicon-star-empty\"></i> Blank</h2>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"box-icon\">\r\n");
      out.write("                    <a href=\"#\" class=\"btn btn-setting btn-round btn-default\"><i\r\n");
      out.write("                            class=\"glyphicon glyphicon-cog\"></i></a>\r\n");
      out.write("                    <a href=\"#\" class=\"btn btn-minimize btn-round btn-default\"><i\r\n");
      out.write("                            class=\"glyphicon glyphicon-chevron-up\"></i></a>\r\n");
      out.write("                    <a href=\"#\" class=\"btn btn-close btn-round btn-default\"><i\r\n");
      out.write("                            class=\"glyphicon glyphicon-remove\"></i></a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"box-content\">\r\n");
      out.write("                \r\n");
      out.write("                <!-- Button trigger modal -->\r\n");
      out.write("                <center>\r\n");
      out.write("<button type=\"button\" class=\"btn btn-primary btn-lg\" data-toggle=\"modal\" data-target=\"#myModal\">\r\n");
      out.write("Ajouter</button>\r\n");
      out.write("\r\n");
      out.write("<!-- Modal -->\r\n");
      out.write("<div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\">\r\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("    <div class=\"modal-content\">\r\n");
      out.write("      <div class=\"modal-header\">\r\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("        <h4 class=\"modal-title\" id=\"myModalLabel\">Ajouter un employé</h4>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-body\">\r\n");
      out.write("     <form name=\"f\" action=\"servl\" method=\"post\">\r\n");
      out.write("                    <table class=\"table table-responsive\">\r\n");
      out.write("<tr>\r\n");
      out.write("<td> nom :</td>\r\n");
      out.write("<td> <input class=\"form-control\" type=\"text\" name=\"nom\"> </td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td> prenom : </td>\r\n");
      out.write("<td> <input type=\"text\" class=\"form-control\" name=\"prenom\"> </td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td> login </td>\r\n");
      out.write("<td> <input type=\"text\" name=\"login\" class=\"form-control\" placeholder=\" ....\"> </td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td> mot de passe </td>\r\n");
      out.write("<td> <input type=\"password\" class=\"form-control\" name=\"mdp\" placeholder=\"saisie mot de passe\"> </td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td> salaire </td>\r\n");
      out.write("<td> <input type=\"number\" class=\"form-control\" min=\"400\" name=\"sal\"> </td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td> grade </td>\r\n");
      out.write("<td> <input type=\"text\" class=\"form-control\" name=\"grade\"> </td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("                    <input type=\"hidden\" name=\"page\" value=\"aj\">\r\n");
      out.write("</form>      </div>\r\n");
      out.write("      <div class=\"modal-footer\">\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Fermer</button>\r\n");
      out.write("        <button type=\"button\" onclick=\"f.submit();\" class=\"btn btn-primary\">Ajouter</button>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("                </center>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div><!--/row-->\r\n");
      out.write("\r\n");
      out.write("<table class=\"table table-striped table-bordered bootstrap-datatable datatable responsive\">\r\n");
      out.write("    <thead>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <th>Nom</th>\r\n");
      out.write("        <th>Prenom</th>\r\n");
      out.write("        <th>Login</th>\r\n");
      out.write("        <th>salaire</th>\r\n");
      out.write("        <th>Actions</th>\r\n");
      out.write("    </tr>\r\n");
      out.write("    </thead>\r\n");
      out.write("    <tbody>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td>nm</td>\r\n");
      out.write("        <td class=\"center\">prenom  </td>\r\n");
      out.write("        <td class=\"center\">log</td>\r\n");
      out.write("        <td class=\"center\">\r\n");
      out.write("            <span class=\"label-success label label-default\">salaire</span>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td class=\"center\">\r\n");
      out.write("               \r\n");
      out.write("            <a class=\"btn btn-info\" href=\"#\">\r\n");
      out.write("                <i class=\"glyphicon glyphicon-edit icon-white\"></i>\r\n");
      out.write("                modifer\r\n");
      out.write("            </a>\r\n");
      out.write("            <a class=\"btn btn-danger\" href=\"#\">\r\n");
      out.write("                <i class=\"glyphicon glyphicon-trash icon-white\"></i>\r\n");
      out.write("                Supprimer\r\n");
      out.write("            </a>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    \r\n");
      out.write("    </table>\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- content ends -->\r\n");
      out.write("    </div><!--/#content.col-md-0-->\r\n");
      out.write("</div><!--/fluid-row-->\r\n");
      out.write("\r\n");
      out.write("    <!-- Ad, you can remove it -->\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-9 col-lg-9 col-xs-9 hidden-xs\">\r\n");
      out.write("            <script async src=\"//pagead2.googlesyndication.com/pagead/js/adsbygoogle.js\"></script>\r\n");
      out.write("            <!-- Charisma Demo 2 -->\r\n");
      out.write("            <ins class=\"adsbygoogle\"\r\n");
      out.write("                 style=\"display:inline-block;width:728px;height:90px\"\r\n");
      out.write("                 data-ad-client=\"ca-pub-5108790028230107\"\r\n");
      out.write("                 data-ad-slot=\"3193373905\"></ins>\r\n");
      out.write("            <script>\r\n");
      out.write("                (adsbygoogle = window.adsbygoogle || []).push({});\r\n");
      out.write("            </script>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-2 col-lg-3 col-sm-12 col-xs-12 email-subscription-footer\">\r\n");
      out.write("            <div class=\"mc_embed_signup\">\r\n");
      out.write("                <form action=\"//halalit.us3.list-manage.com/subscribe/post?u=444b176aa3c39f656c66381f6&amp;id=eeb0c04e84\" method=\"post\" id=\"mc-embedded-subscribe-form\" name=\"mc-embedded-subscribe-form\" class=\"validate\" target=\"_blank\" novalidate>\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <label>Keep up with my work</label>\r\n");
      out.write("                        <input type=\"email\" value=\"\" name=\"EMAIL\" class=\"email\" placeholder=\"Email address\" required>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"power_field\"><input type=\"text\" name=\"b_444b176aa3c39f656c66381f6_eeb0c04e84\" tabindex=\"-1\" value=\"\"></div>\r\n");
      out.write("                        <div class=\"clear\"><input type=\"submit\" value=\"Subscribe\" name=\"subscribe\" class=\"button\"></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!--End mc_embed_signup-->\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Ad ends -->\r\n");
      out.write("\r\n");
      out.write("    <hr>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\"\r\n");
      out.write("         aria-hidden=\"true\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"modal-dialog\">\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("                <div class=\"modal-header\">\r\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\">Ã</button>\r\n");
      out.write("                    <h3>Settings</h3>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-body\">\r\n");
      out.write("                    <p>Here settings can be configured...</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-footer\">\r\n");
      out.write("                    <a href=\"#\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</a>\r\n");
      out.write("                    <a href=\"#\" class=\"btn btn-primary\" data-dismiss=\"modal\">Save changes</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <footer class=\"row\">\r\n");
      out.write("        <p class=\"col-md-9 col-sm-9 col-xs-12 copyright\">&copy; <a href=\"http://usman.it\" target=\"_blank\">Muhammad\r\n");
      out.write("                Usman</a> 2012 - 2015</p>\r\n");
      out.write("\r\n");
      out.write("        <p class=\"col-md-3 col-sm-3 col-xs-12 powered-by\">Powered by: <a\r\n");
      out.write("                href=\"http://usman.it/free-responsive-admin-template\">Charisma</a></p>\r\n");
      out.write("    </footer>\r\n");
      out.write("\r\n");
      out.write("</div><!--/.fluid-container-->\r\n");
      out.write("\r\n");
      out.write("<!-- external javascript -->\r\n");
      out.write("\r\n");
      out.write("<script src=\"bower_components/bootstrap/dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- library for cookie management -->\r\n");
      out.write("<script src=\"js/jquery.cookie.js\"></script>\r\n");
      out.write("<!-- calender plugin -->\r\n");
      out.write("<script src='bower_components/moment/min/moment.min.js'></script>\r\n");
      out.write("<script src='bower_components/fullcalendar/dist/fullcalendar.min.js'></script>\r\n");
      out.write("<!-- data table plugin -->\r\n");
      out.write("<script src='js/jquery.dataTables.min.js'></script>\r\n");
      out.write("\r\n");
      out.write("<!-- select or dropdown enhancer -->\r\n");
      out.write("<script src=\"bower_components/chosen/chosen.jquery.min.js\"></script>\r\n");
      out.write("<!-- plugin for gallery image view -->\r\n");
      out.write("<script src=\"bower_components/colorbox/jquery.colorbox-min.js\"></script>\r\n");
      out.write("<!-- notification plugin -->\r\n");
      out.write("<script src=\"js/jquery.noty.js\"></script>\r\n");
      out.write("<!-- library for making tables responsive -->\r\n");
      out.write("<script src=\"bower_components/responsive-tables/responsive-tables.js\"></script>\r\n");
      out.write("<!-- tour plugin -->\r\n");
      out.write("<script src=\"bower_components/bootstrap-tour/build/js/bootstrap-tour.min.js\"></script>\r\n");
      out.write("<!-- star rating plugin -->\r\n");
      out.write("<script src=\"js/jquery.raty.min.js\"></script>\r\n");
      out.write("<!-- for iOS style toggle switch -->\r\n");
      out.write("<script src=\"js/jquery.iphone.toggle.js\"></script>\r\n");
      out.write("<!-- autogrowing textarea plugin -->\r\n");
      out.write("<script src=\"js/jquery.autogrow-textarea.js\"></script>\r\n");
      out.write("<!-- multiple file upload plugin -->\r\n");
      out.write("<script src=\"js/jquery.uploadify-3.1.min.js\"></script>\r\n");
      out.write("<!-- history.js for cross-browser state change on ajax -->\r\n");
      out.write("<script src=\"js/jquery.history.js\"></script>\r\n");
      out.write("<!-- application script for Charisma demo -->\r\n");
      out.write("<script src=\"js/charisma.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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