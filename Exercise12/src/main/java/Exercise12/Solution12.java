/*
 *  UCF COP3330 Fall 2021 Assignment 12 Solution
 *  Copyright 2021 Srignan Paruchuru
 */

package Exercise12;

/*
Use Scanner for user inputs
Calculate Investment with principal times 1+rate*time/100
Use math ceil to round up
 */

import java.util.Scanner;

public class Solution12 {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the principal: ");
            double Principal = in.nextDouble();

            System.out.print("Enter the rate of interest: ");
            double Rate = in.nextDouble();

            System.out.print("Enter the number of years: ");
            double Time = in.nextDouble();

            double Investment = Math.ceil((Principal*(1 +(Rate*Time)/100))*100.00)/100.00;

            int Years=(int)Time;

            System.out.printf("After %d years at %.2f%%, the investment will be worth $%.2f.\n",
                    Years, Rate, Investment);
        }
}
