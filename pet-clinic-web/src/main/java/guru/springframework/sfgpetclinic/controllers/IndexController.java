package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Alex Gutorov
 * @version 1.0
 * @created 21/01/2022 - 19:07
 */
@Controller
public class IndexController {
    @RequestMapping({"", "/", "index", "index.html"})
    public String index(){
        return "index";
    }
}
