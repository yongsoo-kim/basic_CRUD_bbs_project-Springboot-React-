package com.yongsoo.bbs.simplecrudbbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("ajaxHome")
    public String ajaxHome() {
        return "ajaxHome";
    }

}
