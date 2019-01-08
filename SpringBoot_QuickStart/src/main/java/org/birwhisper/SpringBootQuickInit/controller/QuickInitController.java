package org.birwhisper.SpringBootQuickInit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author: RenKeMuHua
 * @date: Created in 18:08 2019.1.7
 * @Description:
 */
@RestController
@RequestMapping("/init")
public class QuickInitController {

    @RequestMapping("/start")
    public String QuickStart(){
        return "欢迎访问 Spring Boot!";
    }

    @RequestMapping("/ace")
    public String SecondStart(){
        return "欢迎访问 Spring Boot 2!";
    }
}
