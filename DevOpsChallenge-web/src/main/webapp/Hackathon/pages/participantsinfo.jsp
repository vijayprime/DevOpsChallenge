<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head></head>
<body>
	<h1>Participant Details</h1>

	<s:form action="participantsinfo">
		<table>
			<tr>VzId  : <s:property value="%{participant.vzId}" /></tr>
			<tr>FirstName : <s:property value="%{participant.firstName}" /></tr>
			<tr>LastName : <s:property value="%{participant.lastName}" /></tr>
			<tr>TeamName : <s:property value="%{participant.teamName}" /></tr>
			<tr>Employee Id : <s:property value="%{participant.empId}" /></tr>
			<tr>Challenge Id : <s:property value="%{participant.challengeId}" /></tr>
			<tr>Portfolio : <s:property value="%{participant.portfolio}" /></tr>
			<tr>Platform : <s:property value="%{participant.platform}" /></tr>
			<tr>Mobile No : <s:property value="%{participant.mobileNo}" /></tr>
			<tr>Food Preference : <s:property value="%{participant.foodPref}" /></tr>
		</table>
	</s:form>
</body>
</html>