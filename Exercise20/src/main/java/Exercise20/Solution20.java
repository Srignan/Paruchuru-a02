/*
 *  UCF COP3330 Fall 2021 Assignment 20 Solution
 *  Copyright 2021 Srignan Paruchuru
 */

package Exercise20;

/*
Import Scanner
Assign Variables for the Total amount, tax, and starting amount
Use else statements for each different case that is needed
 */

import java.util.Scanner;

public class Solution20{
        public static void main(String[] args) {
    Scanner Input = new Scanner(System.in);
    int Amount;
    double Total, Tax;

    System.out.print("What is order amount? ");
    Amount = Input.nextInt();

    System.out.print("What state do you live in? ");
    String state = Input.next();

            Input.nextLine(); //I genuinely don't understand how this fixes the issue.
            //I was having problems because it kept skipping the "what county" part.

    if(state.equals("Wisconsin")){
        System.out.print("What country do you live in? ");
        String county = Input.nextLine();

        if(county.equals("Eau Claire")){
            Tax = (Amount * .055);
        }
        else if(county.equals("Dunn")){
            Tax = (Amount * .054);
        }
        else{
            Tax = (Amount * .050);
        }
    }
    else if(state.equals("Illinois")){
        Tax = (Amount * 8) / 100.00;
    }
    else{
        Tax = 0.00;
    }
   Total = Math.ceil((Amount + Tax) * 100.00) / 100.00;
    System.out.printf("The tax is $%.2f.\nThe total is $%.2f.", Tax, Total);
}
}
