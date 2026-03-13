package prog3.td.tdspring1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TDController {
    @GetMapping("/")
    public String TDControllerTest() {
        return "hello";
    }
}


