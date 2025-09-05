package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class selectProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Select Your Profile</title>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Montserrat:wght@600;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            background-image: url('Selectback5.jpg');\n");
      out.write("            background-size: cover;\n");
      out.write("            background-position: center;\n");
      out.write("\n");
      out.write("  background-color: #000;\n");
      out.write("\n");
      out.write("            color: white;\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            text-align: center;\n");
      out.write("            padding-top: 50px;\n");
      out.write("        }\n");
      out.write("        h1 {\n");
      out.write("            font-size: 2.5rem;\n");
      out.write("            margin-bottom: 30px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .profiles {\n");
      out.write("    display: flex;\n");
      out.write("    justify-content: center;\n");
      out.write("    gap: 50px;\n");
      out.write("    flex-wrap: wrap;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".profile {\n");
      out.write("    cursor: pointer;\n");
      out.write("    transition: transform 0.3s;\n");
      out.write("    background: rgba(255, 255, 255, 0.05);\n");
      out.write("    padding: 20px;\n");
      out.write("    border-radius: 20px;\n");
      out.write("    border: none;\n");
      out.write("    text-align: center;\n");
      out.write("    width: 200px;\n");
      out.write("    box-shadow: 0 4px 15px rgba(255, 255, 255, 0.1);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".profile:hover {\n");
      out.write("    transform: scale(1.1);\n");
      out.write("    box-shadow: 0 6px 20px rgba(255, 255, 255, 0.25);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".profile img {\n");
      out.write("    border: 3px solid white;\n");
      out.write("    border-radius: 15px;\n");
      out.write("    width: 180px;\n");
      out.write("    height: 180px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".profile-name {\n");
      out.write("    margin-top: 15px;\n");
      out.write("    font-size: 1.5rem; /* bigger text */\n");
      out.write("    font-weight: 700;  /* bold */\n");
      out.write("    letter-spacing: 1px;\n");
      out.write("    text-shadow: 2px 2px 4px rgba(0,0,0,0.5); /* glow/shadow for readability */\n");
      out.write("    font-family: 'Montserrat', sans-serif; /* or try 'Poppins', 'Raleway', or any cool Google Font */\n");
      out.write("    color: #fff;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<h1>Who's watching?</h1>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<div class=\"profiles\">\n");
      out.write("    <form action=\"video.html\" method=\"post\">\n");
      out.write("        <button type=\"submit\" name=\"profile\" value=\"Bloom\" class=\"profile\">\n");
      out.write("            <img src=\"VAIBHU.jpeg\" alt=\"Bloom\">\n");
      out.write("            <div class=\"profile-name\">Bloom</div>\n");
      out.write("        </button>\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("    <form action=\"video.html\" method=\"post\">\n");
      out.write("        <button type=\"submit\" name=\"profile\" value=\"Halo\" class=\"profile\">\n");
      out.write("            <img src=\"BHAVI.jpeg\" alt=\"Halo\">\n");
      out.write("            <div class=\"profile-name\">Halo</div>\n");
      out.write("        </button>\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("    <form action=\"video.html\" method=\"post\">\n");
      out.write("         <button type=\"submit\" name=\"profile\" value=\"Drift\" class=\"profile\">\n");
      out.write("             <img src=\"SHITAL.jpeg\" alt=\"Drift\">\n");
      out.write("             <div class=\"profile-name\">Drift</div>\n");
      out.write("         </button>\n");
      out.write("     </form>\n");
      out.write("\n");
      out.write("    <form action=\"video.html\" method=\"post\">\n");
      out.write("        <button type=\"submit\" name=\"profile\" value=\"Daze\" class=\"profile\">\n");
      out.write("            <img src=\"RUTU.jpeg\" alt=\"daze\">\n");
      out.write("            <div class=\"profile-name\">Daze</div>\n");
      out.write("        </button>\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <form action=\"video.html\" method=\"post\">\n");
      out.write("        <button type=\"submit\" name=\"profile\" value=\"Floret\" class=\"profile\">\n");
      out.write("            <img src=\"TRUPS2.jpeg\" alt=\"Floret\">\n");
      out.write("            <div class=\"profile-name\">Floret</div>\n");
      out.write("        </button>\n");
      out.write("    </form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
