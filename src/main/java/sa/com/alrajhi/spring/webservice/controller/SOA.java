package sa.com.alrajhi.spring.webservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SOA{

    @RequestMapping(value = "/soa", method = RequestMethod.POST)
    public  String generateSOA(){
        return "SOA";
    }
}
