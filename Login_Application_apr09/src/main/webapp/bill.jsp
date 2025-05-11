<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "com.nit.login.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
 body {
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background-color: #f4f4f4;
        margin: 0;
        padding: 40px;
    }
    
    .main {
        max-width: 500px;
        margin: auto;
        background: #fff;
        padding: 30px 40px;
        border-radius: 10px;
        box-shadow: 0 5px 15px rgba(0, 0, 0, 0.1);
        
    }
    
   .btn {
  align-self: center;
  padding: 10px 30px;
  background-color: #007bff;
  color: white;
  border: none;
  border-radius: 5px;
  font-size: 16px;
  cursor: pointer;
  transition: background-color 0.3s ease;
  margin:20px;
  margin-left: 95px;
}

.btn:hover {
  background-color: #0056b3;
}

    a {
        
        text-decoration:none;
        text-align: center;
    }
    
</style>
</head>
<body>
<%
ProductBean pb = (ProductBean)request.getAttribute("pbean");
Integer ubuy = (Integer)request.getAttribute("ubuy");
Float total =(Float)request.getAttribute("total");
%>
<div class="main">
<form action="payment" method="post">
<h1 style= "text-align: center; color:#007bff;">Product Bill</h1>
<p style="text-align: center;">Product Name : <b> <%=pb.getName() %> </b></p>
<p style="text-align: center;">Required Product : <b><%=ubuy %></b></p>
<p style="text-align: center;">------------------</p>
<p style="text-align: center;">Total Bill : <b style="color:Red;"><%=total %></b></p> 
<input type="hidden" name="ubuy" value="<%=ubuy %>">
<input type="hidden" name="code" value="<%=pb.getCode() %>">
<input type="submit" value="payment" class="btn">
<a href="custview" class="btn"> Back</a>
</form>
</div>
</body>
</html>