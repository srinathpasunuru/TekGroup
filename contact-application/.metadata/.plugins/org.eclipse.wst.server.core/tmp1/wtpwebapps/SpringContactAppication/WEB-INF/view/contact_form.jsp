<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Contact Form</title>
	<s:url var="url_css" value="/Static/css/style.css"/>
	<link href="${url_css}" rel="stylesheet" type="text/css"/>
</head>
<s:url var="url_bg" value="/Static/Images/bd.jpg"/>
<body background="${url_bg}">
	<table border = "1"  width = "80%" align = "center">
		<tr>
			<td height = "100px">
				<jsp:include page="include/header.jsp"/>
			</td>
		</tr>
		<tr>
			<td height = "25px">
				<jsp:include page = "include/menu.jsp"/>
			</td>
		</tr>
		<tr>
			<td height = "350px" valign = "top">
				<h3>Contact form</h3>
				<c:if test = "${err!=null}">
					<p class = "error"> ${err}</p>
				</c:if>
				<s:url var = "contact_save_url" value="/user/save_contact"></s:url>
				<f:form action = "${contact_save_url}" modelAttribute = "command">
					<table border = "1">
						<tr>
							<td>Name</td>
							<td><f:input path = "name"/></td>
						</tr>
						<tr>
							<td>phone</td>
							<td><f:input path = "phone"/></td>
						</tr>
						<tr>
							<td>address</td>
							<td><f:textarea path = "address"/></td>
						</tr>
						<tr>
							<td>email</td>
							<td><f:input path = "email"/></td>
						</tr>
						<tr>
							<td>remark</td>
							<td><f:textarea path = "remark"/></td>
						</tr>
						<tr>
							<td colspan = "2" align = "right">
								<button>Save</button><br>
							</td>
						</tr>
					</table>
				</f:form>	
			</td>
		</tr>
		<tr>
			<td height = "25px">
				<jsp:include page = "include/footer.jsp"/>
			</td>
		</tr>
		
	</table>
</body>
</html>