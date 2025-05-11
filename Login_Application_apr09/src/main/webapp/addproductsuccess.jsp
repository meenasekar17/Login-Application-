<%@ page import="com.nit.login.ProductBean" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.nit.login.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Added</title>
<style type="text/css">
body {
  background-color: #e9f1fb;
  font-family: Arial, sans-serif;
  margin: 0;
  padding: 0;
}

.main {
  font-size: 20px;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  margin: 60px auto;
  height: auto;
  width: 40%;
  padding: 45px;
  background-color: #ffffff;
  border-radius: 8px;
  border: 2px solid #ccc;
  box-shadow: 0 0 12px rgba(204, 204, 204, 0.4);
  text-align: center;
}

.main h1 {
  color: #333;
  margin-bottom: 15px;
}

.main h1 span {
  color: #d9534f; /* Bootstrap red */
}

.main h3 {
  color: #007bff;
  margin-bottom: 25px;
}

.btn {
  display: inline-block;
  padding: 10px 20px;
  background-color: #007bff;
  color: white;
  text-decoration: none;
  border: none;
  border-radius: 5px;
  font-size: 18px;
  cursor: pointer;
  transition: background-color 0.3s ease;
  margin: 10px;
}

.btn:hover {
  background-color: #0056b3;
}
</style>
</head>

<body>

<%
  AdminBean ab = (AdminBean)session.getAttribute("abean");
  ProductBean pb = (ProductBean)request.getAttribute("msg");
%>

<div class="main">
  <h1>WELCOME   <span><%= ab.getName().toUpperCase() %></span></h1>
  <h3>Product Successfully Added...</h3>  
  <a href="view" class="btn">View All Products</a>
  <a href="Logout" class="btn">Logout</a>
</div>

</body>
</html>
