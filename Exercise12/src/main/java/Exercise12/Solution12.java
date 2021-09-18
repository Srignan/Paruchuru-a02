/*
 *  UCF COP3330 Fall 2021 Assignment 12 Solution
 *  Copyright 2021 Srignan Paruchuru
 */

package Exercise12;

/*
User prompted inputs for three items quantity and price
Use string format again to make the output stop at 2 decimal places
Calculate outputs using multiplication and addition
 */

import java.util.Scanner;
import java.math.BigDecimal;

public class Solution12 {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the principal: ");
            double Principal = in.nextDouble();

            System.out.print("Enter the rate of interest: ");
            double Rate = in.nextDouble();

            System.out.print("Enter the number of years: ");
            double Time = in.nextDouble();

            double Investment = Principal*(1 +(Rate*Time)/100);

            int Years=(int)Time;

            BigDecimal InvestmentDecimal = new BigDecimal(Investment);

            System.out.printf("After %d years at %.2f%% , the investment will be worth $%.2f.\n",
                    Years, Rate, InvestmentDecimal);
        }
}
