<html>
<head>
	
</head>
<body>
	<h5>
		Hello world
	</h5>
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
		<%-- <li>
			<form:form modelAttribute="echoForm">
					<form:textarea path="textAreaVal"/>
					<form:errors path="text"/>
					<form:button>send</form:button>
			</form:form>
		</li> --%>
		<li>
			<spring:eval expression="@hobbyCodeList" var="hobbyCodeList"></spring:eval>
			${hobbyCodeList}
		</li>
		
		
	
	</ul>
	
	
	
	
<script type="text/javascript">
(function(){
	
})();	
</script>	
</body>
</html>
