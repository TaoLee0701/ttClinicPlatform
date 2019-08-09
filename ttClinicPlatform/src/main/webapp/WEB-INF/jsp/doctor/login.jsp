<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="utf-8">
<title>登录页面</title>
<meta content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=0" name="viewport"/>
<meta content="yes" name="apple-mobile-web-app-capable"/>
<meta content="black" name="apple-mobile-web-app-status-bar-style"/>
<meta content="telephone=no" name="format-detection"/>
 <link rel="Stylesheet" type="text/css" href='/ttclinicplatform/content/css/login.css'/>
</head>

<body>


<div class="login-logo circle text-center">LOGO</div>

<form name="forms" onSubmit="return checkreg()" action="homepage.html" method="post" class="login-cont">
  <ul>
  <li><input type="tel" placeholder="请输入您的手机号" ></li>
  <li>
	<span id="box"><input type="password" value="523654" name="password"></span>
    <span id="click"><a href="javascript:ps()" class="iconfont icon-biyan"></a></span></li>
  </ul>
  <a href="javascript:;"  class="button text-center block">登 录</a>
  <a href="javascript:;" class="text-center block font-color">忘记密码？</a>
  <p class="text-center">没有账号？ <a href="javascript:;" class="font-color" >立即注册</a></p>
  </form>
	                                                                                                                                         
                                                                                       
 <script type="text/javascript">
function ps(){
if (this.forms.password.type="password")
box.innerHTML="<input type=\"html\" name=\"password\" size=\"20\" value="+this.forms.password.value+">";
click.innerHTML="<a href=\"javascript:txt()\" class=\"iconfont icon-open-eye\"></a>"}
function txt(){
if (this.forms.password.type="text")
box.innerHTML="<input type=\"password\" name=\"password\" size=\"20\" value="+this.forms.password.value+">";
click.innerHTML="<a href=\"javascript:ps()\" class=\"iconfont icon-biyan\"></a>"}
</script>
  
</body>
</html>
