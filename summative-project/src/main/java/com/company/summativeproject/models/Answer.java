package com.company.summativeproject.models;

public class Answer {
    private static int id;
    private String question;
    private String answer;


    public Answer() { id++; }

    public int getId() { return id; }

    public String getQuestion() { return question; }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() { return answer; }

    public void setAnswer(String answer) { this.answer = answer; }
}
