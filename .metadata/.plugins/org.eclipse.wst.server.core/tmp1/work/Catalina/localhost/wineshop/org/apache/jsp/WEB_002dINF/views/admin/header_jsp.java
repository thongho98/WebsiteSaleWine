/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.22
 * Generated at: 2019-10-29 06:10:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/D:/ProjectWeb/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/wineshop/WEB-INF/lib/jstl-impl.jar!/META-INF/c.tld", Long.valueOf(1343794618000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-impl.jar", Long.valueOf(1479134681000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>header</title>\n");
      out.write("\n");
      out.write("<script type=\"application/x-javascript\">\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("<link\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/admin/css/bootstrap.css\"\n");
      out.write("\trel='stylesheet' type='text/css' />\n");
      out.write("<!-- Custom Theme files -->\n");
      out.write("<link\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/admin/css/style.css\"\n");
      out.write("\trel='stylesheet' type='text/css' />\n");
      out.write("<!--js-->\n");
      out.write("<script\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/admin/js/jquery-2.1.1.min.js\"></script>\n");
      out.write("<!--icons-css-->\n");
      out.write("<link\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/admin/css/font-awesome.css\"\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<!--Google Fonts-->\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Carrois+Gothic'\n");
      out.write("\trel='stylesheet' type='text/css'>\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Work+Sans:400,500,600'\n");
      out.write("\trel='stylesheet' type='text/css'>\n");
      out.write("<!--static chart-->\n");
      out.write("<script\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/admin/js/Chart.min.js\"></script>\n");
      out.write("<!--//charts-->\n");
      out.write("<!-- geo chart -->\n");
      out.write("<script\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/admin/js/modernizr.min.js\"\n");
      out.write("\ttype=\"text/javascript\"></script>\n");
      out.write("<script>\n");
      out.write("\twindow.modernizr\n");
      out.write("\t\t\t|| document\n");
      out.write("\t\t\t\t\t.write('<script src=\"lib/modernizr/modernizr-custom.js\"><\\/script>')\n");
      out.write("</script>\n");
      out.write("<!--<script src=\"lib/html5shiv/html5shiv.js\"></script>-->\n");
      out.write("<!-- Chartinator  -->\n");
      out.write("<script\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/admin/js/chartinator.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\tjQuery(function($) {\n");
      out.write("\n");
      out.write("\t\tvar chart3 = $('#geoChart').chartinator(\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\ttableSel : '.geoChart',\n");
      out.write("\n");
      out.write("\t\t\t\t\tcolumns : [ {\n");
      out.write("\t\t\t\t\t\trole : 'tooltip',\n");
      out.write("\t\t\t\t\t\ttype : 'string'\n");
      out.write("\t\t\t\t\t} ],\n");
      out.write("\n");
      out.write("\t\t\t\t\tcolIndexes : [ 2 ],\n");
      out.write("\n");
      out.write("\t\t\t\t\trows : [ [ 'China - 2015' ], [ 'Colombia - 2015' ],\n");
      out.write("\t\t\t\t\t\t\t[ 'France - 2015' ], [ 'Italy - 2015' ],\n");
      out.write("\t\t\t\t\t\t\t[ 'Japan - 2015' ], [ 'Kazakhstan - 2015' ],\n");
      out.write("\t\t\t\t\t\t\t[ 'Mexico - 2015' ], [ 'Poland - 2015' ],\n");
      out.write("\t\t\t\t\t\t\t[ 'Russia - 2015' ], [ 'Spain - 2015' ],\n");
      out.write("\t\t\t\t\t\t\t[ 'Tanzania - 2015' ], [ 'Turkey - 2015' ] ],\n");
      out.write("\n");
      out.write("\t\t\t\t\tignoreCol : [ 2 ],\n");
      out.write("\n");
      out.write("\t\t\t\t\tchartType : 'GeoChart',\n");
      out.write("\n");
      out.write("\t\t\t\t\tchartAspectRatio : 1.5,\n");
      out.write("\n");
      out.write("\t\t\t\t\tchartZoom : 1.75,\n");
      out.write("\n");
      out.write("\t\t\t\t\tchartOffset : [ -12, 0 ],\n");
      out.write("\n");
      out.write("\t\t\t\t\tchartOptions : {\n");
      out.write("\n");
      out.write("\t\t\t\t\t\twidth : null,\n");
      out.write("\n");
      out.write("\t\t\t\t\t\tbackgroundColor : '#fff',\n");
      out.write("\n");
      out.write("\t\t\t\t\t\tdatalessRegionColor : '#F5F5F5',\n");
      out.write("\n");
      out.write("\t\t\t\t\t\tregion : 'world',\n");
      out.write("\n");
      out.write("\t\t\t\t\t\tresolution : 'countries',\n");
      out.write("\n");
      out.write("\t\t\t\t\t\tlegend : 'none',\n");
      out.write("\n");
      out.write("\t\t\t\t\t\tcolorAxis : {\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\tcolors : [ '#679CCA', '#337AB7' ]\n");
      out.write("\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\ttooltip : {\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\ttrigger : 'focus',\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\tisHtml : true\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t\t});\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/admin/js/skycons.js\"\n");
      out.write("\ttype=\"text/javascript\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/admin/js/jquery.nicescroll.js\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/admin/js/scripts.js\"\n");
      out.write("\ttype=\"text/javascript\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/admin/js/bootstrap.js\"></script>\n");
      out.write("<base href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<div class=\"header-main\">\n");
      out.write("\t\t<div class=\"header-left\">\n");
      out.write("\t\t\t<div class=\"logo-name\">\n");
      out.write("\t\t\t\t<a href=\"admin/index.html\">\n");
      out.write("\t\t\t\t\t<h1>WineShop</h1> <!--<img id=\"logo\" src=\"\" alt=\"Logo\"/>-->\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!--search-box-->\n");
      out.write("\t\t\t<div class=\"search-box\">\n");
      out.write("\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t<input type=\"text\" placeholder=\"Search...\" required=\"\"> <input\n");
      out.write("\t\t\t\t\t\ttype=\"submit\" value=\"\">\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!--//end-search-box-->\n");
      out.write("\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"header-right\">\n");
      out.write("\t\t\t<div class=\"profile_details_left\">\n");
      out.write("\t\t\t\t<!--notifications of menu start -->\n");
      out.write("\t\t\t\t<ul class=\"nofitications-dropdown\">\n");
      out.write("\t\t\t\t\t<li class=\"dropdown head-dpdn\"><a href=\"#\"\n");
      out.write("\t\t\t\t\t\tclass=\"dropdown-toggle\" data-toggle=\"dropdown\"\n");
      out.write("\t\t\t\t\t\taria-expanded=\"false\"><i class=\"fa fa-envelope\"></i><span\n");
      out.write("\t\t\t\t\t\t\tclass=\"badge\">3</span></a>\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"notification_header\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h3>You have 3 new messages</h3>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"user_img\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"images/p4.png\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"notification_desc\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span>1 hour ago</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"odd\"><a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"user_img\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"images/p2.png\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"notification_desc\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span>1 hour ago</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"user_img\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"images/p3.png\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"notification_desc\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span>1 hour ago</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"notification_bottom\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">See all messages</a>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t</ul></li>\n");
      out.write("\t\t\t\t\t<li class=\"dropdown head-dpdn\"><a href=\"#\"\n");
      out.write("\t\t\t\t\t\tclass=\"dropdown-toggle\" data-toggle=\"dropdown\"\n");
      out.write("\t\t\t\t\t\taria-expanded=\"false\"><i class=\"fa fa-bell\"></i><span\n");
      out.write("\t\t\t\t\t\t\tclass=\"badge blue\">3</span></a>\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"notification_header\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h3>You have 3 new notification</h3>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"user_img\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"images/p5.png\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"notification_desc\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span>1 hour ago</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"odd\"><a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"user_img\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"images/p6.png\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"notification_desc\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span>1 hour ago</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"user_img\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"images/p7.png\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"notification_desc\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span>1 hour ago</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"notification_bottom\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">See all notifications</a>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t</ul></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!--notification menu end -->\n");
      out.write("\t\t\t<div class=\"profile_details\">\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li class=\"dropdown profile_details_drop\"><a href=\"#\"\n");
      out.write("\t\t\t\t\t\tclass=\"dropdown-toggle\" data-toggle=\"dropdown\"\n");
      out.write("\t\t\t\t\t\taria-expanded=\"false\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"profile_img\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"prfil-img\"><img\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"resources/admin/images/p1.png\" alt=\"\"> </span>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"user-name\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.adminsession.displayName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.adminsession.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-angle-down lnr\"></i> <i\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"fa fa-angle-up lnr\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu drp-mnu\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-cog\"></i> Settings</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-user\"></i> Profile</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"logout.html\"><i class=\"fa fa-sign-out\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\tLogout</a></li>\n");
      out.write("\t\t\t\t\t\t</ul></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t</div>\n");
      out.write("\t<!--heder end here-->\n");
      out.write("\t<!-- script-for sticky-nav -->\n");
      out.write("\t<script>\n");
      out.write("\t\t$(document).ready(function() {\n");
      out.write("\t\t\tvar navoffeset = $(\".header-main\").offset().top;\n");
      out.write("\t\t\t$(window).scroll(function() {\n");
      out.write("\t\t\t\tvar scrollpos = $(window).scrollTop();\n");
      out.write("\t\t\t\tif (scrollpos >= navoffeset) {\n");
      out.write("\t\t\t\t\t$(\".header-main\").addClass(\"fixed\");\n");
      out.write("\t\t\t\t} else {\n");
      out.write("\t\t\t\t\t$(\".header-main\").removeClass(\"fixed\");\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}