package sa.com.alrajhi.spring.webservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/")
public class RootrestController {

    @GetMapping("/")
    public String sendRoot() {
        return "uploadFile";
    }
}
