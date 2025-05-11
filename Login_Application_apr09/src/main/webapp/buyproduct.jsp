<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.nit.login.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Buy Product</title>
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

    form {
        display: flex;
        flex-direction: column;
    }

    label {
        font-weight: bold;
        margin-top: 10px;
    }

    input[type="text"], input[type="number"], input[name="stock"] {
        padding: 10px;
        margin-top: 5px;
        margin-bottom: 20px;
        border: 1px solid #ccc;
        border-radius: 6px;
        font-size: 15px;
    }

    input[type="submit"] {
        background-color: #007bff;
        color: white;
        padding: 12px;
        border: none;
        border-radius: 6px;
        font-size: 16px;
        font-weight: bold;
        cursor: pointer;
        transition: background-color 0.3s ease, transform 0.2s;
    }

    input[type="submit"]:hover {
        background-color: #0056b3;
        transform: scale(1.03);
    }

    .product-info {
        margin-bottom: 15px;
        font-size: 16px;
    }

    h1.title {
        text-align: center;
        color: #007bff;
    }

    h3.welcome {
        text-align: center;
    }
</style>
</head>
<body>

<%
ProductBean pb = (ProductBean) request.getAttribute("pbean");
CustomerBean cb = (CustomerBean) session.getAttribute("cbean");
%>

<div class="main">
    <form action="buyproduct" method="post">
        <input type="hidden" name="code" value="<%= pb.getCode() %>">
        <h1 class="title">BUY PRODUCT</h1>
        <h3 class="welcome">WELCOME <%= cb.getUname().toUpperCase() %></h3>

        <div class="product-info">
            <strong>Product ID :</strong> <%= pb.getCode() %>
        </div>
        <div class="product-info">
            <strong>Product Name :</strong> <%= pb.getName() %>
        </div>
        <div class="product-info">
            <strong>Product Price:</strong> ₹<%= pb.getPrice() %>
        </div>
        <div class="product-info">
            <strong>Available Product Stock:</strong> <%= pb.getStock() %>
        </div>

        <input type="hidden" name="stock" value="<%= pb.getStock() %>" readonly>
        <input type="hidden" name="price" value="<%= pb.getPrice() %>">

        <label for="ubuy">How many products do you want to buy?</label>
        <input type="text" name="ubuy" placeholder="Enter quantity">

        <input type="submit" value="Buy Product">
    </form>
</div>

</body>
</html>
