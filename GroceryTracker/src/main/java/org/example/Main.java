package org.example;

import java.lang.runtime.SwitchBootstraps;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    private static String[] groceries = new String[300];

    public static void main(String[] args) {
        System.out.println("Hello world!");

        /*
        text based menu
            view recipe
                sout - recipies title
            add recipe
                name ,ingrients, instruction
                add to list
            delete recipe
                remove recipes




            recipes should have category's with enums
         */
    String[] groceries = new String[300];
    groceries[0]="pie";
    printMenu();

    Scanner scanner = new Scanner(System.in);
    if (scanner.nextInt() == 1){
        viewAll();
        /*
        System.out.println("would your like to 1)view all 2) by category");
         int userChoice = scanner.nextInt();
        switch (userChoice){
            case 1:
            for (String grocerie: groceries) {
            System.out.println(grocerie);
            }
            break;
            case 2:
            System.out.println("select your categoy");
            System.out.println("categorys");//print all categories
            String userValue = scanner.nextLine();

            for (String groceroe:groceries) {
                if(groceroe.contains(userValue)){
                    System.out.println("recipeName");
                    }
                }
            break;
            default:
                //default statement
                break;


        }*/
    } else if (scanner.nextInt() == 2) {
      addRecipe();
        /*
        System.out.println("please enter your recipe");
        scanner.nextLine();
        var food = scanner.nextLine();
        groceries[0] = food;
        System.out.printf("%S Has been added",food);
        scanner.nextLine();
        */
    } else if (scanner.nextInt() == 3) {
        /*
        System.out.println("food to delete");
        scanner.nextLine();
        String foodToDelete = scanner.nextLine();
        if (groceries[0] == foodToDelete){
            groceries[0] = null;
            */
         deleteRecipe();

    }else{
        System.out.println("sorry invalid Input");
    }


    }
    public static void printMenu(){
        System.out.println("""
                    Hello would you like to
                    1) view recipe
                    2)add recipe
                    3)delete recipe
                   """);
        Scanner scanner = new Scanner(System.in);
        if (scanner.nextInt() == 1) {
            viewAll();
        }
        switch (scanner.nextInt()){
            case 1:
                viewAll();
            case 2:
                addRecipe();
            case 3:
                deleteRecipe();
        }
    }
    public static void viewAll(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("would your like to 1)view all 2) by category");
        int userChoice = scanner.nextInt();
        switch (userChoice){
            case 1:
                for (String grocerie: groceries) {
                    System.out.println(grocerie);
                }
                break;
            case 2:
                System.out.println("select your categoy");
                System.out.println("categorys");//print all categories
                String userValue = scanner.nextLine();

                for (String groceroe:groceries) {
                    if(groceroe.contains(userValue)){
                        System.out.println("recipeName");
                    }
                }
                break;
            default:
                //default statement
                break;
        }
    }

    public static void addRecipe(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your recipe");
        scanner.nextLine();
        var food = scanner.nextLine();
        groceries[0] = food;
        System.out.printf("%S Has been added",food);
        scanner.nextLine();
    }
    public static void deleteRecipe(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("food to delete");
        scanner.nextLine();
        String foodToDelete = scanner.nextLine();
        if (groceries[0] == foodToDelete){
            groceries[0] = null;
        }
    }





}