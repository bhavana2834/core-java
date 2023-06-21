<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>patient application</title>
<style>
table, th, td {
  border: 1px solid black;
  border-radius: 10px;
  border-color:black;
}
 td {
 border-color:black;
  padding: 5px;
     background-color:silver;
}
th{
 border-color:black;
  padding: 5px;
     background-color:olive;
}
</style>


</head>
<body bgcolor = "teal">
           <h1>List of patient details</h1>

              <div align="center" width=50% >
              
               
     <form action ="searchByPatientName"  method="get">
     
     <input type="text" name="patientName" placeholder= "enter the patient name">
     <button>search</button>
     <br>
     </form>
     <br>
     <table cellpadding="5" width=35%>  
        <tr><th>slNo</th><th>PatientName</th><th>age</th><th>bloodGroup</th><th>email</th><th>Action</th></tr> 
      <c:forEach items="${data}" var="patient"> 
      <tr> 
   
   <td>${patient.getId()}</td>   
   <td>${patient.getPatientName()}</td>  
   <td>${patient.getAge()}</td>  
   <td>${patient.getBloodGroup()}</td>
    <td>${patient.getEmail()}</td>
   
   <td><a href="Update/${patient.getId()}">Update</a>
     <a href="Delete/${patient.getId()}">Delete</a>
   </td>
   
   </tr>  
   </c:forEach>   
     </table>  
   </div> 
   <br>  
</body>
</html>













