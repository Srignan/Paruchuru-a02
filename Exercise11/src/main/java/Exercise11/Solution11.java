/*
 *  UCF COP3330 Fall 2021 Assignment 11 Solution
 *  Copyright 2021 Srignan Paruchuru
 */

package Exercise11;

/*
User prompted inputs for three items quantity and price
Use string format again to make the output stop at 2 decimal places
Calculate outputs using multiplication and addition
 */
import java.util.Scanner;

   class CurrencyExchange
    {
        double currency;
        double rate;
        public void read()
        {
            Scanner sc = new Scanner(System.in);
            this.currency = sc.nextDouble();
            this.rate = sc.nextDouble();
        }
        public void print()
        {
            double currencyConverted = currency*rate;
            System.out.printf("How many euros are you exchanging? \r\n" +
                    "What is the exchange rate? \r\n"
                    +currency+ " euros at an exchange rate of "+rate+" is \r\n " +
                    "%.2f U.S dollars.",currencyConverted);
        }
    }
public class Solution11 {
        public static void main(String[] args)
        {
            CurrencyExchange ca = new CurrencyExchange();
            ca.read();
            ca.print();
        }
}
