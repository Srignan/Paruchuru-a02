/*
 *  UCF COP3330 Fall 2021 Assignment 7 Solution
 *  Copyright 2021 Srignan Paruchuru
 */

package Exercise07;

import java.util.Scanner;

/*
State ints and double, copy print statements, import scanner for user input
Just convert area to square area rather than converting every single variable because I lazy
 */

public class Solution07 {
    public static void main(String[] args) {
        int length, width, area;
        double sqArea;

        Scanner sc = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        length = sc.nextInt();

        System.out.print("What is the width of the room in feet? ");
        width = sc.nextInt();

        area = length * width;

        System.out.println("You entered dimension of " + length + " feet by " + width + " feet.");

        System.out.println("The area is \n" + area + " square feet");

        sqArea = area / 10.764; //Google said that the formula for square foot to square meter is to divide by 10.764

        System.out.println(String.format("%.3f", sqArea)+" square meters ");
    }
}
