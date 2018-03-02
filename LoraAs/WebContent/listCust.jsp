<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'listCust.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <h1>客户列表页面</h1><br>
  <form action="${pageContext.request.contextPath}/servlet/BatchDelServlet">
  <table border="1px" width="100%">
  	<tr>
  		<th><input type="checkbox"/>全选</th>
  		<th>客户姓名</th>
  		<th>客户性别</th>
  		<th>出生日期</th>
  		<th>手机号码</th>
  		<th>电子邮箱</th>
  		<th>客户爱好</th>
  		<th>客户类型</th>
  		<th>描述信息</th>
  		<th>修改</th>
  		<th>删除</th>
  	</tr>
  	<c:forEach items="${requestScope.list}" var='cust'>
  		<tr>
  			<td><input type="checkbox" name="delId" value="${cust.id}"></td>
  			<td>${cust.name}</td>
  			<td>${cust.gender}</td>
  			<td>${cust.birthday}</td>
  			<td>${cust.cellphone}</td>
  			<td>${cust.email}</td>
  			<td>${cust.preference}</td>
  			<td>${cust.type}</td>
  			<td>${cust.description}</td>
  			<td><a href="${pageContext.request.contextPath}/servlet/CusInfoServlet?id=${cust.id}">修改</a></td>
  			<td><a href="${pageContext.request.contextPath}/servlet/DelCustServlet?id=${cust.id}">删除</a></td>
  			
  		</tr>
  	</c:forEach>
  </table>
  <input type="submit" value="批量删除">
  </form>
  </body>
</html>
