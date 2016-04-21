<%@page language="java" import="project.*,java.util.*"%>
<%
AdminUI sh = (AdminUI) session.getAttribute("admin");
 if ((sh==null)){
     response.sendRedirect("Login.jsp?Error=-4");
     return;
 }
%>