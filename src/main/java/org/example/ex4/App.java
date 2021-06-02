package org.example.ex4;

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        Noun finalNoun = new Noun();
        Verb finalVerb = new Verb();
        Adjective finalAdjective = new Adjective();
        Adverb finalAdverb = new Adverb();


        System.out.println("Please enter a noun:");
        String noun = finalNoun.getNoun();

        System.out.println("Please enter a verb:");
        String verb = finalVerb.getVerb();

        System.out.println("Please enter an adjective:");
        String adjective = finalAdjective.getAdjective();

        System.out.println("Please enter an adverb:");
        String adverb = finalAdverb.getAdverb();

        Sentence createSentence = new Sentence();
        String finalString = createSentence.genSentence(verb, adjective, noun, adverb);
        System.out.println(finalString);
    }
}