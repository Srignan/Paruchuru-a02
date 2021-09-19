/*
 *  UCF COP3330 Fall 2021 Assignment 16 Solution
 *  Copyright 2021 Srignan Paruchuru
 */

package Exercise16;

/*
Use ternary operator for print statements; if age >=16, true = old enough to drive, false = not old enough
Scan user input for age
 */

import java.util.Scanner;

public class Solution16 {
        public static void main(String[] args) {
        int age;
        Scanner Input = new Scanner(System.in);
        System.out.print("What is your age? ");
        age = Input.nextInt();
        System.out.println(age >= 16 ? "You are old enough to legally drive.":"You are not old enough to legally drive.");
    }
    }