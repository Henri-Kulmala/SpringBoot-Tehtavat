package syksy24.backend.test.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class Hello {

    @RequestMapping("/hello")
    @ResponseBody

    public String hello(@RequestParam(value= "moon", required = false, defaultValue = "moon") String loc, @RequestParam(name = "name", required = false, defaultValue = "John") String nimi) {


        return "Hello " + nimi + " welcome to the " + loc + "!";
    }
}
