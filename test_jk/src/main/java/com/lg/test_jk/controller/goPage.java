package com.lg.test_jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class goPage {

        @RequestMapping("/hello")
        public String go(){
            return "hello";
        }
}
