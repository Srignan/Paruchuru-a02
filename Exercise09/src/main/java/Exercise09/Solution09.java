/*
 *  UCF COP3330 Fall 2021 Assignment 9 Solution
 *  Copyright 2021 Srignan Paruchuru
 */

package Exercise09;

import java.util.Scanner;

public class Solution09 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in); //scanner object
            double sqFeetPerGallon = 350;
            System.out.print("Enter length: ");
            double length = sc.nextDouble(); //take length from user
            System.out.print("Enter width: ");
            double width = sc.nextDouble(); //take width from user
            double totalSq = length*width; //calculate total square
            int gallon = (int)Math.ceil(totalSq/sqFeetPerGallon); //calculate number of gallon
            System.out.println("You will need to purchase "+gallon+" of paint to cover "+totalSq+" square feet");
        }
}

