/*
 *  UCF COP3330 Fall 2021 Assignment 22 Solution
 *  Copyright 2021 Srignan Paruchuru
 */

package Exercise22;

import java.util.Scanner;

/*
Scan for three different numbers from user
If statements for num1 is larger than 2 and 3, and for if 2 is larger than 3
Return if all numbers are equal
 */

public class Solution22 {
    public static void main(String[] args)
    {
        int Num1, Num2, Num3;
        Scanner Input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        Num1 = Input.nextInt();

        System.out.print("Enter the second number: ");
        Num2 = Input.nextInt();

        System.out.print("Enter the third number: ");
        Num3 = Input.nextInt();

        if(Num1==Num2 && Num1 == Num3){
            System.exit(0);
        }

        else if(Num1 >= Num2 && Num1 >= Num3)
        {
            System.out.println("Largest number is: "+Num1);
        }

        else if(Num2 > Num3)
        {
            System.out.println("Largest number is: "+Num2);
        }

        else
        {
            System.out.println("Largest number is: "+Num3);
        }
    }
}