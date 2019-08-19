//定义不同的组件
var one = {template:'<p>我是菜单一的内容</p>'};
var two = {template:'<p>我是菜单二的内容</p>'};
var three = {template:'<p>我是菜单三的内容</p>'};

// 定义路径
var routes = [
    { path: '/', redirect: '/one'}, // 这个表示会默认渲染
    {path:'/one',component:one},
    {path:'/two',component:two},
    {path:'/three',component:three}
];

//定义路由
var router = new VueRouter({
    routes: routes
})
