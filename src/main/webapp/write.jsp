<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글등록 페이지</title>
</head>
<body>
	<form action="write-ok.post" method="post">
		<input name="postTitle" placeholder="게시글 제목"/>
		<input name="postContent" placeholder="게시글 내용"/>
		<button>게시글 등록</button>
	</form>

</body>
</html>