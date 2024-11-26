package cpuwizard.cpuwizard.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CpuWizzarController {

    @GetMapping("/hello")
    public String homeMensage(){
        return "Welcome To Cpu-Wizzard";
    }
}
