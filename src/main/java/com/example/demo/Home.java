package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Component
//@Scope(value = "prototype")
@Controller
public class Home {

    Home(){
        System.out.println("Home Created");
    }

    @RequestMapping("/home")
    public ModelAndView fun(Bedroom b){
        ModelAndView mv = new ModelAndView();
        mv.addObject("obj",b);
        mv.setViewName("home.jsp");
        return mv;
    }


}
