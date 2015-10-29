<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head></head>
<body>
	<h1>Hackathon Participants List</h1>

	<s:form action="participantsinfo">
		<s:iterator value="participantslist">
		<table>
			<tr>
				<td><s:property value="vzId"/></td>
				<td><s:property value="firstName"/></td>
				<td><s:property value="lastName"/></td>
				<td><s:property value="teamName"/></td>
				<td><s:submit name="View Info"/></td>
			<tr>
		</table>
		</s:iterator>
	</s:form>
</body>
</html>