// 7. Write a program to print prime numbers from 2 to n

package if_else_loop;

import java.util.Scanner;

public class prime_print {
    
   
    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
     
    System.out.println("Input n: ");
    int n=sc.nextInt();
    
    for(int number=2; number<n; number++) // 2 to 100
    {
        int flag=0;
        for(int i=2; i<=number/2; i++)
        {
            if(number%i == 0)
            {flag=1;break;}
             
        }
        if(flag==0)
         System.out.print(number+ " ");
        
    }
    
            
 } 
    
}
