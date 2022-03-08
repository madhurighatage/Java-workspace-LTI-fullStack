<%@page contentType = "text/html;charset = UTF-8" language = "java" %>
<%@page isELIgnored = "false" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Inquries Login Page</title>
   </head>

   <body>
     	
     	<center><h1>Login Page..! </h1></center>
	<form:form action="/inquiries/login/authenticate" method="post" modelAttribute="loginBean">
		<table>
         
            <tr>
               <td><form:label path = "username">Username :  </form:label></td>
               <td><form:input path = "username" /></td>
            </tr>
            
            
            <tr>
               <td><form:label path = "password">Password : </form:label></td>
               <td><form:input path = "password" /></td>
            </tr>
         
         
          <tr>
               <td colspan = "2">
                  <input type = "submit" value = "Submit"/>
               </td>
            </tr>
            
           
            
         </table>
         </form:form>
            
              <a href="/inquiries/users/">Register Here...</a> &nbsp;&nbsp;&nbsp; | &nbsp;&nbsp;&nbsp;
            <a href="/inquiries/forgot/">Forgot Password</a><br><br>
     	
     	
     	</body>
   
</html>