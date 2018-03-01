<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>学号</td>
			<td>姓名</td>
			<td>年龄</td>
			<td>删除</td>
		</tr>
		<c:forEach items="${students}" var="student">
			<tr>
				<td>${student.id}</td>
				<td>${student.name}</td>
				<td>${student.age}</td>
				<td>
					<a href="${pageContext.request.contextPath }/student/deleteStudent/${student.id}">删除</a>
				</td>
			</tr>
		</c:forEach>
		
	</table>
	<tr>
			<c:if test="${pageBean.currentPage!=1}">
				<a href="${pageContext.request.contextPath }/student/listAllStudent/${pageBean.currentPage-1}">上一页</a>
			</c:if>
			<c:if test="${pageBean.currentPage==1}">
				<a>上一页</a>
			</c:if>
			<c:forEach begin="1" end="${pageBean.totalPage }" var="page">
					<c:if test="${page!=pageBean.currentPage }">
						<a href="${pageContext.request.contextPath }/student/listAllStudent/${page}">${page }</a>
					</c:if>
					<c:if test="${page==pageBean.currentPage }">
						<font size="40px">${page }</font>
					</c:if>
			</c:forEach>
			
			
			<c:if test="${pageBean.currentPage!=pageBean.totalPage}">
				<a href="${pageContext.request.contextPath }/student/listAllStudent/${pageBean.currentPage+1}">下一页</a>
			</c:if>
			<c:if test="${pageBean.currentPage==pageBean.totalPage}">
				<a>下一页</a>
			</c:if>
		</tr>	
</body>
</html>