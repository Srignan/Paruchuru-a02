/*
 *  UCF COP3330 Fall 2021 Assignment 21 Solution
 *  Copyright 2021 Srignan Paruchuru
 */

package Exercise21;

import java.util.Scanner;

/*
Switch statements for each month, convert int to month
 */
public class Solution21 {

    public static String getMonth(int month){
        return switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "error";
        };
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number of month: ");
        int month = input.nextInt();

        if(month >= 1 && month <= 12){
            System.out.println("The name of month is "+getMonth(month));
        } else {
            System.out.println(getMonth(month)+": Invalid month");
        }
    }
}
