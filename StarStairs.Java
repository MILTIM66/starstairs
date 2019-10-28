/*
Name: StarStairs
Purpose: create a stair case out of stars from and inputed number
Date: 2019-28-10
Author: Tanner Kennedy
*/

import java.io.*;


public class StarStairs
{

    public static void printStars(int number) 
    { 

    int row;
    int col;

    for (row = 0 ; row < number ; row++)
    {

        for (col = 0 ; col <= row ; col++)
        {
            //printing stars
            System.out.print ("*");
        }

        // ending line after each row
        System.out.println ();
        }
    }

public static void main (String[] args) throws IOException
    {
        BufferedReader keyboardInput = new BufferedReader (new InputStreamReader (System.in));
        ;
        System.err.print ("How many steps? ");
        int number = Integer.parseInt (keyboardInput.readLine ());

        printStars (number);
    }
}
