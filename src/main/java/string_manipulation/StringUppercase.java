/*8. Write a program to convert each 1st char to uppercase from a string
        Input: rahim lives in sylhet
        Output: Rahim Lives in Sylhet*/

package string_manipulation;

import java.util.Scanner;

public class StringUppercase {
    public static void main(String[] args) {


        String UpperCaseLetter = "";

        System.out.println("Enter your Sentence: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        Scanner lineScan = new Scanner(str);

        while (lineScan.hasNext()) {
            String word = lineScan.next();
            UpperCaseLetter += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        System.out.println(UpperCaseLetter);


    }
}
