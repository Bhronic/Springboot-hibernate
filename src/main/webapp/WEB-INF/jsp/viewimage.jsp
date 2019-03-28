<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<label>${img.getImgName()}</label><br><br>
<img alt="image" src="data:image/jpeg;base64,${image}" width="250 px" height="150 px" border="1px solid black">
</body>
</html>
