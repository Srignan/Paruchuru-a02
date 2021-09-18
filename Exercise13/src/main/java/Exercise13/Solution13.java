/*
 *  UCF COP3330 Fall 2021 Assignment 13 Solution
 *  Copyright 2021 Srignan Paruchuru
 */

package Exercise13;

/*
Scan all user inputs
Import math lang so that I can use math pow for exponents
Add formula of compound interest and use math ceil to round up
 */
import java.util.Scanner;
import java.lang.Math;

public class Solution13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the principal amount? ");
        int Principal = input.nextInt();

        System.out.print("What is the rate? ");
        double Rate = input.nextDouble();

        System.out.print("What is the number of years? ");
        int Year = input.nextInt();

        System.out.print("What is the number of times the interest is compounded per year? ");
        int n = input.nextInt();

        double Final = Principal*Math.pow(1+((Rate/100)/n), n * Year);
        double TrueFinal = Math.ceil(Final*100.00)/100.00;


        System.out.printf("$%d invested at %.1f%% for %d years compounded %d times per year is $%.2f.\n",
                Principal, Rate, Year, n, TrueFinal);
    }
}