package com.techprimers.security.sringsecurityclient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;

@Controller
public class MainController {

    @RequestMapping(value = "/secpage",  produces="text/plain")
    @ResponseBody
    public String secPage (Principal principal) {

        System.out.println(principal);
        return "HelloKitty!";
    }
}
