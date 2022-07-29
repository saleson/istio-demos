<template>
  <div>
    <h2> Istio Demo Latest</h2>
    <el-form>
        <el-form-item label="Domain">
            <el-input placeholder="域名" v-model="domain"> </el-input>
        </el-form-item>
        <el-form-item label="Api Path">
            <el-input placeholder="Api Path" v-model="apiPath"></el-input>
        </el-form-item>
        <el-form-item label="Heanders">
            <el-input type="textarea" placeholder="Heanders" v-model="headers" rows="6" cols="6"></el-input>
        </el-form-item>
        <el-form-item label="Parameters">
            <el-input type="textarea" placeholder="Parameters" v-model="params" rows="6" cols="6"></el-input>
        </el-form-item>
        <el-form-item>
            <el-button 
            type="primary" 
            style="width:100%"
            @click="doGoFunc">GO!</el-button>
        </el-form-item>
        <el-form-item label="Response">
            <el-input  type="textarea" placeholder="Response" rows="6" cols="6" v-model="res" readonly></el-input>
        </el-form-item>

    </el-form>
  </div>
</template>

<script>

import axios from 'axios'

export default {
  name: 'IstioDemo',
  data () {
    return {
      domain:"http://demoa.istiodemos.com",
      apiPath:"/test/request-b",
      params:"{\"forward\":\"istio-springboot-demo-b\", \"a\":\"av356\"}",
      headers:"{}",
      res:""
    }
  },created(){
		this.init()
	},methods:{
		init(){//获取数据
      
		},
    doGoFunc(){
      var parameters = JSON.parse(this.params)
      var headers = JSON.parse(this.headers)

      axios({
              url: this.domain + this.apiPath,
              method: 'get',
              headers: headers,
              params: parameters
            }).then(res => {
              this.res = "success\n" + res.data;
            }).catch(res=>{
              this.res = "fail\n" + JSON.stringify(res);
            })
    }
  }
}
</script>

