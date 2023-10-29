package com.mydemospring.mydemospring.rest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("/home")
public class RestController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Value("${coach.name}")
    private String coachName;
    @GetMapping("/")
    public String sayHello(){
        return "Hello WOrd";
    }

    @GetMapping("/home")
    public String sayHello2(){
        logger.info("Demo Message");
        System.out.println("Gello");
        return "Hello WOrd2";
    }

    @RequestMapping(value="/save", method= RequestMethod.POST)
    public ModelAndView save()
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("demo");
        return modelAndView;
    }
}
