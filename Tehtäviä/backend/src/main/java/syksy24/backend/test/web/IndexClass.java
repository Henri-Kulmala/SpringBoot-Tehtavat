package syksy24.backend.test.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class IndexClass {
    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        return "This is the main page";
    }

}
