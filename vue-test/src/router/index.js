import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import IstioDemo from '@/components/IstioDemo'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld
    },
    {
      path: '/istioDemo',
      name: 'IstioDemo',
      component: IstioDemo
    }
  ]
})
