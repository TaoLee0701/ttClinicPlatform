<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<style type="text/css">
		body, html{width: 100%;height: 100%;margin:0;font-family:"微软雅黑";}
		#l-map{height:400px;width:100%;}
		#r-result,#r-result table{width:100%;}
		#div_fh{
			width:100%;
			height: 30px;
			padding-top:13px;
		}
      	.a{
			text-decoration:none;
			color:black;
			margin-left:15px;
		}
	</style>
	<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=dUyIgh5YTv8NhLp9r0d8tdZtifGvEdk8"></script>
</head>
<body>
	<div id="div_fh"><a class="a" href="javascript:history.go(-1)">返回</a></div>
	
	<div id="l-map"></div>
  	<div id="r-result"></div>
  	<input id="address" type="hidden" value="${hospital.hospitalAddress }" />
</body>
</html>
<script src="/static/jquery/jquery-1.12.4.js"></script>
<script type="text/javascript">
	var map = new BMap.Map("l-map");
	var point = new BMap.Point(113.277411,23.129770);
	map.centerAndZoom(point,12);
	map.enableScrollWheelZoom(true); //启用滚轮放大缩小，默认禁用，为true开启
	var geolocation = new BMap.Geolocation();
	geolocation.getCurrentPosition(function(r){
		if(this.getStatus() == BMAP_STATUS_SUCCESS){
			var mk = new BMap.Marker(r.point);
			map.addOverlay(mk);
			map.panTo(r.point);
			//alert('您的位置：'+r.point.lng+','+r.point.lat);
			var p1 = new BMap.Point(r.point.lng,r.point.lat);
			
			// 创建地址解析器实例
			var myGeo = new BMap.Geocoder();
			// 将地址解析结果显示在地图上,并调整地图视野
			myGeo.getPoint($("#address").val(), function(p2){
				if (p2) {
					var transit = new BMap.TransitRoute(map, {
						renderOptions: {map: map, panel: "r-result",policy:BMAP_TRANSIT_POLICY_LEAST_TIME}//policy 公交导航策略：最少时间
					});
				  	
				    transit.search(p1, p2);
				}else{
					alert("您选择地址没有解析到结果!");
				}
			});
		}
		else {
			alert('failed'+this.getStatus());
		}        
	},{enableHighAccuracy: true});
	
	/*
	
	
	
	map.enableScrollWheelZoom(true); //启用滚轮放大缩小，默认禁用。为true开启
	
	var p1 = new BMap.Point(116.387582,39.919056);
	var p2 = new BMap.Point(116.380000,39.914285);
  
  	
  
	var transit = new BMap.TransitRoute(map, {
		renderOptions: {map: map, panel: "r-result",policy:BMAP_TRANSIT_POLICY_LEAST_TIME}//policy 公交导航策略：最少时间
	});
	
  	
    transit.search(p1, p2);*/
</script>