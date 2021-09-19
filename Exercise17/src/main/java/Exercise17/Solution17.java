/*
 *  UCF COP3330 Fall 2021 Assignment 17 Solution
 *  Copyright 2021 Srignan Paruchuru
 */

package Exercise17;

/*
Use math ceil again to round up to the nearest cent
Use if statement involving WI to make it add tax if WI is inputted for state
 */


import java.util.Scanner;

public class Solution17 {
    public static void main(String[] args)
    {
        Scanner Input=new Scanner(System.in);

        int A,gender,W,H;
        double BAC,r;
        System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
        gender = Input.nextInt();
        if(gender==1)
            r = 0.73;
        else
            r = 0.66;
        System.out.print("How many ounces of alcohol did you have? ");
        A = Input.nextInt();
        System.out.print("What is your weight, in pounds? ");
        W = Input.nextInt();
        System.out.print("How many hours has it been since your last drink? ");
        H = Input.nextInt();

        BAC = (A * 5.14 / W * r) - 0.015 * H;

        System.out.printf("Your BAC is %.6f. \n", BAC);
        System.out.println(BAC<=0.08 ? "It is legal for you to drive.":"It is not legal for you to drive.");
    }
}