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

    @GetMapping("/readmore1")
    public String readMore1() {
        return "read_more1"; // templates/read_more1.html 렌더링
    }

    @GetMapping("/readmore2")
    public String readMore2() {
        return "read_more2"; // templates/read_more2.html 렌더링
    }

    @GetMapping("/readmore3")
    public String readMore3() {
        return "read_more3"; // templates/read_more2.html 렌더링
    }






}

