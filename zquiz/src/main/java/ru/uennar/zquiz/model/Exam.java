package ru.uennar.zquiz.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Exam {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String text, explain, answers, right_answer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public String getAnswers() {
        return answers;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }

    public String getRight_answer() {
        return right_answer;
    }

    public void setRight_answer(String right_answer) {
        this.right_answer = right_answer;
    }
}
