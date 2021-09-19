/*
 *  UCF COP3330 Fall 2021 Assignment 14 Solution
 *  Copyright 2021 Srignan Paruchuru
 */

package Exercise14;

/*
Use math ceil again to round up to the nearest cent
Use if statement involving WI to make it add tax if WI is inputted for state
 */

import java.util.Scanner;

public class Solution14 {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        double Amount = Double.parseDouble(obj.nextLine());

        System.out.print("What is the state? ");
        String state = obj.nextLine();

        System.out.printf("The subtotal is $%.2f", Amount);

        if(state.equalsIgnoreCase("WI")) {

            double Tax = Amount * 0.055;
            double Final = Math.ceil((Amount + Tax) * 100.00) / 100.00;

            System.out.printf("\nThe tax is $%.2f\nThe total is $%.2f", Tax, Final);
        }
    }
}