<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/8/6
  Time: 23:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>登录</title>
    <link rel="stylesheet" type="text/css" href="/static/iview/iview/dist/styles/iview.css">
    <script type="text/javascript" src="/static/vue/js/vue.min.js"></script>
    <script type="text/javascript" src="/static/iview/iview/dist/iview.min.js"></script>
    <script src="/static/axios/axios.min.js"></script>
    <style>
        html, body {
            width: 100%;
            height: 100%;
            margin: 0;
            padding: 0;
            background-color: #FDFFFE;
        }
        .platform-login{
            height: 20rem;
            width: 30%;
            margin: 0 auto;
            position: relative; /*脱离文档流*/
            top: 40%; /*偏移*/
            transform: translateY(-50%);

        }
        .platform-login>.form{
            text-align: center;
            padding: 2rem;
            border: 1px solid #dcdee2;
            background-color: #FFFFFF;
            -moz-box-shadow: 1px 2px 6px #dcdee2; /* 老的 Firefox */
            box-shadow: 1px 2px 6px #dcdee2;
        }
        .platform-login>.form>div{
            margin: 1rem;
        }
        .platform-login>.form>div>button{
            width: 10rem;
            border-radius: 2rem;
        }
        .platform-login>.form>div>button>span{
            font-size: 0.9rem;
            font-weight: bold;
        }
    </style>
</head>
<body>
    <div id="app" class="platform-login">
        <div class="form">
            <h1>涛涛诊所平台管理登录</h1>
            <div>
                <Tooltip placement="top" always theme="light" content="用户名不能为空哦！" :disabled="userNameIsNull">
                    <i-input @on-focus="userNameIsNull=true" :readonly="loading" prefix="ios-contact" v-model="userName" type="text" clearable placeholder="请输入用户名" style="width: 18.75rem"></i-input>
                </Tooltip>
            </div>
            <div>
                <Tooltip placement="top" always theme="light" content="密码不能为空哦！" :disabled="passwordIsNull">
                    <i-input @on-focus="passwordIsNull=true"  :readonly="loading" prefix="md-calculator" v-model="userPassword" type="password" clearable placeholder="请输入密码" style="width: 300px"></i-input>
                </Tooltip>
            </div>
            <div>
                <div style="text-align: left;width: 18.75rem;margin: 0 auto;">
                    <Row>
                        <i-col span="20">
                                <Checkbox :disabled="loading" v-model="keepPassword">记住密码</Checkbox>
                                <Checkbox :disabled="loading" v-model="autoLogin">一周内自动登录</Checkbox>
                        </i-col >
                        <i-col  span="4" @click.native="forgetPassword">忘记密码</i-col >
                    </Row>
                </div>
            </div>
            <div>
                <i-button type="info" @click="submit" :loading="loading">
                    <span v-if="loading">登录中...</span>
                    <span v-else>登录</span>
                </i-button>
            </div>
        </div>
    </div>
<script>
    new Vue({
        el: '#app',
        data: {
            userName:'',
            userPassword:'',
            loading:false,
            keepPassword:false,
            autoLogin:false,
            userNameIsNull:true,
            passwordIsNull:true
        },
        methods: {
            submit(){
                this.userNameIsNull=this.userName.length!==0;
                this.passwordIsNull=this.userPassword.length!==0
                if(this.userNameIsNull===false||this.passwordIsNull===false){
                    return
                }
                this.loading=true
                let temp=this
                console.log("keepPassword",this.keepPassword)
                console.log("autoLogin",this.autoLogin)
                axios.post('/ttPlatform/check-login', {
                    userName: this.userName,
                    userPassword: this.userPassword
                }).then(function (res) {
                        console.log(res);
                        if(res.data.status==='SUCCRESS'){
                            // temp.$Message.success('验证成功！');
                            location.href="/ttPlatform/home"
                        }else if(res.data.status==='NOTRIGHTS'){
                            temp.$Message.warning('此账号没有权限登录！');
                        }else if(res.data.status==='DEFEATED'){
                            temp.$Message.error('用户名或密码有误！');
                        }
                    temp.loading=false
                })
                // location.href="/ttPlatform/home"
                // console.log("submit",this.user_name,this.password)
            },
            forgetPassword(){
                if(this.loading===true){
                    return
                }
                console.log("忘记密码")
            },
            verify (){

            }
        }
    })
</script>
</body>
</html>
