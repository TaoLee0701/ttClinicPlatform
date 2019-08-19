new Vue({
    el: '#paltform-login',
    data: {
        userName:'',
        userPassword:'',
        loading:false,
        keepPassword:false,
        // autoLogin:false,
        userNameIsNull:true,
        passwordIsNull:true
    },
    created () {
        let loginUser = window.localStorage.getItem('loginUser');
        if(loginUser){
            this.userName=loginUser.userName
            this.userPassword=loginUser.userPassword
            this.keepPassword=true
        }
    },
    mounted () {
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
            axios.post('/ttPlatform/check-login', {
                userName: this.userName,
                userPassword: this.userPassword
            }).then(function (res) {
                if(res.data.code===200){
                    // temp.$Message.success('验证成功！');
                    if(temp.keepPassword){
                        localStorage.setItem('loginUser',JSON.stringify(res.data.data));
                    }
                    // if(temp.autoLogin){
                    //
                    // }
                    location.href="/ttPlatform/home"
                }else if(res.data.code===302){
                    temp.$Message.warning('此账号没有权限登录！');
                }else if(res.data.code===500){
                    temp.$Message.error('用户名或密码有误！');
                }
                temp.loading=false
            })
        },
        forgetPassword(){
            if(this.loading===true){
                return
            }
            console.log("忘记密码")
        }
    }
})
