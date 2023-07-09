package com.company.summativeproject.controller;

import com.company.summativeproject.model.Quote;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class QuoteController {
    private List<Quote> quoteList;

    // 1. Data source as a database
    public QuoteController() {
        // 1. List of strings of quotes
        List<String> quotes = new ArrayList<>();
        quotes.add("I'm not here to be perfect, I'm here to be real.");
        quotes.add("I'm not interested in money. I just want to be wonderful.");
        quotes.add("The only thing that feels better than winning is winning when nobody thought you could.");
        quotes.add("Success is not final, failure is not fatal: It is the courage to continue that counts.");
        quotes.add("If you can dream it, you can do it.");
        quotes.add("If you want something done, ask a busy person to do it.");
        quotes.add("If your actions inspire others to dream more, learn more, do more and become more, you are a leader.");
        quotes.add("The best way to find out if you can trust somebody is to trust them.");
        quotes.add("The only Limit to our realization of tomorrow will be our doubts of today.");
        quotes.add("We may encounter many defeats but we must not be defeated.");

        // 2. List of strings of authors
        List<String> authors = new ArrayList<>();
        authors.add("Lady Gaga");
        authors.add("Marilyn Monroe");
        authors.add("Hank Aaron");
        authors.add("Winston Churchill");
        authors.add("Walt Disney");
        authors.add("Laura Ingalls Wilder");
        authors.add("John Quincy Adams");
        authors.add("Ernest Hemingway");
        authors.add("Franklin D. Roosevelt");
        authors.add("Maya Angelou");

        // 3. Constructions of quoteList
        quoteList = new ArrayList<>();
        for (int id = 0; id < quotes.size(); id++) {
            quoteList.add(new Quote(id, quotes.get(id), authors.get(id)));
        }
    }

    // 2. RESTful API
    // (1) Get a quote
    @GetMapping("/quote")
    public ResponseEntity<Quote> getARandomQuote() {
        // 1. Generate a random id
        Random rand = new Random();
        int randomID = rand.nextInt(quoteList.size());

        // 2. Get a random Quote
        Quote quote = quoteList.get(randomID);

        return ResponseEntity.ok(quote);
    }
}
