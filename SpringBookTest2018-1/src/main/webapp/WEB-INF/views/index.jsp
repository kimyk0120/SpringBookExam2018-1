<html>
<head>
	<link rel="shortcut icon" href="/resources/icon/favicon.ico">
</head>
<body>
	<h1>
		Hello world!!  
	</h1>
	
	<P>  index </P>
	<P>  The time on the server is ${serverTime} </P>
	<P>  ${test} </P>
	<ul>
		<li>
			<a href="<c:url value='/echo' />">go echo app</a>	
		</li>
		<li>scriptlet:
			<%for(String hobby: java.util.Arrays.asList("sports","movies","music")){%>
			 <%= hobby %> 
			<% } %>	
		</li>
		<li>jstl:
			<c:forEach var="hobby" items="sports,movies,music">
				<c:out value="${hobby}"></c:out>
			</c:forEach>
		</li>
	</ul>
	
<script type="text/javascript">
(function(){
	
})();	
</script>	
</body>
</html>
