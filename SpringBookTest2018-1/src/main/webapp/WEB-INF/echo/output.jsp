<%@ page session="false" %>
<html>
<head>
	<title>input</title>
</head>
<body>
	<h2>output view</h2>
	<div>output text : '<span><c:out value="${ echoForm.text}"></c:out></span>'  </div>
	<br />
	<br />
	<div>
		<a href="<c:url value='/' />">on top</a>
	</div>
</body>
</html>
