package com.company.summativeproject.controller;

import com.company.summativeproject.model.Answer;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
public class AnswerControllerTests {

    private ObjectMapper mapper = new ObjectMapper();

    private List<Answer> answers;

    private MockMvc mockMvc;

    @BeforeEach
    public void setup() {
        AnswerController myController = new AnswerController();
        this.mockMvc = MockMvcBuilders.standaloneSetup(myController).build();
    }

    @Test
    public void shouldReturnQuestionAnswerOnPost() throws Exception {
        String questionAsked = "Test input question?";
        String textFive = "My sources say no";

        Answer decline = new Answer();
        decline.setQuestion(questionAsked);
        decline.setAnswer(textFive);

        String inputJson = mapper.writeValueAsString(decline);

        mockMvc.perform(
                post( "/magic")
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON)
        )
                .andDo(print())
                .andExpect(status().isCreated());
    }

    @Test
    public void shouldReturnDifferentAnswerEachRun() throws Exception {
        String question = "Is it random every time?";

        Answer reply = new Answer();
        reply.setQuestion(question);

        String turnToJson = mapper.writeValueAsString(reply);

        mockMvc.perform(
                post("/magic")
                        .content(turnToJson)
                        .contentType(MediaType.APPLICATION_JSON)
        )
                .andDo(print())
                .andExpect(status().isCreated());
    }
}
