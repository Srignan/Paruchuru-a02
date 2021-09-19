/*
 *  UCF COP3330 Fall 2021 Assignment 19 Solution
 *  Copyright 2021 Srignan Paruchuru
 */

package Exercise19;

/*
Use scanner.nextDouble for input so that it only reads numbers
Plug in formula of BMI onto program and have if else statements to have the different outputs
 */

import java.util.Scanner;

public class Solution19 {
    public static void main (String[] args){

        Scanner Input = new Scanner(System.in);

        System.out.println("Enter the height in inches ");
        double Height = Input.nextDouble();
        System.out.println("Enter the weight in pounds ");
        double Weight = Input.nextDouble();

        double BMI = (Weight / (Height * Height)) * 703;

        System.out.println("Your BMI is " + String.format("%.2f",BMI));


        if(BMI >= 18.5 && BMI <= 25){
            System.out.println("You are within the ideal weight range.");
        }
        else if(BMI < 18.5){
            System.out.println("You are underweight, You should see your doctor.");
        }
        else if(BMI > 25){
            System.out.println("You are overweight, You should see your doctor.");
        }
    }
}