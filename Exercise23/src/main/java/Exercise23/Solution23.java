/*
 *  UCF COP3330 Fall 2021 Assignment 23 Solution
 *  Copyright 2021 Srignan Paruchuru
 */

package Exercise23;

import java.util.Scanner;

/*
If and if else statements for every yes or no
Print appropriate print statements for each yes or no
 */

public class Solution23 {

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        char YorN;

        System.out.print("Is the car silent when you turn the key? ");

        YorN = Input.next().charAt(0);

        if (YorN == 'y') {

            System.out.print("Are the battery terminals corroded? ");

            YorN = Input.next().charAt(0);

            if (YorN == 'y')
                System.out.println("Clean the terminals and try starting again.");

            else if (YorN == 'n')
                System.out.println("Replace cables and try again.");
        }
        else if (YorN == 'n'){

            System.out.print("Does the car make a slicking noise? ");

            YorN = Input.next().charAt(0);

            if (YorN == 'y')

                System.out.println("Replace the battery.");

            else if (YorN == 'n'){

                System.out.print("Does the car crank up but fail to start? ");

                YorN = Input.next().charAt(0);

                if (YorN == 'y')

                    System.out.println("Check spark plug connection.");

                else if (YorN == 'n'){

                    System.out.print("Does the engine start and then die? ");

                    YorN = Input.next().charAt(0);

                    if (YorN == 'y') {

                        System.out.println("Does your car have fuel injection? ");

                        YorN = Input.next().charAt(0);

                        if (YorN == 'y')

                            System.out.println("Get it in for service.");

                        else if (YorN == 'n')

                            System.out.println("Check to ensure the choke is opening and closing.");

                    } else if (YorN == 'n'){

                        System.out.println("This should not be possible.");

                    }

                }

            }

        }
    }

}