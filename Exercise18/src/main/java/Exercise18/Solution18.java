/*
 *  UCF COP3330 Fall 2021 Assignment 18 Solution
 *  Copyright 2021 Srignan Paruchuru
 */

package Exercise18;

/*
Scan letter choice, give different output if user inputs something other than F or C.
Plug in formula for Fahrenheit to Celsius and vice versa in appropriate parts of the if else statement
Use .toUpperCase so that the program reads lower case
 */

import java.util.Scanner;

public class Solution18{
        public static void main(String[] args) {
            Scanner Input = new Scanner(System.in);
            System.out.println("Press C to convert from Fahrenheit to Celsius.");
            System.out.println("Press F to convert from Celsius to Fahrenheit.");
            System.out.print("Your choice: ");
            char Choice = Input.next().toUpperCase().charAt(0);
            int Temperature, Conversion;


            if (Choice == 'C') {
                System.out.print("Please enter the temperature in Fahrenheit: ");
                Temperature = Input.nextInt();
                Conversion = (Temperature - 32) * 5 / 9;
                System.out.print("The temperature in Celsius is " + Conversion + ".");
            } else if (Choice == 'F') {
                System.out.print("Please enter the temperature in Celsius: ");
                Temperature = Input.nextInt();
                Conversion = (Temperature * 9 / 5) + 32;
                System.out.print("The temperature in Fahrenheit is " + Conversion + ".");
            } else {
                System.out.println("Illegal Input");
            }
        }
}