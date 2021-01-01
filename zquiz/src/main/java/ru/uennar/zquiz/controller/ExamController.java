package ru.uennar.zquiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.uennar.zquiz.model.Exam;
import ru.uennar.zquiz.repo.ExamRepository;

@Controller
public class ExamController {

    @Autowired
    ExamRepository examRepository;

    @GetMapping("/exam")
    public String blog(Model model){
        Iterable<Exam> exams = examRepository.findAll();
        model.addAttribute("exams", exams);
        return "exam";
    }
}
