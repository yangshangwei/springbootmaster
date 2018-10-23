package com.artisan.springbootmaster.controller;

import com.artisan.springbootmaster.conf.ArtisanConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ArtisanConfigLoadTest {

    @Autowired
    private ArtisanConfig artisanConfig;

    @GetMapping("/loadSelfConfigProperties")
    public Map<String,Object> loadConf(){
        Map<String,Object> map = new HashMap<>();

        map.put("name",artisanConfig.getName());
        map.put("value", artisanConfig.getAge());

        return map;
    }
}
