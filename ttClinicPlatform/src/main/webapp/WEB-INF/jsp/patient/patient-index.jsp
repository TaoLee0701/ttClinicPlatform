<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <!-- 引入样式 -->
    <link rel="stylesheet" href="/static/vue-ydui/dist/ydui.rem.css">
    <!-- 引入rem自适应类库 -->
    <script src="/static/vue-ydui/dist/ydui.flexible.js"></script>
	
	<style>
		
		.title{
			font-weight:bold;
			margin-bottom:20px;
		}
		.yd-slider-item{
			height:4rem;
		}
		.div-tj{
			margin-top:10%;
		}
		.div-tj p{
			font-size:15px;font-weight:bold;
		}
		.div-tj .yd-cell-item{
			background-color:#ffeac4;
			border:1px solid #cccccc;
		}
	</style>
</head>
<body>
<yd-layout id="app">
		 <yd-navbar slot="navbar"  class="title" fontsize="20px"  bgcolor="#baef4a" title="欢迎来到涛涛诊所平台"></yd-navbar>
	
    
		<slot style="50%">
			<yd-slider autoplay="3000">
				<yd-slider-item >
					<a href="http://www.ydcss.com">
						<img src="http://vue.ydui.org/img/1.jpg">
					</a>
				</yd-slider-item>
				<yd-slider-item>
					<a href="http://www.ydcss.com">
						<img src="http://vue.ydui.org/img/2.jpg">
					</a>
				</yd-slider-item>
				<yd-slider-item>
					<a href="http://www.ydcss.com">
						<img src="http://vue.ydui.org/img/3.jpg">
					</a>
				</yd-slider-item>
			</yd-slider>
			
			<div>
				<yd-search placeholder="搜索诊所：" :result="result" :fullpage="true" v-model="queryString" :item-click="itemClickHandler" :on-submit="submitHandler"></yd-search>
				
			</div>
			
			<div class="div-tj" >
				<p >根据你的城市推荐</p>
				<yd-cell-group title="广州">
					<yd-cell-item >
						<span slot="left">左边内容一</span>
						<span slot="right">评分	：&nbsp;&nbsp;</span>
						<yd-rate slot="right" v-model="rate3" :readonly="true" color="#00FF16"  active-color="#00FF16" >
						</yd-rate>
						<span slot="right"> 7.0</span>
					</yd-cell-item>
					<yd-cell-item>
						<span slot="left">左边内容二</span>
						<span slot="right">内容</span>
					</yd-cell-item>
					<yd-cell-item >
						<span slot="left">左边内容一</span>
						<span slot="right">评分	：&nbsp;&nbsp;</span>
						<yd-rate slot="right" v-model="rate3" :readonly="true" color="#00FF16"  active-color="#00FF16" >
						</yd-rate>
						<span slot="right"> 7.0</span>
					</yd-cell-item>
					<yd-cell-item>
						<span slot="left">左边内容二</span>
						<span slot="right">内容</span>
					</yd-cell-item>
					<yd-cell-item >
						<span slot="left">左边内容一</span>
						<span slot="right">评分	：&nbsp;&nbsp;</span>
						<yd-rate slot="right" v-model="rate3" :readonly="true" color="#00FF16"  active-color="#00FF16" >
						</yd-rate>
						<span slot="right"> 7.0</span>
					</yd-cell-item>
					<yd-cell-item>
						<span slot="left">左边内容二</span>
						<span slot="right">内容</span>
					</yd-cell-item>
					<yd-cell-item >
						<span slot="left">左边内容一</span>
						<span slot="right">评分	：&nbsp;&nbsp;</span>
						<yd-rate slot="right" v-model="rate3" :readonly="true" color="#00FF16"  active-color="#00FF16" >
						</yd-rate>
						<span slot="right"> 7.0</span>
					</yd-cell-item>
					<yd-cell-item>
						<span slot="left">左边内容二</span>
						<span slot="right">内容</span>
					</yd-cell-item>
					<yd-cell-item >
						<span slot="left">左边内容一</span>
						<span slot="right">评分	：&nbsp;&nbsp;</span>
						<yd-rate slot="right" v-model="rate3" :readonly="true" color="#00FF16"  active-color="#00FF16" >
						</yd-rate>
						<span slot="right"> 7.0</span>
					</yd-cell-item>
					<yd-cell-item>
						<span slot="left">左边内容二</span>
						<span slot="right">内容</span>
					</yd-cell-item>
					<yd-cell-item >
						<span slot="left">左边内容一</span>
						<span slot="right">评分	：&nbsp;&nbsp;</span>
						<yd-rate slot="right" v-model="rate3" :readonly="true" color="#00FF16"  active-color="#00FF16" >
						</yd-rate>
						<span slot="right"> 7.0</span>
					</yd-cell-item>
					<yd-cell-item>
						<span slot="left">左边内容二</span>
						<span slot="right">内容</span>
					</yd-cell-item>
					<yd-cell-item >
						<span slot="left">左边内容一</span>
						<span slot="right">评分	：&nbsp;&nbsp;</span>
						<yd-rate slot="right" v-model="rate3" :readonly="true" color="#00FF16"  active-color="#00FF16" >
						</yd-rate>
						<span slot="right"> 7.0</span>
					</yd-cell-item>
					<yd-cell-item>
						<span slot="left">左边内容二</span>
						<span slot="right">内容</span>
					</yd-cell-item>
					<yd-cell-item >
						<span slot="left">左边内容一</span>
						<span slot="right">评分	：&nbsp;&nbsp;</span>
						<yd-rate slot="right" v-model="rate3" :readonly="true" color="#00FF16"  active-color="#00FF16" >
						</yd-rate>
						<span slot="right"> 7.0</span>
					</yd-cell-item>
					<yd-cell-item>
						<span slot="left">左边内容二</span>
						<span slot="right">内容</span>
					</yd-cell-item>
					<yd-cell-item >
						<span slot="left">左边内容一</span>
						<span slot="right">评分	：&nbsp;&nbsp;</span>
						<yd-rate slot="right" v-model="rate3" :readonly="true" color="#00FF16"  active-color="#00FF16" >
						</yd-rate>
						<span slot="right"> 7.0</span>
					</yd-cell-item>
					<yd-cell-item>
						<span slot="left">左边内容二</span>
						<span slot="right">内容</span>
					</yd-cell-item>
					<yd-cell-item >
						<span slot="left">左边内容一</span>
						<span slot="right">评分	：&nbsp;&nbsp;</span>
						<yd-rate slot="right" v-model="rate3" :readonly="true" color="#00FF16"  active-color="#00FF16" >
						</yd-rate>
						<span slot="right"> 7.0</span>
					</yd-cell-item>
					<yd-cell-item>
						<span slot="left">左边内容二</span>
						<span slot="right">内容</span>
					</yd-cell-item>
					<yd-cell-item >
						<span slot="left">左边内容一</span>
						<span slot="right">评分	：&nbsp;&nbsp;</span>
						<yd-rate slot="right" v-model="rate3" :readonly="true" color="#00FF16"  active-color="#00FF16" >
						</yd-rate>
						<span slot="right"> 7.0</span>
					</yd-cell-item>
					<yd-cell-item>
						<span slot="left">左边内容二</span>
						<span slot="right">内容</span>
					</yd-cell-item>
					<yd-cell-item >
						<span slot="left">左边内容一</span>
						<span slot="right">评分	：&nbsp;&nbsp;</span>
						<yd-rate slot="right" v-model="rate3" :readonly="true" color="#00FF16"  active-color="#00FF16" >
						</yd-rate>
						<span slot="right"> 7.0</span>
					</yd-cell-item>
					<yd-cell-item>
						<span slot="left">左边内容二</span>
						<span slot="right">内容</span>
					</yd-cell-item>
					<yd-cell-item >
						<span slot="left">左边内容一</span>
						<span slot="right">评分	：&nbsp;&nbsp;</span>
						<yd-rate slot="right" v-model="rate3" :readonly="true" color="#00FF16"  active-color="#00FF16" >
						</yd-rate>
						<span slot="right"> 7.0</span>
					</yd-cell-item>
					<yd-cell-item>
						<span slot="left">左边内容二</span>
						<span slot="right">内容</span>
					</yd-cell-item>
					<yd-cell-item >
						<span slot="left">左边内容一</span>
						<span slot="right">评分	：&nbsp;&nbsp;</span>
						<yd-rate slot="right" v-model="rate3" :readonly="true" color="#00FF16"  active-color="#00FF16" >
						</yd-rate>
						<span slot="right"> 7.0</span>
					</yd-cell-item>
					<yd-cell-item>
						<span slot="left">左边内容二</span>
						<span slot="right">内容</span>
					</yd-cell-item>
					<yd-cell-item >
						<span slot="left">左边内容一</span>
						<span slot="right">评分	：&nbsp;&nbsp;</span>
						<yd-rate slot="right" v-model="rate3" :readonly="true" color="#00FF16"  active-color="#00FF16" >
						</yd-rate>
						<span slot="right"> 7.0</span>
					</yd-cell-item>
					<yd-cell-item>
						<span slot="left">左边内容二</span>
						<span slot="right">内容</span>
					</yd-cell-item>
					<yd-cell-item >
						<span slot="left">左边内容一</span>
						<span slot="right">评分	：&nbsp;&nbsp;</span>
						<yd-rate slot="right" v-model="rate3" :readonly="true" color="#00FF16"  active-color="#00FF16" >
						</yd-rate>
						<span slot="right"> 7.0</span>
					</yd-cell-item>
					<yd-cell-item>
						<span slot="left">左边内容二</span>
						<span slot="right">内容</span>
					</yd-cell-item>
					<yd-cell-item >
						<span slot="left">左边内容一</span>
						<span slot="right">评分	：&nbsp;&nbsp;</span>
						<yd-rate slot="right" v-model="rate3" :readonly="true" color="#00FF16"  active-color="#00FF16" >
						</yd-rate>
						<span slot="right"> 7.0</span>
					</yd-cell-item>
					<yd-cell-item>
						<span slot="left">左边内容二</span>
						<span slot="right">内容</span>
					</yd-cell-item>
					
					<yd-cell-item >
						<span slot="left">左边内容一</span>
						<span slot="right">评分	：&nbsp;&nbsp;</span>
						<yd-rate slot="right" v-model="rate3" :readonly="true" color="#00FF16"  active-color="#00FF16" >
						</yd-rate>
						<span slot="right"> 7.0</span>
					</yd-cell-item>
					<yd-cell-item>
						<span slot="left">左边内容二</span>
						<span slot="right">内容</span>
					</yd-cell-item>
				</yd-cell-group>
			</div>
		</slot>
		<yd-tabbar slot="tabbar" >
				<yd-tabbar-item title="首页" @click.native="titclick" :active="shouye">
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
<script src="/static/axios/axios.min.js"></script>
<script>

    new Vue({
        el: '#app',
		data:{
			queryString:'',
			result: [],
			shouye:true,
			jiuying:false,
			gr:false,
			rate0: 0,  
			rate1: 1, 
			rate2: 2, 
			rate3: 3, 
			rate4: 4,
			rate5: 5
		},
        methods: {
        	
        	getResult(val) {
        		this.result=[];
        		let gg = this.result;
        		axios.get('/hospital', {
					params: {
						name:val
					}
				  })
				  .then(function (response) {
					  console.log(response.data);
					 if(!response.data){
						 gg.push("暂无该相关医院信息");
					 }else{
						 //console.log(response);
						//console.log(response.data[0].hospitalName);
						response.data.forEach((item, index) => {
							gg.push(item.hospitalName);
						});
					 }
					
				  })
				  .catch(function (error) {
					console.log(error);
				});
            },
            itemClickHandler(item) {
                this.$dialog.toast({mes: `结果点击：${item}`});
            },
            submitHandler(queryString) {
            	
            },
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
		},
		watch: {
			queryString(val) {
            	this.getResult(val);
            }
        }
    })
</script>
</body>
</html>