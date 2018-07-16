<%@ page session="false" %>
<html>
<head>
	<title>input</title>
</head>
<body>
	<h2>input view</h2>
	<form:form modelAttribute="echoForm">
		<div>text input</div>
		<div>
			<form:input path="text"/>
		</div>
		<div>
			<form:button>send</form:button>
		</div>
	</form:form>
</body>
</html>
