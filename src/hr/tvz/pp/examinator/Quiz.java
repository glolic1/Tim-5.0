/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.tvz.pp.examinator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Jonatan
 */
public class Quiz {
    private int noQuestions;
    Set<Question> questionsSet = new HashSet<>();

    public Quiz(int noQuestions) {
        this.noQuestions = noQuestions;
    }
    
    public void start(){
        ArrayList<Character> answers = new ArrayList<>();
        int correctAnswers = 0, i = 0;
        
        //Hardwiring the questions since the database isn't connected to the program yet
        //Should draw questions from the database and fill up the set with them instead
        questionsSet.add(new Question("What is Java?", 'a', "A programming language", "A bad joke", "The reality", "Idk dude"));
        questionsSet.add(new Question("Are you good at programming?", 'b', "Yes. JK not really", "Hell no"));
        questionsSet.add(new Question("Are these questions witty?", 'a', "Not even close, son", "Maybe a lil' bit", "Hmm...I\'ll think about it"));
        questionsSet.add(new Question("Describe a dog.", 'a', "Four legged, tail-wagging, drooling creature", "This is just a bad description, don't click this", "Wrong answer as well"));
        questionsSet.add(new Question("Is 2=3?", 'b', "Yes", "No"));
        
        Scanner unos = new Scanner(System.in); //Don't use scanner
        
        for(Question curQuestion : questionsSet){
            curQuestion.printQuestion();
            System.out.print("Enter your answer: ");
            answers.add(unos.next().charAt(0));
        }
        
        for(Question curQuestion : questionsSet){
            if(curQuestion.checkCorrectAnswer(answers.get(i)))
                correctAnswers++;
            i++;
        }
        
        System.out.println("Vaš rezultat je: " + correctAnswers + "/" + questionsSet.size() + "\nHvala na sudjelovanju!");
    }
}
