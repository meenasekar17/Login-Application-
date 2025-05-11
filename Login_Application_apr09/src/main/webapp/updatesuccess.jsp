<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.nit.login.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dashboard</title>
<style>
body {
  background-color: #f0f0f0;
  font-family: Arial, sans-serif;
  margin: 0;
  padding: 0;
}

.main {
  width: 40%;
  margin: 60px auto;
  padding: 40px;
  background-color: #ffffff;
  border-radius: 8px;
  border: 2px solid #ccc;
  box-shadow: 0 0 12px rgba(204, 204, 204, 0.4);
  text-align: center;
}

.main h1 {
  text-align: center;
  color: #007bff;
  margin-bottom: 30px;
}

.main p {
  color: #555;
  font-size: 18px;
  margin-bottom: 30px;
}

.btn {
  display: inline-block;
  padding: 10px 20px;
  background-color: #007bff; /* Blue color applied */
  color: white;
  text-decoration: none;
  border: none;
  border-radius: 5px;
  font-size: 16px;
  cursor: pointer;
  transition: background-color 0.3s ease;
  margin: 10px 15px;
}

.btn:hover {
  background-color: #0056b3; /* Slightly darker blue on hover */
}
</style>
</head>
<body>

<%
  AdminBean ab = (AdminBean)session.getAttribute("abean");
  String msg = (String)request.getAttribute("msg");
%>

<div class="main">
  <h1>Welcome <%= ab.getName().toUpperCase() %>!!!</h1>
  <p><%= msg %></p>

  <a href="insert.html" class="btn">Add Product</a>
  <a href="view" class="btn">View All Products</a>
  <a href="Logout" class="btn">Log Out</a>
</div>

</body>
</html>
