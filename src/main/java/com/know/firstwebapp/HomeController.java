package com.know.firstwebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController
{
    @RequestMapping("home")

    public String home(HttpServletRequest req)
    {
        String name=req.getParameter("name");
System.out.println("hello" +name);
return "home";
    }
}
