<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5 border p-5 w-50 shadow rounded">
		<h3 class="text-center mt-3">글 상세보기</h3>
		<table class="table table-borderless">
			<form action="update.do" method="post">		
			<!-- 
				disabled, readonly 차이
				disabled: submit(X), 읽기(X), 수정(X)
				readonly: submit(O), 읽기(O), 수정(X)
			-->	
			<tr>
				<td>글번호</td>
				<td><input class="form-control" type="text" readonly name="bid" value="${dto.bid}"/></td>
			</tr>
			<tr>
				<td>조회수</td>
				<td><input class="form-control" type="text" disabled name="hit" value="${dto.hit}"/></td>
			</tr>
			<tr>
				<td>작성자</td>
				<td><input class="form-control" type="text" name="writer" value="${dto.writer}"/></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input class="form-control" type="text" name="title" value="${dto.title}"/></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea class="form-control" name="content">${dto.content}</textarea></td>
			</tr>
			<tr>
				<td></td>
				<td>
					<input class="btn btn-primary" type="submit" value="수정"/>
					<a href="delete.do?bid=${dto.bid}" class="btn btn-danger">삭제</a>
					<a href="replyView.do?bid=${dto.bid}" class="btn btn-success">댓글작성</a>
					<a href="list.do" class="btn btn-info">리스트</a>
				</td>
			</tr>
			</form>
		</table>
	</div>
</body>
</html>