<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head></head>
<body>
	<h1>Participants List</h1>

	<s:form action="participantsinfo">
		<table>
			<tr>
				<th>VzId</th>
				<th>FirstName</th>
				<th>LastName</th>
				<th>TeamName</th>
				<th>View Info</th>
			</tr>
			<s:iterator value="participants">
				<tr>
					<td><s:property value="vzId" /></td>
					<td><s:property value="firstName" /></td>
					<td><s:property value="lastName" /></td>
					<td><s:property value="teamName" /></td>
					<td><s:submit name="View Info" /></td>
				<tr>
			</s:iterator>
		</table>
	</s:form>
</body>
</html>