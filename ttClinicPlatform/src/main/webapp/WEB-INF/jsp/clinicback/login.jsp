<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>login.jsp</title>
<!--iview-->
<link rel="stylesheet" type="text/css"
	href="/static/iview/iview/dist/styles/iview.css">
<script type="text/javascript" src="/static/vue/js/vue.min.js"></script>
<script type="text/javascript"
	src="/static/iview/iview/dist/iview.min.js"></script>
<!--请求-->
<script src="/static/axios/axios.min.js"></script>
<script type="text/javascript" charset="utf-8" src="//g.alicdn.com/sd/nch5/index.js?t=2015052012"></script>

<style type="text/css">
#login {
	padding-top: 100px;
	text-align: center;
	width: 300px;
	height: 500px;
	border: 1px solid red; 
}
#denglu {
	left: 120px;
}
#nc{
	padding:0px;
	margin:0px;	
	width: 300px;
	height: 80px;
}
</style>

</head>
<body>
	<div id="app">
		<div id='login'>
				<h2 style="padding-bottom: 10px;">诊所后台管理</h2>
				<div>
					账号:
					<i-input v-model="loginName" placeholder="请输入账号" clearable
						prefix="logo-reddit" style="width: 200px" />
				</div>
				<div>
					密码:
					<i-input type="password" v-model="userPassword" placeholder="请输入密码"
						clearable prefix="ios-unlock-outline"
						style="width: 200px;padding-bottom: 10px;" />
				</div>
				<div>
				<!-- 通过设置shape属性为circle，可将按钮置为圆的形状。 -->
				<i-button id="denglu" @click="login" type="" shape="circle">登陆</i-button>
				</div>
				<!-- 滑块 -->
				<div id="__nc"
					style="margin-left: auto; margin-right: auto; height: 100px; padding-top: 10px;">
					<div id="nc"></div>
				</div>
		</div>
	</div>
	<script>
	new Vue({
		el : '#app',
		data : {
			loginName : '',
			userPassword : '',
			
		},
		methods : {
			login(){
				axios.post('/clinicback/check-login', {
					userName: this.loginName,
					userPassword: this.userPassword
				  })
				  .then(function (response) {
				    console.log(response);
				  });
			} 
		}
	});
		var nc_token = [ "CF_APP_1", (new Date()).getTime(), Math.random() ]
				.join(':');
		var nc = NoCaptcha.init({
			renderTo : '#nc',
			appkey : 'CF_APP_1',
			scene : 'register',
			token : nc_token,
			trans : {
				"key1" : "code200"
			},
			elementID : [ "usernameID" ],
			is_Opt : 0,
			language : "cn",
			timeout : 10000,
			retryTimes : 5,
			errorTimes : 5,
			inline : false,
			apimap : {
			// 'analyze': '//a.com/nocaptcha/analyze.jsonp',
			// 'uab_Url': '//aeu.alicdn.com/js/uac/909.js',
			},
			bannerHidden : false,
			initHidden : false,
			callback : function(data) {
				window.console && console.log(nc_token)
				window.console && console.log(data.csessionid)
				window.console && console.log(data.sig)
			},
			error : function(s) {
			}
		});
		NoCaptcha.setEnabled(true);
		nc.reset();//请务必确保这里调用一次reset()方法

		NoCaptcha.upLang('cn', {
			'LOADING' : "加载中...",//加载
			'SLIDER_LABEL' : "请向右滑动验证",//等待滑动
			'CHECK_Y' : "验证通过",//通过
			'ERROR_TITLE' : "非常抱歉，这出错了...",//拦截
			'CHECK_N' : "验证未通过", //准备唤醒二次验证
			'OVERLAY_INFORM' : "经检测你当前操作环境存在风险，请输入验证码",//二次验证
			'TIPS_TITLE' : "验证码错误，请重新输入"//验证码输错时的提示
		});
	</script>
</body>
</html>