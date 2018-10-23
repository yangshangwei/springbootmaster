package com.artisan.springbootmaster.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ArtisanController {

    @Value("${artisan.name}")
    private String name;
    @Value("${artisan.age}")
    private int age;



    @GetMapping("/loadPropertiesValue")
    public String loadPropertiesValue(){
        return "artisan name:【" + name + "】 , age:【" + age  + "】";
    }



    @GetMapping("/test")
    public String test(){
        return "xxx";
    }


    @GetMapping("/test2")
    public Map<String,Object> retrunJson(){
        Map<String ,Object> map = new HashMap<String ,Object>();
        map.put("key1","value1");
        map.put("key2","value2");
        return map ;
    }

}
