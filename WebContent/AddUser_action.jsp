<%@include file="VerifyAdmin.jsp"%>
<%    
	  String firstName = request.getParameter("firstName");
	  String lastName = request.getParameter("lastName");
	  String username = request.getParameter("username");
	  String password = request.getParameter("password");
	  String type = request.getParameter("type");
	  String status = request.getParameter("status");
	  char type1 = type.charAt(0);
	  char status1 = status.charAt(0);
	  if(type1 == 'a') {
		Admin s = new Admin(firstName,lastName,username, password, type1, status1);
		ah.addAdmin(s);
	  }
	  else {
	  	Student s = new Student(firstName,lastName, username, password, type1, status1);
	  	ah.addStudent(s);
	  }
	  response.sendRedirect("AdminMenu.jsp");     
	%>