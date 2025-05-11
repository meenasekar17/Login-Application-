<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

 .main
{
  font-size: 20px;
  justify-content: center;
  align-items: center;
  margin:50px;
  height: 50vh; 
  width:48%;
  margin-left:280px;
  padding:45px;
  background-color: #f7f7f7; 
  border-radius: 5px;
  border: 2px solid #ccc;
  
}
 

.sub{
    background-color: #007bff;
    padding: 5%;
    font-size: 35px;
    color:white;
    margin-bottom: 15px;
    margin-right: 40px;
    text-align: center;
    width: 420px;
    margin-left: 50px;
    border-radius: 5px;
}
.btn
{
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
  margin: 20px;
 
}
</style>
</head>
<body>
<div class="main">
<div class="sub">
  <% String name=(String)request.getAttribute("msg");
  out.println("WELCOME : "+name.toUpperCase());
  %>
  </div>
  <br><br>
  <a href="insert.html" class="btn" style="margin-left:55px;">Add Product</a>
  
  <a href="view" class="btn">View All Product</a>
  <a href="Logout" class="btn">LogOut</a>
 </div>
</body>
</html>