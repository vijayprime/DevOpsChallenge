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
			<tr>
				<th width="15%" style="color: white">VzId</th>
				<th width=20% style="color: white">FirstName</th>
				<th width=23% style="color: white">LastName</th>
				<th width=30% style="color: white">TeamName</th>
				<th width=27% style="color: white">View Info</th>
			</tr>
			 <s:iterator value="participants" status="stat">
				<s:if test="#stat.even == true">
					<tr style="background: white">
						<td width="20%"><s:property value="vzId" /></td>
						<td width=20%><s:property value="firstName" /></td>
						<td width=25%><s:property value="lastName" /></td>
						<td width=25%><s:property value="teamName" /></td>
						<td width=20%><input type="submit" name="view info" value="view info"/></td>
					<tr>
				</s:if>
				<s:else>
					<tr style="background: #CCCCCC">
						<td width="20%"><s:property value="vzId" /></td>
						<td width=20%><s:property value="firstName" /></td>
						<td width=25%><s:property value="lastName" /></td>
						<td width=25%><s:property value="teamName" /></td>
						<td width=20%><input type="submit" name="view info" value="view info"/></td>
					<tr>
				</s:else>
			</s:iterator>
		</table>
	</s:form>
</body>
</html>