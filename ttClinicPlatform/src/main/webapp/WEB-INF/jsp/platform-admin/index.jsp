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
    <title>index.jsp</title>
    <%--iview--%>
    <link rel="stylesheet" type="text/css" href="/static/iview/iview/dist/styles/iview.css">
    <script type="text/javascript" src="/static/vue/js/vue.min.js"></script>
    <script type="text/javascript" src="/static/iview/iview/dist/iview.min.js"></script>
    <%--请求--%>
    <script src="/static/axios/axios.min.js"></script>
    <%--图标--%>
    <link rel="stylesheet" href="/static/iconfont/iconfont.css">
    <script src="/static/iconfont/iconfont.js"></script>
</head>
<body>
<div id="app">
    <i-button @click="show">Click me!</i-button>
    <Modal v-model="visible" title="Welcome">Welcome to iView</Modal>
    <h1 v-show="show">您的账号或者密码有误！</h1>
    <i class="iconfont iconzl_youbian"></i>
</div>
<script>
    new Vue({
        el: '#app',
        data: {
            visible: false,
            show:true
        },
        methods: {
            show  :function () {
                // this.visible = true
                // this.$Spin.show();

                axios.get('/platformAdmin/user?id=12345')
                    .then(function (res) {

                        console.log(res);
                    })
                    .catch(function (res) {
                        console.log(res);
                    });
            }
        }
    })
</script>
</body>
</html>
