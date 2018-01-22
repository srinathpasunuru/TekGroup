<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri = "http://www.springframework.org/tags" prefix = "s" %>

<s:url var="logout_url" value = "/logout"/>

<c:if test="${sessionScope.userid==null}">
	<s:url var = "reg_url" value = "/reg_form"/>
	<a href = "#">Home</a> | <a href = "#">Login</a> | <a href = "${reg_url}">Register</a> | <a href = "#">About</a>
</c:if>

<c:if test="${sessionScope.userid!=null && sessionScope.user_role==1 }">
	<a href = "#">Home</a> | <a href = "<s:url value = "/admin/users"/>">User List</a> | <a href = "${logout_url}">Logout</a> 
</c:if>

<c:if test="${sessionScope.userid!=null && sessionScope.user_role==2 }">
	<s:url var="home_url" value = "/user/Dashboard"/>
	<s:url var="contact_url" value = "/user/contact_form"/>
	<s:url var="contact_list_url" value = "/user/contact_list"/>
	<a href = "${home_url}">Home</a> | <a href = "${contact_url}">Add Contact</a> | <a href = "${contact_list_url}">Contact List</a> | <a href = "${logout_url}">Logout</a> 
</c:if>
	
	
