<%@page language="java" import="project.*"%>
<title></title>
</head>
<body>
<% StudentUI sh = (StudentUI)session.getAttribute("studentH");
out.println("Hello " + (sh.getStudentInfo()).getFirstName());%>
<br>
<a href="search.jsp">Search for Schools</a><br>
<a href="SavedSchool.jsp">Manage My Saved Schools</a><br>
<a href="Edit.jsp">Manage My Profile</a><br>
<br>
</body>
</html>