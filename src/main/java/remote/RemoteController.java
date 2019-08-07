package remote;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RemoteController {

    @RequestMapping("/")
    public String index() {
        return "Whyfff";
    }

}