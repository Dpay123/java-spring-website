package com.dp.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Page1Controller {

    @RequestMapping(value={"/page1"})
    public String displayPage1() { return "page1.html";}
}
