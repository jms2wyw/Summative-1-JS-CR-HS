package com.company.summativeproject.controller;

import com.company.summativeproject.models.Definition;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@RestController
public class WordApiController {
    private List<Definition> wordList;

    Random rand = new Random();

    public WordApiController() {


        Definition audacity = new Definition();
        audacity.setWord("Audacity");
        audacity.setId(0);
        audacity.setDefinition("a willingness to take bold risks.");
        Definition gladiolus = new Definition();
        gladiolus.setWord("Gladiolus");
        gladiolus.setId(1);
        gladiolus.setDefinition("any of numerous plants of the genus Gladiolus native chiefly to tropical and South Africa having sword-shaped leaves and one-sided spikes of brightly colored funnel-shaped flowers; widely cultivated");
        Definition pelter = new Definition();
        pelter.setWord("Pelter");
        pelter.setId(2);
        pelter.setDefinition("a thrower of missiles");
        Definition lubberly = new Definition();
        lubberly.setWord("Lubberly");
        lubberly.setId(3);
        lubberly.setDefinition("clumsy and unskilled");
        Definition cordial = new Definition();
        cordial.setWord("Cordial");
        cordial.setId(4);
        cordial.setDefinition("politely warm and friendly");
        Definition utopian = new Definition();
        utopian.setWord("Utopian");
        utopian.setId(5);
        utopian.setDefinition("of or pertaining to or resembling a utopia");
        Definition obbligato = new Definition();
        obbligato.setWord("Obbligato");
        obbligato.setId(6);
        obbligato.setDefinition("a part of the score that must be performed without change or omission");
        Definition stevedore = new Definition();
        stevedore.setWord("Stevedore");
        stevedore.setId(7);
        stevedore.setDefinition("a laborer who loads and unloads vessels in a port");
        Definition effervescence = new Definition();
        effervescence.setWord("Effervescence");
        effervescence.setId(8);
        effervescence.setDefinition("the process of bubbling as gas escapes");
        Definition canoodle = new Definition();
        canoodle.setWord("Canoodle");
        canoodle.setId(9);
        canoodle.setDefinition("fondle or pet affectionately");

        wordList = Arrays.asList(audacity, gladiolus, pelter, lubberly, cordial, utopian, obbligato, stevedore, effervescence, canoodle);

    }

    @RequestMapping(value = "/word", method = RequestMethod.GET)
    public Definition getDefinition() {
        System.out.print(wordList.get(1).getWord());
        Definition wordPicked = new Definition();
        int rand1 = rand.nextInt(10);
        for (Definition word : wordList){
            if (word.getId() == rand1){
                wordPicked =  word;
            }
        }
        return wordPicked;
    }
}
