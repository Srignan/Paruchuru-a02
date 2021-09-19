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
public class Solution11 {


    public static void main(String[] args) {

        //create an object of class CurrencyExchange

        CurrencyExchange ca = new CurrencyExchange();

        // call method ReadandPrint

        ca.ReadandPrint();
    }

}

//////////////////////////////////////////////////////////

//class named CurrencyExchange

class CurrencyExchange
{
    // instance variables

    double currency;
    double rate;

// method ReadandPrint

    public void ReadandPrint()
    {
        // create object ofScanner class

        Scanner sc = new Scanner(System.in);

        // prompt input and print in same statement

        System.out.println();

        this.currency = Double.parseDouble(sc.next());

        System.out.print(" euros at an exchange rate of ");

        this.rate = Double.parseDouble(sc.next());

        System.out.print(" is ");

        System.out.print(currency * rate);

        System.out.println(" US dollars.");

        sc.close();
    }
}