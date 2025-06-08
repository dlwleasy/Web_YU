package jobstack.jobstack.basic;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/home")
    public String home() {
        return "home"; // templates/home.html 렌더링됨
    }

    @GetMapping("/")
    public String root() {
        return "redirect:/question/list";
    }

    @GetMapping("/self1")
    public String self1() {
        return "self1";
    }

    @GetMapping("/self2")
    public String self2() {
        return "self2";
    }

    @GetMapping("/search")
    public String search() {
        return "search";
    }

}

