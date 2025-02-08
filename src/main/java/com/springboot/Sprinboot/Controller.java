package com.springboot.Sprinboot;

import com.springboot.Sprinboot.Model.BusinessMastery;
import com.springboot.Sprinboot.Model.CerebraQuest;
import com.springboot.Sprinboot.Model.Innovatrix;
import com.springboot.Sprinboot.Model.PictionaryPros;
import com.springboot.Sprinboot.Model.PixelPerfects;
import com.springboot.Sprinboot.Model.ProjectExpo;
import com.springboot.Sprinboot.Model.RhetoricRumble;
import com.springboot.Sprinboot.Model.RuntimeTerror;
import org.springframework.web.bind.annotation.*;

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


    @GetMapping("/")
    public String succes(){
        return "Success";
    }

    //Event 1
    @PostMapping("/paper")
    public Innovatrix paper(@RequestBody Innovatrix model){
        return innovatrix.save(model);
    }

    //Event 2
    @PostMapping("/coding")
    public RuntimeTerror code(@RequestBody RuntimeTerror model){
        return runtimeTerror.save(model);
    }

    //Event 3
    @PostMapping("/uiux")
    public PixelPerfects uiux(@RequestBody PixelPerfects model) {
        return pixelPerfects.save(model);
    }


    //Event 4
    @PostMapping("/business")
    public BusinessMastery business(@RequestBody BusinessMastery model){
        return businessMastery.save(model);
    }

    //Event 5
    @PostMapping("/quiz")
    public CerebraQuest quiz(@RequestBody CerebraQuest model){
        return cerebraQuest.save(model);
    }

    //Event 6
    @PostMapping("/surprise")
    public PictionaryPros surprise(@RequestBody PictionaryPros model){
        return pictionaryPros.save(model);
    }

    //Event 7
    @PostMapping("/debate")
    public RhetoricRumble find(@RequestBody RhetoricRumble model){
        return rhetoricRumble.save(model);
    }

    //Event 8
    @PostMapping("/project")
    public ProjectExpo project(@RequestBody ProjectExpo model){
        return projectExpo.save(model);
    }


}
