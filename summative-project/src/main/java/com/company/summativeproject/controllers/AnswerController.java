package com.company.summativeproject.controllers;

import com.company.summativeproject.models.Answer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class AnswerController {

    public AnswerController() { }

    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Answer askQuestionGetAnswer(@RequestBody Answer question) {
        question.getAnswer();

        return question;
    }

}
