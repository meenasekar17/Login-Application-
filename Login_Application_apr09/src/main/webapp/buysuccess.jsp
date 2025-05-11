<%@page import="com.nit.login.CustomerBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Message</title>
<style>
    body {
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background-color: #f4f4f4;
        padding: 40px;
        text-align: center;
    }

    .message-box {
        display: inline-block;
        padding: 20px 30px;
        border-radius: 8px;
        font-size: 18px;
        font-weight: bold;
        margin-top: 40px;
        box-shadow: 0 2px 8px rgba(0,0,0,0.1);
    }

    .success {
        background-color: #d4edda;
        color: #155724;
        border: 1px solid #c3e6cb;
    }

    .error {
        background-color: #f8d7da;
        color: #721c24;
        border: 1px solid #f5c6cb;
    }

    .info {
        background-color: #d1ecf1;
        color: #0c5460;
        border: 1px solid #bee5eb;
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
    
     .main {
        max-width: 500px;
        margin: auto;
        background: #fff;
        padding: 30px 40px;
        border-radius: 10px;
        box-shadow: 0 5px 15px rgba(0, 0, 0, 0.1);
    }

</style>
</head>
<body>

<%
CustomerBean cb = (CustomerBean) session.getAttribute("cbean");
String msg = (String) request.getAttribute("msg");
String msgType = (String) request.getAttribute("type"); // "success", "error", or "info"
if (msgType == null) {
    msgType = "info"; // default
}
%>
<div class="main">
<h1 style="text-align: center;color: #007bff;">WELCOME <%=cb.getUname().toUpperCase() %> </h1>
<div class="message-box <%= msgType %>">
    <%= msg %>
</div><br><br>
<a href="custview" class="btn">ViewAllProduct</a>
<a href="Logout" class="btn">Logout</a>
</div>
</body>
</html>
