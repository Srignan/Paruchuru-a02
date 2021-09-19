/*
 *  UCF COP3330 Fall 2021 Assignment 15 Solution
 *  Copyright 2021 Srignan Paruchuru
 */

package Exercise15;

import java.util.Scanner;

/*
Create scanner inputs for username and password.
Use if else statement for different outputs for password
If known password is equal to inputted password is one output and the output is if it proves false
Does not use username in sample output which is odd.
 */

public class Solution15 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String knownPassword  = "abc$123";

        System.out.print("Enter your username. ");
        String Username = input.nextLine();

        System.out.print("What is the password? ");
        String Password = input.nextLine();

        if(knownPassword.equals(Password))
        {
            System.out.println("Welcome!");
        }
        else
        {
            System.out.println("I don't know you.");
        }
    }
}
