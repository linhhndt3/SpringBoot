<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<tiles:insertDefinition name="template">
	<tiles:putAttribute name="body">
		<h1>Login to Application</h1>
		<form method="post" action="http://localhost:8080/login" >
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/> 
			<p>
				<input type="text" name="j_username" placeholder="Username">
			</p>
			<p>
				<input type="password" name="j_password" placeholder="Password">
			</p>
			<p>
				<input type="submit" name="commit" value="Login">
			</p>
		</form>
	</tiles:putAttribute>
</tiles:insertDefinition>