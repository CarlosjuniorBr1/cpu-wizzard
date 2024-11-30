package cpuwizard.cpuwizard.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cpuwizard.cpuwizard.dto.CpuCriteriaDto;
import cpuwizard.cpuwizard.model.CpuRecomendation;
import cpuwizard.cpuwizard.services.CpuRecomendationService;

@RestController
public class CpuWizzardController {

    private final CpuRecomendationService recomendationService;

    public CpuWizzardController(CpuRecomendationService recomendationService){
        this.recomendationService = recomendationService;
    }

    @GetMapping("/hello")
    public String homeMensage(){
        return "Welcome To Cpu-Wizzard";
    }

    @PostMapping("/recommend")
    public CpuRecomendation recomendation(@RequestBody CpuCriteriaDto criteria){
        return recomendationService.GetRecomendation(criteria);
    }
}
