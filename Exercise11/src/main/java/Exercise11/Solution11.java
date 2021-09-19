/*
 *  UCF COP3330 Fall 2021 Assignment 11 Solution
 *  Copyright 2021 Srignan Paruchuru
 */

package Exercise11;

/*
User prompted scan for how many euros and exchange rate
Calculate output using Multiplication
Use math ceil to round up
 */
import java.util.Scanner;

public class Solution11 {

    public static void main(String[] args){

        int Euros;
        double Rate;

        Scanner Input = new Scanner(System.in);

        System.out.print("How many euros are you exchanging? ");
        Euros = Input.nextInt();

        System.out.print("What is the exchange rate? ");
        Rate = Input.nextDouble();

        System.out.println(Euros+" euros at an exchange rate of "+Rate+" is");

        double USD = Math.ceil((Euros * Rate)*100.00)/100.00;

        System.out.printf("%.2f U.S dollars.",USD);
    }
}

