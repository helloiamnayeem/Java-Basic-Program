/*  4. Write a program to check balance and withdraw money from ATM booth using if else or switch case */

package if_else_loop;

import java.util.Scanner;

public class ATM_balance {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         float balance= 5000;  // initial balance 
         
        while(true)
        {
            System.out.println("\nEnter 1 to check balance ");
            System.out.println("Enter 2 to withdraw money ");
            
            int choice= sc.nextInt();
            
            switch(choice)
                    {
                case 1:
                    System.out.println("Your balance is "+balance+" taka");
                    break;
                
                case 2:
                    System.out.println("How much you want to withdraw?");
                    float withdraw=sc.nextFloat();
                    if(withdraw<=balance)
                    {
                        System.out.println("You have withdrawn "+withdraw+ " taka");
                        balance= balance-withdraw;
                                              
                    }else
                        System.out.println("Insufficient Balance");
                }
        
        
        
        }
     
     
     }
    
}
