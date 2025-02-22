package com.springboot.Sprinboot;

import com.springboot.Sprinboot.Model.*;
import com.springboot.Sprinboot.Repo.FinalRepo;
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

    // rate limiter

    private final RateLimitService rateLimiterService ;
    private final Map<String, Integer> captchaStore = new ConcurrentHashMap<>();
    private final Random random = new Random();



    @Autowired
    private FinalRepo finalRepo;

    public Controller(com.springboot.Sprinboot.Repo.BusinessMastery businessMastery, com.springboot.Sprinboot.Repo.CerebraQuest cerebraQuest, com.springboot.Sprinboot.Repo.Innovatrix innovatrix, com.springboot.Sprinboot.Repo.PictionaryPros pictionaryPros, com.springboot.Sprinboot.Repo.PixelPerfects pixelPerfects, com.springboot.Sprinboot.Repo.ProjectExpo projectExpo, com.springboot.Sprinboot.Repo.RhetoricRumble rhetoricRumble, com.springboot.Sprinboot.Repo.RuntimeTerror runtimeTerror, RateLimitService rateLimiterService) {
        this.businessMastery = businessMastery;
        this.cerebraQuest = cerebraQuest;
        this.innovatrix = innovatrix;
        this.pictionaryPros = pictionaryPros;
        this.pixelPerfects = pixelPerfects;
        this.projectExpo = projectExpo;
        this.rhetoricRumble = rhetoricRumble;
        this.runtimeTerror = runtimeTerror;
        this.rateLimiterService = rateLimiterService;
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

    @GetMapping("/getCoding")
    public List<RuntimeTerror> code(){
        return runtimeTerror.findAll();
    }

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

    @GetMapping("/getUiux")
    public List<PixelPerfects> pixelPerfects(){
        return pixelPerfects.findAll();
    }

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

    @GetMapping("/getQuiz")
    public List<CerebraQuest> cerebraQuest(){
        return cerebraQuest.findAll();
    }

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

    @GetMapping("/getSurprise")
    public List<PictionaryPros> pictionaryPros(){
        return pictionaryPros.findAll();
    }

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

    @GetMapping("/getDebate")
    public List<RhetoricRumble> rhetoricRumbles(){
        return rhetoricRumble.findAll();
    }

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
    //final
    @PostMapping("/project")
    public ProjectExpo project(@RequestBody ProjectExpo model){

        Final f1 = new Final();
        f1.setParticipantName(model.getParticipantName());
        f1.setCollege(model.getCollege());
        f1.setYear(model.getYear());
        f1.setEvent_name("Prototype Parade");
        finalRepo.save(f1);
        return projectExpo.save(model);
    }





    @GetMapping("/request")
    public ResponseEntity<String> checkRequest(HttpServletRequest request) {
        String ip = request.getRemoteAddr();

        if (!rateLimiterService.isRequestAllowed(ip)) {
            System.out.println("Rate limit exceeded for IP: " + ip);
            return ResponseEntity.status(429).body("Too Many Requests"); // Ensure correct 429 response
        }

        System.out.println("Request allowed for IP: " + ip);
        return ResponseEntity.ok("Request allowed");
    }

    // API to Generate CAPTCHA Question
    @GetMapping("/captcha")
    public ResponseEntity<Map<String, String>> getCaptcha(HttpServletRequest request) {
        int num1 = random.nextInt(10) + 1;
        int num2 = random.nextInt(10) + 1;
        int answer = num1 * num2;

        String clientIp = request.getRemoteAddr();
        captchaStore.put(clientIp, answer); // Store CAPTCHA answer for IP

        Map<String, String> response = new HashMap<>();
        response.put("question", "What is " + num1 + " * " + num2 + "?");

        System.out.println("Generated CAPTCHA for IP " + clientIp + ": " + num1 + " * " + num2 + " = " + answer);
        return ResponseEntity.ok(response);
    }

    // API to Verify CAPTCHA Answer
    @PostMapping("/captcha")
    public ResponseEntity<String> verifyCaptcha(@RequestParam String answer, HttpServletRequest request) {
        String clientIp = request.getRemoteAddr();
        int correctAnswer = captchaStore.getOrDefault(clientIp, -1);

        if (Integer.toString(correctAnswer).equals(answer)) {
            rateLimiterService.resetLimit(clientIp); // Reset rate limit
            captchaStore.remove(clientIp); // Remove CAPTCHA record
            System.out.println("CAPTCHA passed for IP: " + clientIp);
            return ResponseEntity.ok("CAPTCHA Passed");
        }

        System.out.println("CAPTCHA failed for IP: " + clientIp);
        return ResponseEntity.badRequest().body("Wrong CAPTCHA");
    }


}
