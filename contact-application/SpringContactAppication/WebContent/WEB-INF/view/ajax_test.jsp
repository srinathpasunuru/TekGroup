<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri = "http://www.springframework.org/tags" prefix ="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<s:url var = "ajax_url" value = "/Static/JS/jquery-3.3.1.min.js"/>
<script src = "${ajax_url}"></script>
<script>
	$(document).ready(function(){
		//alert('jquery is loaded correctly');
		$("#get_server_time").click(function(){
			
			//alert("button clicked");
			$.ajax({
				
				url : 'server_time',
				success : function(data){
					$("#server_time").html(data);
				}
			});	 
		});
	});
</script>
<title>test page</title>
</head>
<body>
	<h1> Testing AJAX</h1>
	<button id ="get_server_time">click to get time</button>
	<br/>
	<p id = "server_time"></p>
</body>
</html>