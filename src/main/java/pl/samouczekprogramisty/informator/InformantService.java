package pl.samouczekprogramisty.informator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InformantService {
    @RequestMapping(path="/hello")
    public String helloWorld() {
        return "Siemasz Samouku!";
    }
}

