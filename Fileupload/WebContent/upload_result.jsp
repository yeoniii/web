<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>여러 이미지 업로드 결과</h1>
업로더 : ${requestScope.result.uploader }<br>
설명 : ${requestScope.result.comment }<br>
업로드된 이미지들<br>
<c:forEach items="${requestScope.result.imageNames }" var="name">
	<img src="${initParam.rootPath }/up_images/${name}" width="350px">
</c:forEach>


<h1>1개 이미지 업로드 결과</h1>
업로더 : ${requestScope.uploader } <br>
설명 : ${requestScope.comment } <br>
파일명 : ${requestScope.image }<br>
<img src="${initParam.rootPath }/up_images/${requestScope.image}">

</body>
</html>