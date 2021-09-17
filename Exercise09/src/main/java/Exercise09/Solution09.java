/*
 *  UCF COP3330 Fall 2021 Assignment 9 Solution
 *  Copyright 2021 Srignan Paruchuru
 */

/*
User prompted inputs for length and width
Use math ceil function to make sure output rounds up
calculate total square area
 */
package Exercise09;

import java.util.Scanner;

public class Solution09 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            final double gallonArea = 350.0;
            System.out.print("Enter length: ");
            int length = sc.nextInt();
            System.out.print("Enter width: ");
            int width = sc.nextInt();
            int totalArea = length * width;
            System.out.println("You will need to purchase "+((int) Math.ceil(totalArea / gallonArea))+" gallons of paint to cover "+totalArea+" square feet");
        }
}

