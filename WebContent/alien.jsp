<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ page import="java.util.*"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>

<body>
	<html:form action="/AlienInfo" focus="alien">
		<div id="wrapper">
			<div id="header">
				<h2>Alien List</h2>
				No of Alien required
				<html:text property="count" />
			</div>
		</div>
		<fieldset>
			<legend class="legendStyle">Current Alien List</legend>
			<table border="1" width="100%" class="dataTableStyle">
				<tr>
					<th id="alienId">Alien Id</th>
					<th id="alienName">Alien Name</th>
					<th id="alienPlanet">Alien Planet</th>
					<th id="age">Age</th>
				</tr>

				<c:forEach items="${alienForm.alienDTO_List}" var="element"
					varStatus="rowIndex">
					<tr>
						<td><c:out
								value="${alienForm.alienDTO_List[rowIndex.index].alienId}" /></td>
						<td><c:out
								value="${alienForm.alienDTO_List[rowIndex.index].alienName}" /></td>
						<td><c:out
								value="${alienForm.alienDTO_List[rowIndex.index].alienPlanet}" /></td>
						<td><c:out
								value="${alienForm.alienDTO_List[rowIndex.index].age}" /></td>
					</tr>
				</c:forEach>


			</table>
		</fieldset>
		<fieldset>
			<legend class="legendStyle">Add Alien</legend>
			<div id="container">
				Alien Id:
				<html:text property="alienDTO.alienId" />
				<br> Alien Name :
				<html:text property="alienDTO.alienName" />
				<br> Alien Planet:
				<html:text property="alienDTO.alienPlanet" />
				<br> Age
				<html:text property="alienDTO.age" />
				<br>
				<html:submit value="Add Alien" />
			</div>
		</fieldset>
	</html:form>
</body>
</html>