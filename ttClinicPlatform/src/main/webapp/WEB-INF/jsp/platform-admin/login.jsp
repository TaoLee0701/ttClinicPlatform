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
            top: 50%; /*偏移*/
            transform: translateY(-50%);

        }
        .platform-login .form{
            text-align: center;
            padding: 2rem;
            border: 1px solid #dcdee2;
            background-color: #FFFFFF;
            -moz-box-shadow: 1px 2px 6px #dcdee2; /* 老的 Firefox */
            box-shadow: 1px 2px 6px #dcdee2;
        }
        .platform-login .form div{
            margin: 0.3rem;
        }
        .platform-login .form div button{
            width: 10rem;
            border-radius: 2rem;
        }
        .platform-login .form div button span{
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
                <i-input v-model="user_name" type="text" clearable placeholder="请输入用户名" style="width: 300px">
                    <Icon type="ios-contact" slot="prefix" />
                </i-input>
            </div>
            <div>
                <i-input v-model="password" type="password" clearable placeholder="请输入密码" style="width: 300px">
                    <Icon type="md-calculator"  slot="prefix"/>
                </i-input>
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
            user_name:'',
            password:'',
            loading:false
        },
        methods: {
            submit(){
                // this.$Spin.show();
                this.loading=true
                console.log("submit",this.user_name,this.password)
            }
        }
    })
</script>
</body>
</html>
