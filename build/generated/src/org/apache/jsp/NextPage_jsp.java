package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import javax.servlet.*;

public final class NextPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(" \n");
      out.write(" \n");
      out.write(" ");

     String email = (String) session.getAttribute("user_email");
     if(email == null){
         email = ""; // Default to empty if not set
     }
 
      out.write("\n");
      out.write(" <!DOCTYPE html>\n");
      out.write(" <html lang=\"en\">\n");
      out.write(" <head>\n");
      out.write("     <meta charset=\"UTF-8\">\n");
      out.write("     <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("     <title>Netflix Login</title>\n");
      out.write("     <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("     <script src=\"https://kit.fontawesome.com/a076d05399.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("     <style>\n");
      out.write("         body {\n");
      out.write("           background: linear-gradient(to right, #000000, #141414);\n");
      out.write("           color: white;\n");
      out.write("           font-family: 'Arial', sans-serif;\n");
      out.write("           display: flex;\n");
      out.write("           align-items: center;\n");
      out.write("           justify-content: center;\n");
      out.write("           height: 100vh;\n");
      out.write("         }\n");
      out.write("\n");
      out.write("         .login-container {\n");
      out.write("           background: rgba(20, 20, 20, 0.9);\n");
      out.write("           padding: 40px;\n");
      out.write("           border-radius: 8px;\n");
      out.write("           box-shadow: 0px 8px 16px rgba(0, 0, 0, 0.5);\n");
      out.write("           max-width: 400px;\n");
      out.write("           width: 100%;\n");
      out.write("         }\n");
      out.write("         .form-control {\n");
      out.write("           background: #333;\n");
      out.write("           border: none;\n");
      out.write("           color: white;\n");
      out.write("         }\n");
      out.write("         .form-control:focus {\n");
      out.write("           background: #444;\n");
      out.write("           color: white;\n");
      out.write("           box-shadow: none;\n");
      out.write("         }\n");
      out.write("         .btn-netflix {\n");
      out.write("           background: #e50914;\n");
      out.write("           color: white;\n");
      out.write("           width: 100%;\n");
      out.write("           padding: 12px;\n");
      out.write("           font-size: 16px;\n");
      out.write("           font-weight: bold;\n");
      out.write("           transition: 0.3s;\n");
      out.write("         }\n");
      out.write("         .btn-netflix:hover {\n");
      out.write("           background: #f40612;\n");
      out.write("         }\n");
      out.write("         .alert {\n");
      out.write("           display: none;\n");
      out.write("           margin-top: 10px;\n");
      out.write("         }\n");
      out.write("         .logo {\n");
      out.write("           text-align: center;\n");
      out.write("           margin-bottom: 20px;\n");
      out.write("         }\n");
      out.write("     </style>\n");
      out.write(" </head>\n");
      out.write(" <body>\n");
      out.write(" <div class=\"login-container\">\n");
      out.write("     <div class=\"logo\">\n");
      out.write("         <img src=\"logoNETFLIX.jpg\" alt=\"Netflix Logo\" width=\"150\">\n");
      out.write("     </div>\n");
      out.write("     <h3 class=\"text-center\">Sign In</h3>\n");
      out.write("     <div class=\"mb-3\">\n");
      out.write("         <label class=\"form-label\">Email</label>\n");
      out.write("         <input type=\"email\" class=\"form-control\" id=\"email\" value=\"");
      out.print( email );
      out.write("\" >\n");
      out.write("     </div>\n");
      out.write("     <div class=\"mb-3\">\n");
      out.write("         <label class=\"form-label\">Password</label>\n");
      out.write("         <input type=\"password\" class=\"form-control\" id=\"password\" placeholder=\"Enter your password\">\n");
      out.write("     </div>\n");
      out.write("     <div class=\"alert alert-warning\" id=\"alertBox\">\n");
      out.write("         <i class=\"fas fa-exclamation-triangle\"></i> Incorrect password. Try again or reset.\n");
      out.write("     </div>\n");
      out.write("     <button class=\"btn btn-netflix\" onclick=\"checkPassword()\">Sign In</button>\n");
      out.write("     <div class=\"text-center mt-3\">\n");
      out.write("         <a href=\"#\" class=\"text-white\">Forgot password?</a>\n");
      out.write("     </div>\n");
      out.write(" </div>\n");
      out.write("\n");
      out.write(" <script>\n");
      out.write("     var correctPassword = 'Fixed@123';\n");
      out.write("     function checkPassword() {\n");
      out.write("  var password = document.getElementById('password').value;\n");
      out.write("  var alertBox = document.getElementById('alertBox');\n");
      out.write("  if (password !== correctPassword) {\n");
      out.write("    alertBox.style.display = 'block';\n");
      out.write("  } else {\n");
      out.write("    alertBox.style.display = 'none';\n");
      out.write("    window.location.href = 'selectProfile.jsp'; // Redirect on success\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("     \n");
      out.write(" </script>\n");
      out.write(" </body>\n");
      out.write(" </html>\n");
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
