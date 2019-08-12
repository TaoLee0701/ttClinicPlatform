<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>login.jsp</title>
<%--iview--%>
<link rel="stylesheet" type="text/css"
	href="/static/iview/iview/dist/styles/iview.css">
<script type="text/javascript" src="/static/vue/js/vue.min.js"></script>
<script type="text/javascript"
	src="/static/iview/iview/dist/iview.min.js"></script>
<%--请求--%>
<script src="/static/axios/axios.min.js"></script>
</head>
<body>
	<div id="app">
		<div>
			账号:
			<Input v-model="userName" placeholder="请输入账号" clearable
				style="width: 200px" />
		</div>
		<div>
			密码:
			<Input type="password" v-model="userPassword" placeholder="请输入账号" clearable
				style="width: 200px" />
		</div>
	</div>
	<script>
		new Vue({
			el : '#app',
			data : {
				userName:'',
				userPassword:'',
				visible : false
			},
			methods : {
				show : function() {
					this.visible = true;
				}
			}
		})
	</script>
</body>
</html>