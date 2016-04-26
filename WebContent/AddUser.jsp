<%@include file="VerifyAdmin.jsp"%>

<html>
<head>
<title>Add User Form</title>
</head>
<body>
<form method="post" action="AddUser_action.jsp" name="addUser">
<table style="text-align: left; width: 500px; height: 117px;"
border="1" cellpadding="2" cellspacing="2">
<tbody>
<tr>
<td style="vertical-align: top;">First Name<br>
</td>
<td style="vertical-align: top;"><input name="firstName"><br>
</td>
</tr>
<tr>
<td style="vertical-align: top;">Last Name<br>
</td>
<td style="vertical-align: top;"><input name="lastName"> </td>
</tr>
<tr>
<td style="vertical-align: top;">Username<br>
</td>
<td style="vertical-align: top;"><input name="username"> </td>
</tr>
<tr>
<td style="vertical-align: top;">Password<br>
</td>
<td style="vertical-align: top;"><input name="password"> </td>
</tr>
<tr>
<td style="vertical-align: top;">Type<br>
</td>
<td style="vertical-align: top;"><input name="type"> </td>
</tr>
<tr>
<td style="vertical-align: top;">Status<br>
</td>
<td style="vertical-align: top;"><input name="status"></td>
</tr>
<tr>
<td style="vertical-align: top;"><input value="Add User"
name="Add" type="submit"></td>
<td style="vertical-align: top;"><input value="Cancel Changes"
name="Reset" type="reset"></td>
</tr>
</tbody>
</table>
<br>
</form>
<br>
</body>
</html>

