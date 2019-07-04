package com.glut.egguse.controller;


import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {
    @GetMapping(value = "/helloGet")
    public HashMap<String,String> helloGet(){
        HashMap<String,String> map = new HashMap<>();
        map.put("result","yes");
        return map;
    }
    @PostMapping(value = "/helloPost")
    public HashMap<String,String> helloPost(@RequestBody Map<String,String> data){
        HashMap<String,String> map = new HashMap<>();
        System.out.println("data:"+data.get("data"));
        return map;
    }
}
