package com.company.summativeproject.controller;

import com.company.summativeproject.model.Answer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AnswerController {
    List<String> possibleAnswers;

    public AnswerController() {
        possibleAnswers = new ArrayList<>();

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
    }

    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Answer askQuestionGetAnswer(@RequestBody Answer question) {
        int MIN = 1;
        int MAX = 8;
        int randomAnswer = (int) ( Math.random() * (MAX - MIN) + MIN );
        question.setAnswer(possibleAnswers.get(randomAnswer));

        return question;
    }

}
