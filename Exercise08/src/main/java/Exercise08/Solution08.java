/*
 *  UCF COP3330 Fall 2021 Assignment 7 Solution
 *  Copyright 2021 Srignan Paruchuru
 */

package Exercise08;

import java.util.Scanner;

public class Solution08 {
        public static void main(String[] args) {
            int People, Pizzas, Slices, Total, Portion, Leftovers;
            Scanner sc = new Scanner(System.in);
            System.out.print("How many people? ");
            People = sc.nextInt();
            System.out.print("How many pizzas do you have? ");
            Pizzas = sc.nextInt();
            System.out.print("How many slices of pizza? ");
            Slices = sc.nextInt();
            Total = Pizzas * Slices;
            System.out.println(+People+" people with "+Pizzas+" pizzas ("+Total+" slices)");
            Portion = Total / People;
            System.out.println("Each person gets "+Portion+" pieces of pizza.");
            Leftovers = Total % People;
            System.out.println("There are "+Leftovers+" leftover pieces.");
        }
    }
