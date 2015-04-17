<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Page</title>
</head>
<body>

	<h1>Complaint Management</h1>

	<br>
	<table border="1">
		<th>Ticket ID</th>
		<th>EmailID</th>
		<th>Rating</th>
		<th>Feedback Time</th>

		<th>Ticket Status</th>
		<th>Source</th>
		<th>Sentiment</th>
		<th>Priority</th>
		<th>Department</th>
		<c:forEach items="${studentList}" var="stud">
			<tr>
				<td>${stud.ticketid}</td>
				<td>${stud.emailid}</td>
				<td>${stud.rating}</td>
				<td>${stud.feedbacktime}</td>

				<td>${stud.ticketstatus}</td>
				<td>${stud.source}</td>
				<td>${stud.sentiment}</td>
				<td>${stud.priority}</td>
				<td>${stud.department}</td>

			</tr>
		</c:forEach>
	</table>
</body>
</html>