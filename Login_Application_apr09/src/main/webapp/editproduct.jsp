<%@ page language="java" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8" import="com.nit.login.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Product</title>
<style>
body {
  background-color: #e9f1fb;
  font-family: Arial, sans-serif;
  margin: 0;
  padding: 0;
}

.main {
  font-size: 18px;
  width: 40%;
  margin: 60px auto;
  padding: 40px;
  background-color: #ffffff;
  border-radius: 8px;
  border: 2px solid #ccc;
  box-shadow: 0 0 12px rgba(204, 204, 204, 0.4);
}

.main h1 {
  text-align: center;
  color: #007bff;
  margin-bottom: 30px;
}

form {
  display: flex;
  flex-direction: column;
  gap: 20px;
  padding: 0 20px;
}

label {
  font-weight: bold;
  margin-bottom: 5px;
  color: #333;
}

input[type="text"] {
  padding: 10px;
  border: 2px solid #007bff;
  border-radius: 5px;
  font-size: 16px;
  width: 100%;
  box-sizing: border-box;
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
}

.btn:hover {
  background-color: #0056b3;
}
</style>
</head>
<body>

<%
  ProductBean pb = (ProductBean)request.getAttribute("pbean");
  AdminBean ab = (AdminBean)session.getAttribute("abean");
%>

<div class="main">
  <h1>Welcome <%= ab.getName().toUpperCase()%>...!!!</h1>
  <form action="update" method="post">
    <input type="hidden" name="code" value="<%= pb.getCode() %>">

    <label for="price">Product Price</label>
    <input type="text" id="price" name="price" value="<%= pb.getPrice() %>">

    <label for="stock">Product Stock</label>
    <input type="text" id="stock" name="stock" value="<%= pb.getStock() %>">

    <input type="submit" value="Update" class="btn">
  </form>
</div>

</body>
</html>
