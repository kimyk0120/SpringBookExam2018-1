<%@ page session="false" %>
<html>
<head>
	<title>index</title>
</head>
<body>
	<h1>
		Hello world!  
	</h1>
	
	<P>  index </P>
	<P>  The time on the server is ${serverTime}. </P>
	<ul>
		<li>
			<a href="<c:url value='/echo' />">에코 어플리케이션으로 이동</a>	
		</li>
	</ul>
</body>
</html>
