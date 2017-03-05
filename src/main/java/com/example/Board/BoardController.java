package com.example.Board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by leesunghee on 2017. 3. 5..
 */
@Controller
@RequestMapping("/board")
public class BoardController {

    @RequestMapping(method = RequestMethod.GET, value="/list")
    public String Board() {
        return "board/list";
    }

    @RequestMapping(method = RequestMethod.GET, value="/home")
    public String BoardHome() {
        return "board/home";
    }

}
