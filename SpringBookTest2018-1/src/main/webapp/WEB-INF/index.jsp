<%@ page session="false" %>
<html>
<head>
	<title>index</title>
</head>
<body>
	<h1>
		Hello world!!  
	</h1>
	
	<P>  index </P>
	<P>  The time on the server is ${serverTime}. </P>
	<P>  ${test}. </P>
	<ul>
		<li>
			<a href="<c:url value='/echo' />">go echo app</a>	
		</li>
	</ul>
	
<script type="text/javascript">
(function(){
	
})();	
</script>	
</body>
</html>
