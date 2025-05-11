<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "com.nit.login.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page</title>
<style>
    body {
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background-color: #f2f2f2;
        margin: 0;
        padding: 50px 0;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .main {
        background-color: #fff;
        padding: 40px;
        width: 380px;
        border-radius: 10px;
        border: 1px solid #ddd;
        box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
        text-align: center;
    }

    h2 {
        color: #007bff;
        margin-bottom: 20px;
    }

    p {
        font-size: 18px;
        color: #333;
        margin-bottom: 30px;
    }

    .btn {
        display: inline-block;
        padding: 12px 25px;
        background-color: #007bff;
        color: white;
        text-decoration: none;
        border-radius: 6px;
        font-size: 16px;
        font-weight: 500;
        transition: background-color 0.3s ease, transform 0.2s;
    }

    .btn:hover {
        background-color: #0056b3;
        transform: scale(1.05);
    }
</style>
</head>

<body>
<%
 CustomerBean cb = (CustomerBean) session.getAttribute("cbean");
 String msg = (String) request.getAttribute("msg");
%>
<div class="main">
    <h2>WELCOME <%= cb.getUname().toUpperCase() %></h2>
    <p><%= msg %></p>
    <a href="custview" class="btn">View All Products</a>
</div>
</body>
</html>
