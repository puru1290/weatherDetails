<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Wether Details</title>
</head>
<script type="text/javascript">
	function submitFun() {
		document.forms[0].cityName = document.getElementById("cityName").value;
		document.forms[0].action = "/wether/indexPage.action";
		document.forms[0].submit();
	}
</script>
<body>
	<form action="/indexPage.do" id="indexPage" method="POST">
		<table style="text-align: center;margin-left: 27%">
			<tr>
				<td><h1>Get Weather Detail by City</h1></td>
			</tr>
			<tr>
				<td><s:textfield name="cityName" label="City" id="cityName"></s:textfield>
				</td>

			</tr>
			<tr>
				<td><input type="button" value="Submit"
					onclick="return submitFun()"></td>
			</tr>
		</table>
		</br>
		<table style="margin-left: 39%">
			<tr>
				<td><s:label name="wetherDetailForm.location.name" label="City" /></td>
				<td><s:label name="wetherDetailForm.location.region"
						label="State" /></td>
				<td><s:label name="wetherDetailForm.location.country"
						label="Country" /></td>
			</tr>
			<tr>
				<td><s:label name="wetherDetailForm.location.lat"
						label="Latitude" /></td>
				<td><s:label name="wetherDetailForm.location.lon"
						label="Longitude" /></td>
			</tr>
			<tr>
				<td><s:label name="wetherDetailForm.location.tz_id"
						label="TimeZone" /></td>
				<td><s:label name="wetherDetailForm.location.localtime"
						label="Local Time" /></td>
			</tr>
			<tr>
				<td><s:label name="wetherDetailForm.current.temp_c"
						label="Temperature in celsius" /></td>
				<td><s:label name="wetherDetailForm.current.temp_f"
						label="Temperature in fahrenheit" /></td>
				<td><s:label name="wetherDetailForm.current.humidity"
						label="Humidity" /></td>
			</tr>
		</table>
	</form>
</body>
</html>