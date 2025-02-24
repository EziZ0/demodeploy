package com.springboot.Sprinboot;

import com.springboot.Sprinboot.Model.*;
import com.springboot.Sprinboot.Repo.FinalRepo;
import jakarta.mail.MessagingException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

//updated controller
//final

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
    private final com.springboot.Sprinboot.EmailService emailService;

    // rate limiter




    @Autowired
    private FinalRepo finalRepo;



    public Controller(com.springboot.Sprinboot.Repo.BusinessMastery businessMastery, com.springboot.Sprinboot.Repo.CerebraQuest cerebraQuest, com.springboot.Sprinboot.Repo.Innovatrix innovatrix, com.springboot.Sprinboot.Repo.PictionaryPros pictionaryPros, com.springboot.Sprinboot.Repo.PixelPerfects pixelPerfects, com.springboot.Sprinboot.Repo.ProjectExpo projectExpo, com.springboot.Sprinboot.Repo.RhetoricRumble rhetoricRumble, com.springboot.Sprinboot.Repo.RuntimeTerror runtimeTerror, com.springboot.Sprinboot.EmailService emailService, EmailService emailService1) {
        this.businessMastery = businessMastery;
        this.cerebraQuest = cerebraQuest;
        this.innovatrix = innovatrix;
        this.pictionaryPros = pictionaryPros;
        this.pixelPerfects = pixelPerfects;
        this.projectExpo = projectExpo;
        this.rhetoricRumble = rhetoricRumble;
        this.runtimeTerror = runtimeTerror;
        this.emailService = emailService1;
    }


    @GetMapping("/")
    public String succes(){
        return "Success";
    }

    //Event 1

    @GetMapping("/getPaper")
    public List<Innovatrix> innovatrixes(){
        return innovatrix.findAll();
    }

    @GetMapping("/final")
    public List<Final> finals(){
        return finalRepo.findAll();
    }

    @PostMapping("/paper")
    public Innovatrix paper(@RequestBody Innovatrix model) throws MessagingException {
        Final f1 = new Final();
        f1.setParticipantName(model.getParticipantName());
        f1.setCollege(model.getCollege());
        f1.setYear(model.getYear());
        f1.setEvent_name("Innovatrix");
        finalRepo.save(f1);
        emailService.sendRegistrationEmail(model.getEmail(),model.getParticipantName());
        return innovatrix.save(model);
    }



    //Event 2

    @GetMapping("/getCoding")
    public List<RuntimeTerror> code(){
        return runtimeTerror.findAll();
    }

    @PostMapping("/coding")
    public RuntimeTerror code(@RequestBody RuntimeTerror model) throws MessagingException {
        Final f1 = new Final();
        f1.setParticipantName(model.getParticipantName());
        f1.setCollege(model.getCollege());
        f1.setYear(model.getYear());
        f1.setEvent_name("Runtime Terror");
        finalRepo.save(f1);
        emailService.sendRegistrationEmail(model.getEmail(),model.getParticipantName());
        return runtimeTerror.save(model);
    }

    //Event 3

    @GetMapping("/getUiux")
    public List<PixelPerfects> pixelPerfects(){
        return pixelPerfects.findAll();
    }

    @PostMapping("/uiux")
    public PixelPerfects uiux(@RequestBody PixelPerfects model) throws MessagingException {
        Final f1 = new Final();

        f1.setParticipantName(model.getParticipantName());
        f1.setCollege(model.getCollege());
        f1.setYear(model.getYear());
        f1.setEvent_name("Pixel Perfects");
        finalRepo.save(f1);
        emailService.sendRegistrationEmail(model.getEmail(),model.getParticipantName());
        return pixelPerfects.save(model);
    }


    //Event 4


    @GetMapping("/getBusiness")
    public List<BusinessMastery> businessMastery(){
        return businessMastery.findAll();
    }

    @PostMapping("/business")
    public BusinessMastery business(@RequestBody BusinessMastery model) throws MessagingException {
        Final f1 = new Final();
        f1.setParticipantName(model.getParticipantName());
        f1.setCollege(model.getCollege());
        f1.setYear(model.getYear());
        f1.setEvent_name("Business Mastery");
        finalRepo.save(f1);
        emailService.sendRegistrationEmail(model.getEmail(),model.getParticipantName());
        return businessMastery.save(model);
    }

    //Event 5

    @GetMapping("/getQuiz")
    public List<CerebraQuest> cerebraQuest(){
        return cerebraQuest.findAll();
    }

    @PostMapping("/quiz")
    public CerebraQuest quiz(@RequestBody CerebraQuest model) throws MessagingException {
        Final f1 = new Final();
        f1.setParticipantName(model.getParticipantName());
        f1.setCollege(model.getCollege());
        f1.setYear(model.getYear());
        f1.setEvent_name("Cerebra Quest");
        finalRepo.save(f1);
        emailService.sendRegistrationEmail(model.getEmail(),model.getParticipantName());
        return cerebraQuest.save(model);
    }

    //Event 6

    @GetMapping("/getSurprise")
    public List<PictionaryPros> pictionaryPros(){
        return pictionaryPros.findAll();
    }

    @PostMapping("/surprise")
    public PictionaryPros surprise(@RequestBody PictionaryPros model) throws MessagingException {
        Final f1 = new Final();
        f1.setParticipantName(model.getParticipantName());
        f1.setCollege(model.getCollege());
        f1.setYear(model.getYear());
        f1.setEvent_name("Surprise Event");
        finalRepo.save(f1);
        emailService.sendRegistrationEmail(model.getEmail(),model.getParticipantName());
        return pictionaryPros.save(model);
    }

    //Event 7

    @GetMapping("/getDebate")
    public List<RhetoricRumble> rhetoricRumbles(){
        return rhetoricRumble.findAll();
    }

    @PostMapping("/debate")
    public RhetoricRumble find(@RequestBody RhetoricRumble model) throws MessagingException {
        Final f1 = new Final();
        f1.setParticipantName(model.getParticipantName());
        f1.setCollege(model.getCollege());
        f1.setYear(model.getYear());
        f1.setEvent_name("Rhetoric Rumble");
        finalRepo.save(f1);
        emailService.sendRegistrationEmail(model.getEmail(),model.getParticipantName());
        return rhetoricRumble.save(model);
    }

    //Event 8

    @GetMapping("/getProject")
    public List<ProjectExpo> project(){
        return projectExpo.findAll();
    }
    //final
    @PostMapping("/project")
    public ProjectExpo project(@RequestBody ProjectExpo model) throws MessagingException {

        Final f1 = new Final();
        f1.setParticipantName(model.getParticipantName());
        f1.setCollege(model.getCollege());
        f1.setYear(model.getYear());
        f1.setEvent_name("Prototype Parade");
        finalRepo.save(f1);
        emailService.sendRegistrationEmail(model.getEmail(),model.getParticipantName());
        return projectExpo.save(model);
    }








}
