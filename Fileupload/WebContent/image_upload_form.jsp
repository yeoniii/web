<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>1개 사진 업로드폼</h2>
<form action="${initParam.rootPath }/imageupload" method="post" enctype="multipart/form-data">
	업로더 : <input type="text" name="uploader"><br>
	설명 : <input type="text" name="comment" size="50"><br>
	사진 : <input type="file" name="image"><br>
	<input type="submit" value="전송">
</form>

<h2>여러 사진 업로드폼</h2>
<form action="${initParam.rootPath }/imageupload" method="post" enctype="multipart/form-data">
	업로더 : <input type="text" name="uploader"><br>
	설명 : <input type="text" name="comment" size="50"><br>
	사진1 : <input type="file" name="image"><br>
	사진2 : <input type="file" name="image"><br>
	사진3 : <input type="file" name="image"><br>
	<input type="submit" value="전송">
</form>

</body>
</html>