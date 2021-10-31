package com.sgodabee.fleetappv2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {
    @GetMapping("/index")
    public String home()
    {
        return "index";
    }

    @GetMapping("/pages-login")
    public String login()
    {
        return "pages-login";
    }


}
