/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-04-15 05:16:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.center;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class center_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("\t<!-- BEGIN HEAD -->\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n");
      out.write("        <title>学术星短视频后台管理系统</title>\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1\" name=\"viewport\" />\n");
      out.write("        \n");
      out.write("        <!-- 公用头部JS start -->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "common/commonHeaderCSS.jsp", out, false);
      out.write("\n");
      out.write("        <!-- 公用头部JS end -->\n");
      out.write("        \n");
      out.write("\t\t<style>\n");
      out.write("\t\t\t/* 设置jqgrid列中文字内容垂直居中 jqgrid 单元格自动换行 */\n");
      out.write("\t\t\t.ui-jqgrid tr.jqgrow td {\n");
      out.write("\t\t\t\tvertical-align:middle;\n");
      out.write("\t\t\t \twhite-space: normal !important; \n");
      out.write("\t\t\t \theight: auto; \n");
      out.write("\t\t\t \tword-break: break-all; \n");
      out.write("\t\t\t}\n");
      out.write("\t\t</style>\n");
      out.write("\t\t\n");
      out.write("    </head>\n");
      out.write("    <!-- END HEAD -->\n");
      out.write("\n");
      out.write("<body class=\"page-header-fixed page-sidebar-closed-hide-logo page-content-white\">\n");
      out.write("        <div class=\"page-wrapper\">\n");
      out.write("            \n");
      out.write("            <!-- 引入header页面 start -->\n");
      out.write("           \t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "common/header.jsp", out, false);
      out.write("\n");
      out.write("           \t<!-- 引入header页面  end -->\n");
      out.write("            \n");
      out.write("            <!-- BEGIN HEADER & CONTENT DIVIDER -->\n");
      out.write("            <div class=\"clearfix\"> </div>\n");
      out.write("            <!-- END HEADER & CONTENT DIVIDER -->\n");
      out.write("            \t\n");
      out.write("            \t<div class=\"page-container\">\n");
      out.write("            \t\n");
      out.write("            \t<!-- 菜单 start -->\n");
      out.write("            \t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "common/menu.jsp", out, false);
      out.write("\n");
      out.write("            \t<!-- 菜单 end -->\n");
      out.write("            \t\n");
      out.write("                <!-- BEGIN CONTENT -->\n");
      out.write("\t\t\t\t<div class=\"page-content-wrapper\">\n");
      out.write("\t\t\t\t    <!-- BEGIN CONTENT BODY -->    \n");
      out.write("\t\t\t\t    <div class=\"page-content\">\n");
      out.write("\t\t\t\t    \n");
      out.write("\t\t\t\t    \t<div class=\"page-content-body\">\n");
      out.write("\t\t\t\t    \t\n");
      out.write("\t\t\t\t\t        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "imooc.jsp", out, false);
      out.write("\n");
      out.write("\t\t\t\t\t        \n");
      out.write("\t\t\t\t        </div>\n");
      out.write("\t\t\t\t        \n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t\t    <!-- END CONTENT BODY -->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- END CONTENT -->\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <!-- END CONTAINER -->\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("            <!-- 引入footer页面 start -->\n");
      out.write("           \t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "common/footer.jsp", out, false);
      out.write("\n");
      out.write("           \t<!-- 引入footer页面  end -->\n");
      out.write("            \n");
      out.write("        \n");
      out.write("        <!-- 公用尾部JS start -->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "common/commonFooterJS.jsp", out, false);
      out.write("\n");
      out.write("        <!-- 公用尾部JS end -->\n");
      out.write("\t\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
