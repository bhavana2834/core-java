<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
           <form action="${pageContext.request.contextPath}/updatePatient"  method="get" >
           
          PatientId:<input  type="text"   value="${patient.getId()}"   name="id"><br> 
        PatientName : <input  type="text"    value="${patient.getPatientName()}"  name="PatientName"><br> 
		Age: <input  type="text"    value="${patient.getAge()}"    name="age"><br> 
		BloodGroup : <input  type="text"  value="${patient.getBloodGroup()}"  name="bloodGroup"><br> 
		Email : <input  type="text"  value="${patient.getEmail()}"  name="email"><br> 
		
       <input type="submit" value="submit">
       
       </form>
           
</body>
</html>