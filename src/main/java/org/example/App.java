/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tim Phung
 */
package org.example;
import java.util.Scanner;
import java.text.DecimalFormat;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.#");
        double weight, height, bmi;

        //input
        System.out.println( "What is your weight in pounds?" );
        while( !scan.hasNextDouble() ){
            System.out.println("Only enter numeric data:");
            scan.next();
        }
        weight = scan.nextDouble();

        System.out.println( "What is your height in inches?" );
        while( !scan.hasNextDouble() ){
            System.out.println("Only enter numeric data:");
            scan.next();
        }
        height = scan.nextDouble();

        //processing
        bmi = (weight / (height * height)) * 703;
        System.out.println("Your BMI is " +df.format(bmi)+ ".");

        //output
        if( bmi >= 18.5 && bmi <= 25)
            System.out.println("You are within the ideal weight range.");

        else if( bmi < 18.5)
            System.out.println("You are underweight. You should see your doctor.");

        else if( bmi > 25)
            System.out.println("You are overweight. You should see your doctor.");

    }
}
