package com.example.project_function_switch;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Scanner;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {}

    public static void main(String[] args) {
        //Reading Options: A, B, C
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any of these options: ('A', 'B', or 'C')");
        String OptionIs = scanner.nextLine();
        switch (OptionIs){
            case "A":
                printAnyString("Now you are in the sum program, if it is necessary type two numbers");
                printAnyString("Type in the first number");
                int numberOne = scanner.nextInt();
                printAnyString("Type in the second number");
                int numberTwo = scanner.nextInt();
                printAnyString("The sum result is" + twoNumbersSum(numberOne, numberTwo));
                break;
            case "B":
                printAnyString("Type a message you want to print");
                String stringValue = scanner.nextLine();
                break;
            case "C":
                cosOfEnteredValue();
                break;
            default:
                errorPrint();
        }
    }

    public static void printAnyString(String message){
        System.out.println(message);
    }

    public static int twoNumbersSum(int numberOne, int numberTwo){
      int SumResult= numberOne + numberTwo;
      return SumResult;
    }

    public static Void readAndPrint (){
        
    }

    public static void cosOfEnteredValue(){

    }

    public static void  errorPrint(){

    }
}
