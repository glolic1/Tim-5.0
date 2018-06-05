/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.tvz.pp.examinator;

import java.util.Scanner;

/**
 *
 * @author Jonatan
 */
public class Examinator {
    public static void main(String[] args) {
        int noQuestions;
        Scanner unos = new Scanner(System.in);
        
        System.out.println("Test quiz, command line only\n"); //Should be changed to graphic UI
        
        Quiz testQuiz = new Quiz(5);
        
        testQuiz.start();
        
//        System.out.println("Enter the number of questions:");
//        noQuestions = unos.nextInt(); //Shouldn't use scanner & check input
//        
//        Quiz testQuiz = new Quiz(noQuestions); 
    }
}
