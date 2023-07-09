package com.company.summativeproject.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(QuoteController.class)
class QuoteControllerTest {
    private MockMvc mockMvc;

    @BeforeEach
    public void setup() {
        QuoteController myController = new QuoteController();
        this.mockMvc = MockMvcBuilders.standaloneSetup(myController).build();
    }

    @Test
    void getARandomQuote() throws Exception {
        mockMvc.perform(get("/quote")
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk());
                // TODO: quotes not null?
    }
}