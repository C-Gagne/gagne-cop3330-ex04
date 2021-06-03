/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex4;

public class Sentence {
    public String genSentence(String verb, String adjective, String noun, String adverb)
    {
        return String.format("Do you %s your %s %s %s? That's silly.", verb, adjective, noun, adverb);
    }
}
