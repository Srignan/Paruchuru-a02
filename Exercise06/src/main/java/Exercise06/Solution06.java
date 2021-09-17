/*
 *  UCF COP3330 Fall 2021 Assignment 6 Solution
 *  Copyright 2021 Srignan Paruchuru
 */

package Exercise06;

import java.util.Scanner;
import java.util.Calendar;

/*
Import util Scanner to collect input and util Calendar for time
Use subtraction to figure how many years until retire and addition to figure out what year to retire
 */

public class Solution06 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int current_year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.print("What is your current age? ");
        int current_age = in.nextInt();

        System.out.print("At what age would you like to retire? ");
        int retirement_age = in.nextInt();

        int years_left = retirement_age - current_age;
        System.out.println("You have " + years_left + " years left until you can retire.");

        int retirement_year = current_year + years_left;
        System.out.println("It's " + current_year +", so you can retire in " + retirement_year + ".");

    }

}
