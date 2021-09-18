/*
 *  UCF COP3330 Fall 2021 Assignment 10 Solution
 *  Copyright 2021 Srignan Paruchuru
 */

package Exercise10;

/*
User prompted inputs for three items quantity and price
Use string format again to make the output stop at 2 decimal places
Calculate outputs using multiplication and addition
 */
import java.util.Scanner;
public class Solution10 {
    public static void main(String[] args) {
        double[] price = new double[3];
        double[] quantity = new double[3];
        double subtotal = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            System.out.printf("Enter the price of item %d: ", (i+1));
            price[i] = sc.nextInt();
            System.out.printf("Enter the quantity of items %d: ", (i+1));
            quantity[i] = sc.nextInt();
            }

        for(int i = 0; i < 3; i++){
            subtotal += price[i] * quantity[i];
            }
        System.out.println("Subtotal: $" + String.format("%.2f",subtotal));
        System.out.println("Tax: $" + String.format("%.2f",subtotal * 0.055));
        System.out.println("Total: $" + String.format("%.2f",subtotal + subtotal * 0.055));
        }
}
