<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Status Message</title>
<style>
body {
  background-color: #f0f0f0;
  font-family: Arial, sans-serif;
  margin: 0;
  padding: 0;
}

.main {
  width: 40%;
  margin: 80px auto;
  padding: 40px;
  background-color: #ffffff;
  border-radius: 8px;
  border: 2px solid #ccc;
  box-shadow: 0 0 10px rgba(204, 204, 204, 0.4);
  text-align: center;
}

.main h3 {
  font-size: 22px;
  color: #333;
  margin-bottom: 30px;
}

.btn {
  display: inline-block;
  padding: 10px 20px;
  background-color: #007bff;
  color: white;
  text-decoration: none;
  border: none;
  border-radius: 5px;
  font-size: 16px;
  cursor: pointer;
  transition: background-color 0.3s ease;
  margin: 5px 10px;
}

.btn:hover {
  background-color: #0056b3;
}
</style>
</head>
<body>

<%
  String msg = (String)request.getAttribute("msg");
%>

<div class="main">
  <h3><%= msg %></h3>
  <a href="insert.html" class="btn">Add Product</a>
  <a href="view" class="btn">View All Products</a>
  <a href="Logout" class="btn">Log Out</a>
</div>

</body>
</html>
