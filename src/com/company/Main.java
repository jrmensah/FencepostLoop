package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter the number");
        Scanner keyboard = new Scanner(System.in);
        int currentValue = 0;
        int counter = keyboard.nextInt();

        String var = "String Value";
        var = +counter+"";



        while (currentValue<counter){
            currentValue++;
            System.out.print(+currentValue+",");

        }

    }

}
