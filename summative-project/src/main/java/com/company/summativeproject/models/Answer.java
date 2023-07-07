package com.company.summativeproject.models;

import java.util.ArrayList;
import java.util.List;

public class Answer {
    private static int id;
    private String question;
    private String answer;


    public Answer() {
        answer = "";
        id++;
    }

    public int getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        if (answer.equals("")) {
            List<String> possibleAnswers = new ArrayList<>();
            String textOne = "Without a doubt";
            String textTwo = "It is certain";
            String textThree = "It is decidedly so";
            String textFour = "Yes definitely";
            String textFive = "My sources say no";
            String textSix = "Ask again later";
            String textSeven = "Concentrate and ask again";
            String textEight = "Better not tell you now";

            possibleAnswers.add(textOne);
            possibleAnswers.add(textTwo);
            possibleAnswers.add(textThree);
            possibleAnswers.add(textFour);
            possibleAnswers.add(textFive);
            possibleAnswers.add(textSix);
            possibleAnswers.add(textSeven);
            possibleAnswers.add(textEight);

            int MIN = 1;
            int MAX = 8;
            int randomAnswer = (int) ( Math.random() * (MAX - MIN) + MIN );
            answer = possibleAnswers.get(randomAnswer);
        }

        return answer;
    }

    // Used for testing
    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
