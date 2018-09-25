package com.company.service;

import java.util.HashMap;
import java.util.Map;

import com.company.service.input.SummonerInput;
import com.company.model.MatchAverages;
import org.jbpm.services.api.DeploymentService;
import org.jbpm.services.api.ProcessService;
import org.jbpm.services.api.RuntimeDataService;
import org.kie.server.services.api.KieServer;
import org.kie.server.springboot.jbpm.ContainerAliasResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

;

@Controller
public class ApplicationController {

    @Autowired
    private DeploymentService deploymentService;

    @Autowired
    private RuntimeDataService runtimeDataService;

    @Autowired
    private ProcessService processService;

    @Autowired
    private KieServer kieServer; // have to autowire this bean in order to use aliasresolver atm

    @Autowired
    private ContainerAliasResolver aliasResolver;

    private MatchAverages matchAverages;
    private SummonerInput summonerInput;
    private String containerAlias = "sampleriotleaguestatscontainer";
    private String processId = "src.main.resources.summonermatchesprocess";

    @GetMapping("/riotdemo")
    public String summonerForm(Model model) {
        model.addAttribute("summonerinput",
                           new SummonerInput());
        return "riotdemo";
    }

    @PostMapping("/riotdemo")
    public String summonerFormSubmit(@ModelAttribute SummonerInput summonerInput,
                                     Model model) {
        runRiotProcess(summonerInput,
                       model);

        return "redirect:/riotdemoresults";
    }

    @GetMapping("/riotdemoresults")
    public String summonerResults(Model model) {
        model.addAttribute("summonerInfo",
                           summonerInput);
        model.addAttribute("matchAverages",
                           matchAverages);
        return "riotdemoresults";
    }

    private void runRiotProcess(SummonerInput summonerInput,
                                Model model) {
        this.summonerInput = summonerInput;
        this.matchAverages = new MatchAverages();

        Map<String, Object> processInputs = new HashMap<>();
        processInputs.put("inSummonerName",
                          summonerInput.getSummonerName());
        processInputs.put("inSummonerPlatform",
                          summonerInput.getSummonerPlatform());
        processInputs.put("inNumOfMatches",
                          summonerInput.getNumOfGames());
        processInputs.put("matchaverages",
                          matchAverages);

        String resolvedContainerId = aliasResolver.latest(containerAlias);

        long processInstanceId = processService.startProcess(resolvedContainerId,
                                                             processId,
                                                             processInputs);
    }
}
