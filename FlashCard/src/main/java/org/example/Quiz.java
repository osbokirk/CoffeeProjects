package org.example;

import java.io.BufferedWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Quiz  {
    private String name;

    public Map<String, String> getQuiz() {
        return quiz;
    }

    public int[] getQuestions() {
        return questions;
    }

    public void setQuestions(int[] questions) {
        this.questions = questions;
    }

    final private Map<String,String> quiz;
    private int[] questions;

    public Quiz(Map<String, String> quiz) {
        this.quiz = quiz;

    }
    public Quiz (String name){
        this.name = name;
        this.quiz = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Lets Get Started");
        boolean loop = true;
        do {
            System.out.println("What is your question");
            String Question =  scanner.nextLine();
            System.out.println("What is the Answer");
            String Answer = scanner.nextLine();
            quiz.put(Question,Answer);
            System.out.println("Press Q If Your done if your done add questions");
            if (scanner.nextLine().equalsIgnoreCase("Q")){
                loop = false;
            }
        }while(loop);


        //BufferedWriter printer = new BufferedWriter();

        //Screens.main();
    }

    public void saveQuiz(String location,Quiz quiz){

    }

}
