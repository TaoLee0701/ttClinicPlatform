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
    <title>主页</title>
    <link rel="stylesheet" type="text/css" href="/static/iview/iview/dist/styles/iview.css">
    <link rel="stylesheet" type="text/css" href="/static/platform-admin/platform-css/main.css">
    <script type="text/javascript" src="/static/vue/js/vue.js"></script>
    <script type="text/javascript" src="/static/iview/iview/dist/iview.min.js"></script>
    <script src="/static/axios/axios.min.js"></script>
    <script type="text/javascript" src="/static/vue-router/dist/vue-router.min.js"></script>
    <script type="text/javascript" src="/static/platform-admin/platform-router/router.js"></script>
    <style>
        .layout{
            border: 1px solid #d7dde4;
            background: #f5f7f9;
            position: relative;
            border-radius: 4px;
            overflow: hidden;
        }
        .layout-logo{
            width: 100px;
            height: 30px;
            background: #5b6270;
            border-radius: 3px;
            float: left;
            position: relative;
            top: 15px;
            left: 20px;
        }
        .layout-nav{
            width: 420px;
            margin: 0 auto;
            margin-right: 20px;
        }
    </style>
</head>
<body>
<div id="platform-home" class="platform-home">
    <div class="layout">
    <Layout>
        <Header>
            <i-menu mode="horizontal" theme="dark" active-name="1">
                <div class="layout-logo"></div>
                <div class="layout-nav">
                    <Menu-Item name="1">
                        <Icon type="ios-navigate"></Icon>
                        Item 1
                    </Menu-Item>
                    <Menu-Item name="2">
                        <Icon type="ios-keypad"></Icon>
                        Item 2
                    </Menu-Item>
                    <Menu-Item name="3">
                        <Icon type="ios-analytics"></Icon>
                        Item 3
                    </Menu-Item>
                    <Menu-Item name="4">
                        <Icon type="ios-paper"></Icon>
                        Item 4
                    </Menu-Item>
                </div>
            </i-menu>
        </Header>
        <Layout>
            <Sider hide-trigger :style="{background: '#fff'}">
                <i-menu active-name="1-2" theme="light" width="auto" :class="menuitemClasses">
                    <Menu-Item name="1-1">
                        <Icon type="ios-navigate"></Icon>
                        <%--<span>Option 1</span>--%><router-link   name="1-1" to="/one">菜单一</router-link>
                    </Menu-Item>
                    <Menu-Item name="1-2">
                        <Icon type="ios-search"></Icon>
                        <%--<span>Option 2</span>--%>
                        <router-link to="/two">菜单二</router-link>
                    </Menu-Item>
                    <Menu-Item name="1-3">
                        <Icon type="ios-settings"></Icon>
                        <%--<span>Option 3</span>--%>
                        <router-link to="/three">菜单三</router-link>
                    </Menu-Item>
                </i-menu>
                <%--<i-menu active-name="1-2" theme="light" width="auto" :open-names="['1']">--%>
                    <%--<Submenu name="1">--%>
                        <%--<template slot="title">--%>
                            <%--<Icon type="ios-navigate"></Icon>--%>
                            <%--<router-link to="/one">菜单一</router-link>--%>
                        <%--</template>--%>
                        <%--<Menu-Item name="1-1">Option 1</Menu-Item>--%>
                        <%--<Menu-Item name="1-2">Option 2</Menu-Item>--%>
                        <%--<Menu-Item name="1-3">Option 3</Menu-Item>--%>
                    <%--</Submenu>--%>
                    <%--<Submenu name="2">--%>
                        <%--<template slot="title">--%>
                            <%--<Icon type="ios-keypad"></Icon>--%>
                            <%--Item 2--%>
                        <%--</template>--%>
                        <%--<Menu-Item name="2-1">Option 1</Menu-Item>--%>
                        <%--<Menu-Item name="2-2">Option 2</Menu-Item>--%>
                    <%--</Submenu>--%>
                    <%--<Submenu name="3">--%>
                        <%--<template slot="title">--%>
                            <%--<Icon type="ios-analytics"></Icon>--%>
                            <%--Item 3--%>
                        <%--</template>--%>
                        <%--<Menu-Item name="3-1">Option 1</Menu-Item>--%>
                        <%--<Menu-Item name="3-2">Option 2</Menu-Item>--%>
                    <%--</Submenu>--%>
                <%--</i-menu>--%>
            </Sider>
            <Layout :style="{padding: '0 24px 24px'}">
                <Breadcrumb :style="{margin: '24px 0'}">
                    <BreadcrumbItem>Home</BreadcrumbItem>
                    <BreadcrumbItem>Components</BreadcrumbItem>
                    <BreadcrumbItem>Layout</BreadcrumbItem>
                </Breadcrumb>
                <Content :style="{padding: '24px', minHeight: '50rem', background: '#fff'}">
                    <router-view></router-view>
                </Content>
            </Layout>
        </Layout>
    </Layout>
</div>
</div>
<script>
    new Vue({
        el: '#platform-home',
        router,
        data: {

        },
        methods: {

        }
    })
</script>
</body>
</html>
