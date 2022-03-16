package com.example.shahibaloch;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class class2 {
    @RequestMapping("/")

    public String index (){
        return "bye world";
    }
}
