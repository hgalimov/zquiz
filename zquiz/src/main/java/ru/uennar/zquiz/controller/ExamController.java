package ru.uennar.zquiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.uennar.zquiz.model.Exam;
import ru.uennar.zquiz.repo.ExamRepository;

@Controller
public class ExamController {

    @Autowired
    ExamRepository examRepository;

    @GetMapping("/exam")
    public String exam(Model model){
        Iterable<Exam> exams = examRepository.findAll();
        model.addAttribute("exams", exams);
        return "exam";
    }

    @GetMapping("/exam/add")
    public String examAdd(Model model){
        return "exam_add";
    }

    @PostMapping("/exam/add")
    public String examPostAdd(@RequestParam String text, @RequestParam String answers,
                              @RequestParam String right_answer, @RequestParam String explain,
                              Model model){
        Exam exam = new Exam(text, answers, right_answer, explain);
        examRepository.save(exam);
        return "redirect:/exam";
    }
}
