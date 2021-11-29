package io.javabrians.cornavirusupdate.controller;

import io.javabrians.cornavirusupdate.models.LocationStats;
import io.javabrians.cornavirusupdate.services.CoronaVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    CoronaVirusDataService cvds;

    @GetMapping("/")
    public String home(Model model){
       //name that maps to a template
        List<LocationStats> allStats = cvds.getAllStats();
        int totalCases = allStats.stream().mapToInt(stat -> stat.getCases()).sum();
        int totalCasesGap = allStats.stream().mapToInt(stat -> stat.getGap()).sum();
        model.addAttribute("locationStats", cvds.getAllStats());
        model.addAttribute("totalCases", totalCases);
        model.addAttribute("totalCasesGap", totalCasesGap);

        return"home";
    }

}
