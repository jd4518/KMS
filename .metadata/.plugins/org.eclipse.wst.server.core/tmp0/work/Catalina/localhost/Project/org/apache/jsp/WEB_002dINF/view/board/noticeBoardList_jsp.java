/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.69
 * Generated at: 2016-06-17 07:22:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class noticeBoardList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
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

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"table-responsive\">\r\n");
      out.write("   <table class=\"table table-striped table-hover\" >\r\n");
      out.write("      <thead >\r\n");
      out.write("      <tr><td></td></tr>\r\n");
      out.write("         <tr style=\"color:#ffffff;\">\r\n");
      out.write("            <th>NO{{categoryNo}}</th>\r\n");
      out.write("            <th>제목</th>\r\n");
      out.write("            <th>ID</th>\r\n");
      out.write("            <th>작성자</th>\r\n");
      out.write("            <th>수정</th>\r\n");
      out.write("            <th>삭제</th>\r\n");
      out.write("         </tr>\r\n");
      out.write("      </thead>\r\n");
      out.write("      <tbody style=\"background-color:#ffffff\">\r\n");
      out.write("         <tr data-ng-repeat=\"notice in list.board\">\r\n");
      out.write("            <td>{{notice.RN}}</td>\r\n");
      out.write("            <td><a href=\"#/boardDetail/{{notice.BOARD_NO}}\">{{notice.BOARD_TITLE}} {{categoryNo}}</a></td>\r\n");
      out.write("            <td>{{notice.MEMBER_ID}}</td>\r\n");
      out.write("            <td>{{notice.MEMBER_NAME}}</td>\r\n");
      out.write("            <td><a href=\"#/shareModify/{{share.boardNum}}\" class=\"btn btn-success\">Edit...</a></td>\r\n");
      out.write("            <td><a href=\"#/shareDelete/{{share.boardNum}}\" class=\"btn btn-info\">Delete...</a></td>\r\n");
      out.write("         </tr>\r\n");
      out.write("         <tr><td class=\"text-center\" colspan=\"6\" >\r\n");
      out.write("         <div \r\n");
      out.write("                data-uib-pagination \r\n");
      out.write("                data-total-items=\"list.page.totalItem\" style=\"width:800px;\" \r\n");
      out.write("                data-ng-model=\"pageNo\"\r\n");
      out.write("                data-max-size=\"10\"\r\n");
      out.write("                data-ng-change=\"selectPage()\"\r\n");
      out.write("                data-boundary-links=\"true\">\r\n");
      out.write("            </div> \r\n");
      out.write("            </td>\r\n");
      out.write("           \r\n");
      out.write("         </tr>\r\n");
      out.write("      </tbody>\r\n");
      out.write("   </table>\r\n");
      out.write("   <div align=\"right\">\r\n");
      out.write("   <a href=\"#/BoardDetail\" class=\"btn btn-primary\">{{categoryNo}}게시글등록</a></th>\r\n");
      out.write("   </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
