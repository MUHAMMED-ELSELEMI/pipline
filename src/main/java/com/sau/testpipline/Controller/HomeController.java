package com.sau.testpipline.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/Home")
public class HomeController {

    @GetMapping
    public String index() {
        return "index";
    }
}
