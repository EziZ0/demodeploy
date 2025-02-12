package com.springboot.Sprinboot;

import com.springboot.Sprinboot.Model.*;
import com.springboot.Sprinboot.Repo.FinalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//updated controller

@CrossOrigin(origins = "*")
@RestController
public class Controller {

    private final com.springboot.Sprinboot.Repo.BusinessMastery businessMastery;
    private final com.springboot.Sprinboot.Repo.CerebraQuest cerebraQuest;
    private final com.springboot.Sprinboot.Repo.Innovatrix innovatrix;
    private final com.springboot.Sprinboot.Repo.PictionaryPros pictionaryPros;
    private final com.springboot.Sprinboot.Repo.PixelPerfects pixelPerfects;
    private final com.springboot.Sprinboot.Repo.ProjectExpo projectExpo;
    private final com.springboot.Sprinboot.Repo.RhetoricRumble rhetoricRumble;
    private final com.springboot.Sprinboot.Repo.RuntimeTerror runtimeTerror;

    public Controller(com.springboot.Sprinboot.Repo.BusinessMastery businessMastery, com.springboot.Sprinboot.Repo.CerebraQuest cerebraQuest, com.springboot.Sprinboot.Repo.PictionaryPros pictionaryPros, com.springboot.Sprinboot.Repo.Innovatrix innovatrix, com.springboot.Sprinboot.Repo.PixelPerfects pixelPerfects, com.springboot.Sprinboot.Repo.ProjectExpo projectExpo, com.springboot.Sprinboot.Repo.RhetoricRumble rhetoricRumble, com.springboot.Sprinboot.Repo.RuntimeTerror runtimeTerror) {
        this.businessMastery = businessMastery;
        this.cerebraQuest = cerebraQuest;
        this.pictionaryPros = pictionaryPros;
        this.innovatrix = innovatrix;
        this.pixelPerfects = pixelPerfects;
        this.projectExpo = projectExpo;
        this.rhetoricRumble = rhetoricRumble;
        this.runtimeTerror = runtimeTerror;
    }

    @Autowired
    private FinalRepo finalRepo;


    @GetMapping("/")
    public String succes(){
        return "Success";
    }

    //Event 1
    @PostMapping("/paper")
    public Innovatrix paper(@RequestBody Innovatrix model){
        Final f1 = new Final();
        f1.setParticipantName(model.getParticipantName());
        f1.setCollege(model.getCollege());
        f1.setYear(model.getYear());
        f1.setEvent_name("Innovatrix");
        finalRepo.save(f1);
        return innovatrix.save(model);
    }

    //Event 2
    @PostMapping("/coding")
    public RuntimeTerror code(@RequestBody RuntimeTerror model){
        Final f1 = new Final();
        f1.setParticipantName(model.getParticipantName());
        f1.setCollege(model.getCollege());
        f1.setYear(model.getYear());
        f1.setEvent_name("Runtime Terror");
        finalRepo.save(f1);
        return runtimeTerror.save(model);
    }

    //Event 3
    @PostMapping("/uiux")
    public PixelPerfects uiux(@RequestBody PixelPerfects model) {
        Final f1 = new Final();
        f1.setParticipantName(model.getParticipantName());
        f1.setCollege(model.getCollege());
        f1.setYear(model.getYear());
        f1.setEvent_name("Pixel Perfects");
        finalRepo.save(f1);
        return pixelPerfects.save(model);
    }


    //Event 4


    @GetMapping("/getBusiness")
    public List<BusinessMastery> businessMastery(){
        return businessMastery.findAll();
    }

    @PostMapping("/business")
    public BusinessMastery business(@RequestBody BusinessMastery model){
        Final f1 = new Final();
        f1.setParticipantName(model.getParticipantName());
        f1.setCollege(model.getCollege());
        f1.setYear(model.getYear());
        f1.setEvent_name("Business Mastery");
        finalRepo.save(f1);
        return businessMastery.save(model);
    }

    //Event 5
    @PostMapping("/quiz")
    public CerebraQuest quiz(@RequestBody CerebraQuest model){
        Final f1 = new Final();
        f1.setParticipantName(model.getParticipantName());
        f1.setCollege(model.getCollege());
        f1.setYear(model.getYear());
        f1.setEvent_name("Cerebra Quest");
        finalRepo.save(f1);
        return cerebraQuest.save(model);
    }

    //Event 6
    @PostMapping("/surprise")
    public PictionaryPros surprise(@RequestBody PictionaryPros model){
        Final f1 = new Final();
        f1.setParticipantName(model.getParticipantName());
        f1.setCollege(model.getCollege());
        f1.setYear(model.getYear());
        f1.setEvent_name("Surprise Event");
        finalRepo.save(f1);
        return pictionaryPros.save(model);
    }

    //Event 7
    @PostMapping("/debate")
    public RhetoricRumble find(@RequestBody RhetoricRumble model){
        Final f1 = new Final();
        f1.setParticipantName(model.getParticipantName());
        f1.setCollege(model.getCollege());
        f1.setYear(model.getYear());
        f1.setEvent_name("Rhetoric Rumble");
        finalRepo.save(f1);
        return rhetoricRumble.save(model);
    }

    //Event 8
    @PostMapping("/project")
    public ProjectExpo project(@RequestBody ProjectExpo model){
        return projectExpo.save(model);
    }


}
