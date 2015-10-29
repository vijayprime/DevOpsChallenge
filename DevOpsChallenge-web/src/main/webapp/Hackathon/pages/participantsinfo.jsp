<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head></head>
<body>
<img alt="logo"
		src="http://ss7.vzw.com/is/image/VerizonWireless/vzw-logo-156-130"
		width="156"
		style="border-top: 0px solid; border-right: 0px solid; border-bottom: 0px solid; margin: 0px; border-left: 0px solid;">
	<h1>Hackathon Participants List</h1>

	<s:form action="participantsinfo">
		<table border="1" style="border-collapse: collapse; border: black;background-color: red">
			<tr style="background: white"><td>VzId</td><td><s:property value="%{participant.vzId}" /></td></tr>
			<tr style="background: #CCCCCC"><td>FirstName</td><td><s:property value="%{participant.firstName}" /></td></tr>
			<tr style="background: white"><td>LastName</td><td><s:property value="%{participant.lastName}" /></td></tr>
			<tr style="background: #CCCCCC"><td>TeamName</td><td><s:property value="%{participant.teamName}" /></td></tr>
			<tr style="background: white"><td>Employee Id</td><td><s:property value="%{participant.empId}" /></td></tr>
			<tr style="background: #CCCCCC"><td>Challenge Id</td><td><s:property value="%{participant.challengeId}" /></td></tr>
			<tr style="background: white"><td>Portfolio</td><td><s:property value="%{participant.portfolio}" /></td></tr>
			<tr style="background: #CCCCCC"><td>Platform</td><td><s:property value="%{participant.platform}" /></td></tr>
			<tr style="background: white"><td>Mobile No</td><td><s:property value="%{participant.mobileNo}" /></td></tr>
			<tr style="background: #CCCCCC"><td>Food Preference</td><td><s:property value="%{participant.foodPref}" /></td></tr>
		</table>
	</s:form>
</body>
</html>