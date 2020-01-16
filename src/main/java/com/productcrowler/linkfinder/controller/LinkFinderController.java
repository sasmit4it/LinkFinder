package com.productcrowler.controller;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinkFinderController {

    @PostMapping("/linkfinder/addroot")
    public void addRootUrl(@RequestBody Map<String,String> body){
        System.out.println(body);
    }

    @GetMapping("/sample")
    public String sample(){
        return "sample";
    }
}
