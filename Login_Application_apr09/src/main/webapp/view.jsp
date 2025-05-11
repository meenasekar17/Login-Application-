<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.nit.login.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Management</title>
<style>
    body {
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background-color: #f4f4f4;
        margin: 0;
        padding: 30px;
    }

    table {
        width: 90%;
        margin: 0 auto;
        border-collapse: collapse;
        box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
        background-color: white;
        border-radius: 8px;
        overflow: hidden;
    }

    thead {
        background-color: #343a40;
        color: white;
    }

    thead th {
        padding: 12px 15px;
        font-size: 18px;
    }

    tbody tr:nth-child(even) {
        background-color: #f2f2f2;
    }

    tbody tr:nth-child(odd) {
        background-color: #ffffff;
    }

    tbody td {
        padding: 10px 15px;
        font-size: 16px;
    }

    .btn {
        display: inline-block;
        padding: 10px 20px;
        background-color: #007bff;
        color: white;
        text-decoration: none;
        border-radius: 6px;
        font-weight: bold;
        font-size: 16px;
        margin: 10px;
        transition: background-color 0.3s ease, transform 0.2s;
    }

    .btn:hover {
        background-color: #0056b3;
        transform: scale(1.05);
    }

    .action-btn {
        padding: 6px 12px;
        margin: 4px;
        font-size: 14px;
        text-decoration: none;
        border-radius: 4px;
        font-weight: bold;
        transition: background-color 0.2s ease;
    }

    .edit {
        background-color: #17a2b8;
        color: white;
    }

    .edit:hover {
        background-color: #138496;
    }

    .delete {
        background-color: #dc3545;
        color: white;
    }

    .delete:hover {
        background-color: #bd2130;
    }

    .a {
        text-align: center;
    }

    .button-group {
        text-align: center;
        margin-top: 30px;
    }
</style>
</head>
<body>

<%
List<ProductBean> li = (List<ProductBean>) request.getAttribute("Pbean");
%>

<table>
    <thead>
        <tr>
            <th>Code</th>
            <th>Name</th>
            <th>Price</th>
            <th>Stock</th>
            <th>Action</th>
        </tr>
    </thead>
    <tbody>
    <% for(ProductBean pb : li) { %>
        <tr>
            <td><%= pb.getCode() %></td>
            <td><%= pb.getName() %></td>
            <td><%= pb.getPrice() %></td>
            <td><%= pb.getStock() %></td>
            <td class="a">
                <a href="edit?code=<%= pb.getCode() %>" class="action-btn edit">Edit</a>
                <a href="delete?code=<%= pb.getCode() %>" class="action-btn delete">Delete</a>
            </td>
        </tr>
    <% } %>
    </tbody>
</table>

<div class="button-group">
    <a href="insert.html" class="btn">Add Product</a>
    <a href="Logout" class="btn" style="background-color: #6c757d;">LogOut</a>
</div>

</body>
</html>
