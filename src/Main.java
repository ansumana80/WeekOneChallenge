//Ansu J Rogers//
// Java Web Development Bootcamp//
// June 14, 2019//
//Good luck to me!

/*Week One Challenge: write an application that will show a list of numbers and indicate
whether or they they are prime numbers. Prime numbers are numbers only divisible by they selves with
no reminder*/

import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int number = 0;                             //declare variable and initialize
        int i = 2;                                  //declare variable and initialize
        String yes;                                 //declare a string
        boolean Prime=true;                         /* boolean variable can only store one of two values: true or false.
                                                    It cannot hold words or numbers. */

        Scanner keyboard = new Scanner(System.in);  // Make a Scanner class called keyboard

        System.out.println("User Enter Any Number:");


        number=keyboard.nextInt();                  //Accept the input as an integer
        keyboard.close();

        {

            while(i<= number/2)
            {
                if(number % i == 0)
                {
                    Prime = false;
                    break;
                }
                i++;
            }   }

        if(Prime)
            System.out.println(number + " is a Prime Number");
        else
            System.out.println(number + " is not a Prime Number");




    }

}