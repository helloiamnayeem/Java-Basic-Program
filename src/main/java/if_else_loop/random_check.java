/* Write a program to generate 2 random numbers which will not be shown to the user.
Take a user input and match it with any of the random numbers. If correct give it 1 point and if incorrect,
do not give it any point. Finally, repeat this for 10 times and count the point user achieved.*/

package if_else_loop;

import java.util.Random;
import java.util.Scanner;

public class random_check {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Random random = new Random();
        
        int random_number1,random_number2,number;
        int count=0;
        
        int i=0;
        while(i<10)
        {
            random_number1= random.nextInt(10);  // 0 to 10
            random_number2= random.nextInt(10);
            System.out.println();
            System.out.println("Enter a number between 0 to 10");
            number= sc.nextInt();
            System.out.println("random 1st number: "+random_number1+"\t random 2nd number: "+random_number2);
            if(number == random_number1 || number == random_number2)
            {
                System.out.println("You have got 1 point");
                count++;
            }else
                System.out.println("No point");
            
        i++;
        }
        
        System.out.println("\nYou finally got "+count+" points");
        
    }
    
}
