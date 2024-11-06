package in.sp.main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MyController {

    @GetMapping("/OpenProfile")
    public String OpenProfilePage(Model model){
        String name = "Nishant Narwade";
        model.addAttribute("modelName",name);
        return "profile";

    }
    @GetMapping("/openConditional")
    public String openConditionalPage(Model model){
        int no1=10;
        int no2=20;
        model.addAttribute("no1",no1);
        model.addAttribute("no2",no2);

        return "conditional";
    }//looping.

    @GetMapping("/LoopingMapping")
    public String LoopingMappingPage(Model model){
        List<Integer> numbers =List.of(1,2,3,4,5);
        model.addAttribute("ModelNumbers",numbers);
        return "looping";
    }
}
