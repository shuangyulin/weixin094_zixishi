import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import zuoweixinxi from '@/views/modules/zuoweixinxi/list'
    import zhuanyefenlei from '@/views/modules/zhuanyefenlei/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import xueyuanfenlei from '@/views/modules/xueyuanfenlei/list'
    import messages from '@/views/modules/messages/list'
    import zixishifenlei from '@/views/modules/zixishifenlei/list'
    import config from '@/views/modules/config/list'
    import zuoweiyuyue from '@/views/modules/zuoweiyuyue/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/news',
        name: '图书馆资讯',
        component: news
      }
          ,{
	path: '/zuoweixinxi',
        name: '座位信息',
        component: zuoweixinxi
      }
          ,{
	path: '/zhuanyefenlei',
        name: '专业分类',
        component: zhuanyefenlei
      }
          ,{
	path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
          ,{
	path: '/xueyuanfenlei',
        name: '学院分类',
        component: xueyuanfenlei
      }
          ,{
	path: '/messages',
        name: '留言板管理',
        component: messages
      }
          ,{
	path: '/zixishifenlei',
        name: '自习室分类',
        component: zixishifenlei
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
          ,{
	path: '/zuoweiyuyue',
        name: '座位预约',
        component: zuoweiyuyue
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
