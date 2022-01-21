package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Alex Gutorov
 * @version 1.0
 * @created 21/01/2022 - 21:03
 */
@RequestMapping({"/owners"})
@Controller
public class OwnerController {
    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listVets(){
        return "owners/index";
    }
}

