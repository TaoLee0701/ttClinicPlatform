<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>医院介绍</title>
<!-- 引入样式 -->
    <link rel="stylesheet" href="/static/vue-ydui/dist/ydui.rem.css">
    <!-- 引入rem自适应类库 -->
    <script src="/static/vue-ydui/dist/ydui.flexible.js"></script>
	<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=dUyIgh5YTv8NhLp9r0d8tdZtifGvEdk8"></script>
	<style>
		
		.page-header{
			background-color:white;
			margin-top:0px;
			padding:20px 15px;
			
			border-bottom:1px solid #cccccc;
			font-size:16px;
		}
		.page-header .p-yz{
            margin-top:15px;
			margin-left:1em;
        }
		.page-header h2{
			font-size:40px;
			font-weight:bold;
			text-align:center;
			color:#00FF16;
		}
		#editPanel {
            margin-top:20px;
			border:1px solid #cccccc;
        }
		
		#editPanel legend{
			color:#ab9f99;
            margin-left:10px;
        }
        #editPanel .spen-content{
			font-size:15px;
			color:#736d6a;
			text-indent:2em;
		}
	</style>
</head>
<body>
<yd-layout id="app">
		<div class="page-header">
			<h2>${hospital.hospitalName}</h1>
			<p class="p-yz">院长：${dean }</p>
			<fieldset id="editPanel">
				<legend>介绍</legend>
				<div>
				<p class="spen-content">${hospital.hospitalDetail}</p>
				</div>
			</fieldset>
			<yd-cell-group>
				<yd-cell-item >
					<span slot="left">联系电话：${hospital.hospitalPhone}</span>
				</yd-cell-item>
			</yd-cell-group>
			<yd-cell-group>
				<yd-cell-item arrow type="a" href="./map.html">
					<span slot="left">地址：${hospital.hospitalAddress}</span>
					<span slot="right" style="color:#3fb5f3;">去这里</span>
				</yd-cell-item>
			</yd-cell-group>
			<yd-cell-group>
				<yd-cell-item >
					<span slot="left">评分：&nbsp;&nbsp;</span>
					<yd-rate slot="left" :value="xinxin" :readonly="true" color="#00FF16"  active-color="#00FF16" >
					</yd-rate>
					<span slot="right"> ${hospital.hospitalScore}</span>
				</yd-cell-item>
			</yd-cell-group>
			<yd-button size="large" type="warning">预约挂号</yd-button>
		</div>
		
		<yd-tabbar slot="tabbar" >
				<yd-tabbar-item title="首页" @click.native="titclick" type="a" href="./index.html" :active="shouye">
					<yd-icon name="home" slot="icon" size="0.54rem"></yd-icon>
				</yd-tabbar-item>
				<yd-tabbar-item title="就医指南" @click.native="jiuclick" :active="jiuying">
					<yd-icon name="question" slot="icon" size="0.54rem"></yd-icon>
				</yd-tabbar-item>
				<yd-tabbar-item title="个人中心" @click.native="grclick" :active="gr">	
					<yd-icon name="ucenter-outline" slot="icon" size="0.54rem"></yd-icon>
				</yd-tabbar-item>			
		</yd-tabbar>
	</yd-layout>
<!-- 引入 Vue -->
<script src="/static/vue/js/vue.js"></script>
<!-- 引入组件库 -->
<script src="/static/vue-ydui/dist/ydui.rem.js"></script>
<script src="/static/jquery/jquery-1.12.4.js"></script>
<script>

    new Vue({
        el: '#app',
		data:{
			shouye:true,
			jiuying:false,
			gr:false,
			xinxin:0
		},
		mounted(){
			this.xinxin =${hospital.changeScore};
			
		},
        methods: {
            
			titclick(){
				this.shouye=true;
				this.jiuying=false;
				this.gr=false;
			},
			jiuclick(){
				this.shouye=false;
				this.jiuying=true;
				this.gr=false;
			},
			grclick(){
				this.shouye=false;
				this.jiuying=false;
				this.gr=true;
			}
			
		}
    });
	
	var geoc = new BMap.Geocoder(); //创建一个地址解析器的实例
	var geolocation = new BMap.Geolocation();
	geolocation.getCurrentPosition(function(r){
		if(this.getStatus() == BMAP_STATUS_SUCCESS){
			var href =$(".yd-cell-item[href]").attr("href");
			$(".yd-cell-item").attr("href",href+"?lng="+r.point.lng+"&lat="+r.point.lat);
			var location = $(".yd-cell-item").attr("href");
			var p1 = new BMap.Point(r.point.lng,r.point.lat);
			geoc.getLocation(p1, function(rs){
			var addComp = rs.addressComponents;
			//rs.address  地址描述
			alert(addComp.city);
			//alert("省份"+addComp.province + ", 城市" + addComp.city + ", 区县" + addComp.district + ", 街道" + 
			//addComp.street + ", 门牌号码" + addComp.streetNumber);
		}); 
		}
		else {
			alert('failed'+this.getStatus());
		}        
	},{enableHighAccuracy: true});
</script>
</body>
</html>