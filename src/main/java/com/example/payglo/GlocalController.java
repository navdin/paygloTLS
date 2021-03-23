package com.example.payglo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GlocalController {

    @RequestMapping("/hello")
    public String secureHello(){
        return "Secure Hello";
    }
}
