package com.lumos.pizzastore;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
    @RequestMapping (method = RequestMethod.GET, value = "/")
    public String showHomePage(){
        return "index.html";
    }

}
