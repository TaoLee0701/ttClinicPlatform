<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<html>
<head>
<meta charset="utf-8">
<title>登录页面</title>
<meta
	content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=0"
	name="viewport" />
<meta content="yes" name="apple-mobile-web-app-capable" />
<meta content="black" name="apple-mobile-web-app-status-bar-style" />
<meta content="telephone=no" name="format-detection" />
<link rel="Stylesheet" type="text/css" href='/static/content/css/login.css'/>
</head>

<body>
	<div class="login-logo circle text-center">
		<img src="/static/content/image/logo2.jpg" height="145" width="150">
	</div>
	<%-- <c:if test="${loginDoctor==null}"> --%>
		<form name="forms" action="/doctor/login" method="post"
			class="login-cont">
			<ul>
				<li><input name="username" type="text" placeholder="请输入您的用户名"></li>

				<li>
				<span id="box">
				<input type="password" placeholder="请输入您的密码" name="pwd">
						</span> 
						<span id="click">
						<a
						href="javascript:ps()" class="iconfont icon-biyan"></a>
						</span>
						</li>
			</ul>
			<label type="tel" style="color: red">${error}</label>
			<button class="button text-center block">登录</button>

			<a href="" class="text-center block font-color">忘记密码？</a>

		</form>

	<%-- </c:if> --%>
	<script type="text/javascript">
		function ps() {
			if (this.forms.password.type = "password")
				box.innerHTML = "<input type=\"html\" name=\"password\" size=\"20\" value="+this.forms.password.value+">";
			click.innerHTML = "<a href=\"javascript:txt()\" class=\"iconfont icon-open-eye\"></a>"
		}

		function txt() {
			if (this.forms.password.type = "text")
				box.innerHTML = "<input type=\"password\" name=\"password\" size=\"20\" value="+this.forms.password.value+">";
			click.innerHTML = "<a href=\"javascript:ps()\" class=\"iconfont icon-biyan\"></a>"
		}
	</script>
	</body>
	</html>