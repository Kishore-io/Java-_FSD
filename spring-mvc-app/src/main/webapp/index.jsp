<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div>
<form action="add-book" method="post">
<p>Title: <input type="text" placeholder="Enter title" name="title"></p>
<p>Author: <input type="text" placeholder="Enter author" name="author"></p>
<p>Price: <input type="text" placeholder="Enter price" name="price"></p>
<p>DatePublished: <input type="date" placeholder="yyyy-MM-dd" name="datePublished"></p>
<button type="submit">Add Book</button>
</form>
</div>

<div style="padding-top:20px;">
<form action="find-book" method="get">
<h2>Search for book details</h2>
<input type="search" placeholder="Enter title" name="title">
<button type="submit">Search</button>
</form>
</div>
</body>
</html>
