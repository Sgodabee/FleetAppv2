package com.sgodabee.fleetappv2.settings.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ModuleController {

    @GetMapping("/parameters/modules")
    public String getModules(){
        return "modules";
    }

}
