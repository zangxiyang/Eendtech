package eendtech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Date:2019.03.14
 * Author:Seale
 */
@Controller
@RequestMapping(value = "/hello")
public class FirstController{
    @RequestMapping(value = "/firstController",method = RequestMethod.GET)
    public String handleRequest(HttpServletRequest request, HttpServletResponse response, Model model){
        model.addAttribute("msg","你好MVC");
        return "first";
    }
}
