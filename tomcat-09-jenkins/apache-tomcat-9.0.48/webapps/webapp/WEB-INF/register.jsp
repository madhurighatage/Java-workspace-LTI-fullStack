<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored = "false" %>

<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Page</title>
</head>
<body>
		
		
		
	<center><h1>User Registration Page </h1></center>

	<a href="/inquiries/login">Back</a> <br><br><br>

	<form:form action="/inquiries/users/save" method="post" 
	modelAttribute="userBean">
		<table>
         
            <tr>
               <td><form:label path = "userId">User Id : </form:label></td>
               <td><form:input path = "userId" /></td>
            </tr>
            
            
            <tr>
               <td><form:label path = "firstName">User FirstName : </form:label></td>
               <td><form:input path = "firstName" /></td>
            </tr>
            
            
            <tr>
               <td><form:label path = "lastName">User LastName : </form:label></td>
               <td><form:input path = "lastName" /></td>
            </tr>
            
            
             <tr>
               <td><form:label path = "gender">Gender Type : </form:label></td>
               <td>
               	<form:radiobutton path="gender" value="Male"/> Male
               	<form:radiobutton path="gender" value="Female"/> Female
               </td>
            </tr>
            
            <tr>
               <td><form:label path = "email">User Email : </form:label></td>
               <td><form:input path = "email" /></td>
            </tr>
            
            
             
            <tr>
               <td><form:label path = "contactNumber">User Mobile : </form:label></td>
               <td><form:input path = "contactNumber" /></td>
            </tr>
            
            <tr>
               <td><form:label path = "address.city">Enter City: </form:label></td>
               <td><form:input path = "address.city" /></td>
            </tr>
            
            <tr>
               <td><form:label path = "address.state">Enter State: </form:label></td>
               <td><form:input path = "address.state" /></td>
            </tr>
            
            <tr>
               <td><form:label path = "address.pincode">Enter Pincode: </form:label></td>
               <td><form:input path = "address.pincode" /></td>
            </tr>
            
            
            <tr>
               <td><form:label path = "collegeName">College Name : </form:label></td>
               <td><form:input path = "collegeName" /></td>
            </tr>
            
             <tr>
               <td><form:label path = "graduation">Graduation : </form:label></td>
               <td><form:input path = "graduation" /></td>
            </tr>
            
            
              <tr>
               <td><form:label path = "passYear">Passing Year : </form:label></td>
               <td><form:input path = "passYear" /></td>
            </tr>
            
            <tr>
               <td><form:label path = "username">UserName : </form:label></td>
               <td><form:input path = "username" /></td>
            </tr>
            
            
             <tr>
               <td><form:label path = "password">Password : </form:label></td>
               <td><form:input path = "password" /></td>
            </tr>
            
            
             
             <tr>
               <td><form:label path = "confirmPassword">Confirm Password : </form:label></td>
               <td><form:input path = "confirmPassword" /></td>
            </tr>
            
             <tr>
               <td colspan = "2">
                  <input type = "submit" value = "Submit"/>
               </td>
            </tr>
            
            
        </table>
	</form:form>


</body>
</html>