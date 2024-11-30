package cpuwizard.cpuwizard.services;

import org.springframework.stereotype.Service;

import cpuwizard.cpuwizard.dto.CpuCriteriaDto;
import cpuwizard.cpuwizard.model.CpuRecomendation;

@Service
public class CpuRecomendationService {

    public CpuRecomendation GetRecomendation(CpuCriteriaDto criteria) {
        CpuRecomendation recommendation = new CpuRecomendation();

        String applicationType = criteria.getApplicationType().toLowerCase();
        String performance = criteria.getPerformance().toLowerCase();
        String energyConsumption = criteria.getEnergyConsumption().toLowerCase();
        String cost = criteria.getCost().toLowerCase();

        if (applicationType.equals("games") && performance.equals("fast") && energyConsumption.equals("medium")) {
            recommendation.setProcessor("AMD Ryzen 7 5800X");
            recommendation.setArchitecture("CISC");
            recommendation.setCacheInfo("L1: 64KB, L2: 512KB, L3: 32MB");
            recommendation.setFrequency("3.8GHz (Boost até 4.7GHz)");
            recommendation.setJustification("Excelente para jogos de alto desempenho.");
        } else if (applicationType.equals("ai") && performance.equals("fast") && energyConsumption.equals("high")) {
            recommendation.setProcessor("Intel Xeon W-3275");
            recommendation.setArchitecture("CISC");
            recommendation.setCacheInfo("L1: 64KB, L2: 1MB, L3: 38.5MB");
            recommendation.setFrequency("2.5GHz (Boost até 4.6GHz)");
            recommendation.setJustification("Ideal para cargas intensivas de IA.");
        } else if (applicationType.equals("iot") && performance.equals("fast") && energyConsumption.equals("medium") && cost.equals("low")) {
            recommendation.setProcessor("Intel Core i3-10100T");
            recommendation.setArchitecture("CISC");
            recommendation.setCacheInfo("L1: 64KB, L2: 256KB, L3: 6MB");
            recommendation.setFrequency("3.0GHz (Boost até 3.8GHz)");
            recommendation.setJustification("Bom equilíbrio para dispositivos IoT.");
        } else if (applicationType.equals("iot") && performance.equals("moderate") && energyConsumption.equals("low")) {
            recommendation.setProcessor("Intel Atom x6200FE");
            recommendation.setArchitecture("RISC");
            recommendation.setCacheInfo("L1: 24KB, L2: 1MB");
            recommendation.setFrequency("1.3GHz");
            recommendation.setJustification("Ideal para IoT com baixo consumo de energia.");
        } else if (applicationType.equals("video editing") && performance.equals("fast") && cost.equals("high")) {
            recommendation.setProcessor("AMD Ryzen 9 7950X");
            recommendation.setArchitecture("CISC");
            recommendation.setCacheInfo("L1: 64KB, L2: 1MB, L3: 64MB");
            recommendation.setFrequency("4.5GHz (Boost até 5.7GHz)");
            recommendation.setJustification("Excelente para edição de vídeos.");
        } else {
            // Fallback
            recommendation.setProcessor("Intel Core i5-13400");
            recommendation.setArchitecture("CISC");
            recommendation.setCacheInfo("L1: 64KB, L2: 1.25MB, L3: 20MB");
            recommendation.setFrequency("2.5GHz (Boost até 4.6GHz)");
            recommendation.setJustification("Recomendação padrão.");
        }

        return recommendation;
    }

}
