package ru.study.riddle.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.study.riddle.models.Color;
import ru.study.riddle.models.ColorRepository;
import ru.study.riddle.models.Nationality;
import ru.study.riddle.models.NationalityRepository;

@Controller
@RequestMapping("/title")
public class RiddleController {


    private String colorRightAnswer = "цвета не выбраны";
    private String nationalityRightAnswer = "национальности не выбраны";
    ColorRepository colorRepository = new ColorRepository();
    NationalityRepository nationalityRepository = new NationalityRepository();


    @GetMapping()
    public String riddlePage(Model model,
                             @ModelAttribute("color") Color color, @ModelAttribute("nationality")Nationality nationality){
        model.addAttribute("colors", colorRepository.getListOfColors());
        model.addAttribute("nationalities", nationalityRepository.getListOfNationality());
        if (colorRightAnswer.equals("14523") && nationalityRightAnswer.equals("32154")){
            model.addAttribute("message", "Вы разгадали загадку!");
        } else if (colorRightAnswer.equals("цвета не выбраны") && nationalityRightAnswer.equals("национальности не выбраны")){
            model.addAttribute("message", "Разгадай загадку!");
        } else {
            model.addAttribute("message", "Попробуйте еще");
        }

        return "title";
    }


    @PatchMapping("/add")
    public String check(@ModelAttribute("color") Color color, @ModelAttribute("nationality") Nationality nationality){


        colorRightAnswer = String.valueOf(color.getId()) + color.getId2()+
                color.getId3() + color.getId4() + color.getId5();

        nationalityRightAnswer = String.valueOf(nationality.getId()) + nationality.getId2()+
                nationality.getId3() + nationality.getId4() + nationality.getId5();

        System.out.println(colorRightAnswer);
        System.out.println(nationalityRightAnswer);

        return "redirect:/title";
    }
}
