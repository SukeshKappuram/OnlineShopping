package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Online Shopping</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Online Shopping</title>\n");
      out.write("        <style>\n");
      out.write("            .header{\n");
      out.write("                background-color: orange;\n");
      out.write("                width: 100%;\n");
      out.write("                height: 100px;\n");
      out.write("            }\n");
      out.write("            .footer{\n");
      out.write("                background-color: orange;\n");
      out.write("                width: 100%;\n");
      out.write("                height: 50px;\n");
      out.write("                bottom:0px;\n");
      out.write("                position: fixed;\n");
      out.write("            }\n");
      out.write("            nav{\n");
      out.write("                width: 100%;\n");
      out.write("                background-color: chocolate;\n");
      out.write("            }\n");
      out.write("            nav a{\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: wheat;\n");
      out.write("                font-size: 20px;\n");
      out.write("                padding-left: 50px;\n");
      out.write("                padding-right: 50px;\n");
      out.write("                padding-top: 10px;\n");
      out.write("                padding-bottom: 10px;\n");
      out.write("            }\n");
      out.write("            .img-br{\n");
      out.write("                padding-top: 20px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class='header'>\n");
      out.write("            <h1 style=\"text-align:center;color: blueviolet;font-size: 50px;\">Online Shopping</h1>\n");
      out.write("            <nav>\n");
      out.write("                <a href='#'>Home</a> | \n");
      out.write("                <a href='#'>About Us</a> | \n");
      out.write("                <a href='#'>Contact Us</a> | \n");
      out.write("                <a href='#'>Help</a> | \n");
      out.write("                <a href='#'>feedback</a>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <div class='content'>\n");
      out.write("            <img class='img-br' src='http://listdose.co/wp-content/uploads/2013/08/deprives-you-of-tangibility.jpg' alt='Online Shopping'/>\n");
      out.write("        </div>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class='footer'>\n");
      out.write("            <h6 style='text-align:center;color: blueviolet;'>&copy Copyright to Sukesh 2017</h6>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    </body>\n");
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
