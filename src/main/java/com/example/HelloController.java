package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 이성희 on 2017-02-24.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String Hello() {
        return "Hello test";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/hello2")
    public String Hello2() {
        return "Hello GET test 8081";
    }

    @RequestMapping(method = RequestMethod.GET, value="/hello3")
    public String Hello3(@RequestParam("name") String name) {

        return "Hello" + name;
    }

    @RequestMapping(method = RequestMethod.POST, value="/hello4")
    public String Hello4(@RequestParam("name") String name) {

        return "Hello" + name;
    }
}
