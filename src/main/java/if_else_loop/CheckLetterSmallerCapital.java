/*1. Write a program to check if inputted letter is small or capital*/

package if_else_loop;

import java.util.Scanner;
public class CheckLetterSmallerCapital {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter a letter: ");
        char letter= sc.next().charAt(0);

        if(letter>='a' && letter<='z')
            System.out.println("You have entered a small letter");
        else if(letter >= 'A' && letter <= 'Z')
            System.out.println("You have entered a capital letter");
        else
            System.out.println("Invalid input");

        //  System.out.println(letter);

    }

}
