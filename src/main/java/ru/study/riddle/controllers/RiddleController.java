package ru.study.riddle.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.study.riddle.models.Color;
import ru.study.riddle.models.ColorRepository;

@Controller
@RequestMapping("/title")
public class RiddleController {


    private String colorRightAnswer = "ответ отсутствует";
    ColorRepository colorRepository = new ColorRepository();


    @GetMapping()
    public String riddlePage(Model model,
                            @ModelAttribute("color") Color color){
        model.addAttribute("colors", colorRepository.getListOfColors());
        if (colorRightAnswer.equals("54321")){
            model.addAttribute("message", "Вы разгадали загадку!");
        } else if (colorRightAnswer.equals("ответ отсутствует")){
            model.addAttribute("message", "Разгадай загадку!");
        } else {
            model.addAttribute("message", "Попробуйте еще");
        }

        return "title";
    }


    @PatchMapping("/add")
    public String check(@ModelAttribute("color") Color color){

        colorRightAnswer = String.valueOf(color.getId()) + color.getId2()+
                color.getId3() + color.getId4() + color.getId5();
        System.out.println(colorRightAnswer);

        return "redirect:/title";
    }
}
