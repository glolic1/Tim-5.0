/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.tvz.pp.examinator;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/**
 *
 * @author Jonatan
 */
public class Question {
    private String questionText;
    private TreeMap<Character, String> answerMap = new TreeMap<>();
    private Character correctAnswer;

    public String getQuestionText() {
        return questionText;
    }

    public TreeMap<Character, String> getAnswerMap() {
        return answerMap;
    }

    public Question(String questionText, Character correctAnswer, String... answers) {
        this.questionText = questionText;
        Character noAnswer = 'a';
        for(String answer : answers){
           answerMap.put(noAnswer, answer);
           noAnswer++; //a, b, c, d...
        }
        this.correctAnswer = correctAnswer;
    }
    
    public boolean checkCorrectAnswer(Character userAnswer){
        return Objects.equals(correctAnswer, userAnswer);
    }
    
    public void printQuestion(){
        System.out.println(questionText);
        answerMap.entrySet().forEach((answer) -> {
            System.out.println(answer.getKey() + ") " + answer.getValue());
        });
    }
}
