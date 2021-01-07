package ru.uennar.zquiz.model;

public class CheckExam {
    private String rightAns;
    private String curAns;

    public String getRightAns() {
        return rightAns;
    }

    public void setRightAns(String rightAns) {
        this.rightAns = rightAns;
    }

    public String getCurAns() {
        return curAns;
    }

    public void setCurAns(String curAns) {
        this.curAns = curAns;
    }

    public CheckExam() {
    }

    public CheckExam(String rightAns, String curAns) {
        this.rightAns = rightAns;
        this.curAns = curAns;
    }
}
