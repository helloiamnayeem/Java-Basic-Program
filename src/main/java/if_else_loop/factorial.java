//  6. Write  a program to find the factorial of a given number
package if_else_loop;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter number: ");
        int number= sc.nextInt();
        int factorial=1;
        for(int i=number; i>0; i--)
        {
            factorial*=i;
        }
       System.out.println(number+"! is: "+ factorial); 
    }
    
}
