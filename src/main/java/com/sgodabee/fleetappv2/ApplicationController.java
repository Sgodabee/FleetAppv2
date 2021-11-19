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

    @GetMapping("/index2")
    public String index2()
    {
        return "index2";
    }


//Department Mapping
    @GetMapping("/hr")
    public String hr()
    {
        return "hr/index";
    }
    @GetMapping("/accounts")
    public String accounts()
    {
        return "accounts/index";
    }

    @GetMapping("/helpdesk")
    public String helpDesk()
    {
        return "helpdesk/index";
    }
    @GetMapping("/payroll")
    public String payroll()
    {
        return "payroll/index";
    }
    @GetMapping("/settings")
    public String settings()
    {
        return "settings/index";
    }
    @GetMapping("/vehicle")
    public String vehicle()
    {
        return "vehicle/index";
    }

    // end Department Mapping

    @GetMapping("/_layout")
    public String layout()
    {
        return "_layout";
    }


}
