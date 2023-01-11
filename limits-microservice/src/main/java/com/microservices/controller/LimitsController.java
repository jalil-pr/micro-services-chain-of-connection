package main.java.com.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import main.java.com.microservices.bean.Limit;
import main.java.com.microservices.config.PropertySourceConfig;


@RestController
// @RequestMapping("/limits")
public class LimitsController {
    @Autowired
    private PropertySourceConfig config;
    @GetMapping("/")
    public void getConfig(){
        System.out.println(">>>>>> YOUR REQUEST HERE<<<<<<");
        // return new Limit(config.getMinimum(), config.getMaximum());
        // return null;
    }
}
