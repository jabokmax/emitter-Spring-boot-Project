package com.phuwit.app.staticpages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StaticPagesController {
    @RequestMapping("/help")
    public String help(){

        return "static/help";
    }

    @RequestMapping("/about")
    public String about() {

        return "about/about";
    }

    @RequestMapping("/contact")
    public String contract() {

        return "contact/contact";
    }
}
