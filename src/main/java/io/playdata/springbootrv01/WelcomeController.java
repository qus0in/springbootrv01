package io.playdata.springbootrv01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/welcome")
public class WelcomeController {
    @RequestMapping("/")
    public String welcome() {
        return "welcome"; // Controller -> templates -> welcome.html
    }

    @RequestMapping("/{goal}")
    public String welcome2(@PathVariable String goal, Model model) {
        model.addAttribute("goal", goal);
        return "welcome2"; // Controller -> templates -> welcome.html
    }
}
