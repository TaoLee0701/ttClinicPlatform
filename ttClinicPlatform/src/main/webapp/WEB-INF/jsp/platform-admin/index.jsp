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
    <link rel="stylesheet" type="text/css" href="/static/iview/iview/dist/styles/iview.css">
    <script type="text/javascript" src="/static/vue/js/vue.min.js"></script>
    <script type="text/javascript" src="/static/iview/iview/dist/iview.min.js"></script>
    <script src="/static/axios/axios.min.js"></script>
</head>
<body>
<div id="app">
    <i-button @click="show">Click me!</i-button>
    <Modal v-model="visible" title="Welcome">Welcome to iView</Modal>
</div>
<script>
    new Vue({
        el: '#app',
        data: {
            visible: false
        },
        methods: {
            show: function () {
                // this.visible = true
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
