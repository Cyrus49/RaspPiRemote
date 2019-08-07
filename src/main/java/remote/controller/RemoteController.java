package remote.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import remote.Remote;


@RestController
@RequestMapping("/remote")
public class RemoteController {

    @GetMapping("/hi")
    public String index() {
        return "Whyfff";
    }
    @PutMapping("/control")
    public String control(@RequestBody int control){
        Remote remote = new Remote();
        System.out.println(control);
        return Integer.toString(control);
    }

}