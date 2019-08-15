<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	label.tips{
		display:inline-block;
		width:120px;
	}
</style>
</head>
<body>
	<h2>错误页面</h2>
	<hr/>
	<div>
		<label class="tips">状态码：</label>
		<label class="msg">${status}</label>
	</div>
	<div>
		<label class="tips">错误名称：</label>
		<label class="msg">${error}</label>
	</div>
	<div>
		<label class="tips">异常消息：</label>
		<label class="msg">${message}</label>
	</div>
	<div>
		<label class="tips">异常对象：</label>
		<label class="msg">${exception}</label>
	</div>
	<div>
		<label class="tips">错误信息：</label>
		<label class="msg">${errors}</label>
	</div>
	<div>
		<label class="tips">错误路径：</label>
		<label class="msg">${path}</label>
	</div>
	<div>
		<label class="tips">堆栈追踪：</label>
		<pre>${trace}</pre>
	</div>
</body>
</html>