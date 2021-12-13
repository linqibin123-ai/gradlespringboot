package com.example.gradlespringboot.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/test")
public class TestController {
    @RequestMapping(value = "/getDate",method = RequestMethod.POST,produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getDate(){
        Map<String,String> map = new HashMap<>();
        String localtime = new Date().toString();
        map.put("code","0");
        map.put("localtime",localtime);
        map.put("msg","ok");
        return JSONObject.toJSONString(map);
    }
}
