package org.example;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Map;
import java.util.Scanner;

public class Screens {
    private static Scanner scanner = new Scanner(System.in);

    public static void intialize(){
        System.out.println("Hello Welcome to The QuizBowl");
        /*try {
            Thread.sleep(1000);
        }catch (IllegalArgumentException e){

        }catch (InterruptedException e){

        }*/
       main();
    }

    public static void main(){
        System.out.printf("""
            Would You Like To
            1)Be Quized
            2)Make A New Quiz
            3)Update A Quiz
            4)Delete A Quiz
            5)Quit
        """);
        boolean loop;
        do {
            System.out.println("Choose A Option :");
            String inputInt = scanner.nextLine();
            loop = false;
            try {
                int option = Integer.parseInt(inputInt);
                switch (option){
                    case 1:
                        quizstart();
                        break;
                    case 2:
                        quizMake();
                        main();
                        break;
                    case 3:
                        quizUpdate();
                        break;
                    case 4:
                        quizDelete();
                        break;
                    case 5:
                        quit();
                    default:
                        System.out.println("That's Not A Valid Option Try Again");
                        loop = true;
                }
            } catch (Exception e) {

            }
        }while(loop);
    }

    public static void quizstart(){

    }

    public static void quizMake(){
        System.out.println("What Would You Like To Name Your Quiz :");
        String inputPath = scanner.nextLine();
        String filePath = "src/main/resources/"+inputPath+".txt";
        try {
            FileWriter writer = new FileWriter(filePath,true);
            BufferedWriter printer = new BufferedWriter(writer);
            printer.newLine();
            //printer.write("test this is a test ");
            //printer.close();
            Quiz quiz = new Quiz(inputPath);
            for(Map.Entry<String,String> s : quiz.getQuiz().entrySet()){
                printer.write(s.getKey()+"|"+s.getValue());
                printer.newLine();
            }
            printer.close();
        }catch (IOException e) {
            System.out.println("Sorry Something Went Wrong. We Don't Know When, Or Where, But Somethings Wrong! ");
            main();
        }



        //quiz.saveQuiz(inputPath,quiz);
        //System.out.println("sorry this feature is under maintance");
    }
    public static void quizUpdate(){
        System.out.println("Sorry This Feature Is Under Maintance");
    }
    public static void quizDelete(){
        System.out.println("Sorry This Feature Is Under Maintance");
    }
    public static void quit(){
        System.exit(0);
    }

}
