/*  2. Input an amount from the user and find out the number of notes from input amount in given array
[1000,500,100,50,20,10,5,2,1]
Input: 1256
Output: 
1000 1
100 2
50 1
5 1
1 1 */

package function_array;

import java.util.Scanner;


public class number_of_notes {
     public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
         int count_1000=0;
         int count_500=0;
         int count_100=0;
         int count_50= 0;
         int count_20= 0;
         int count_10= 0;
         int count_5= 0;
         int count_2= 0;
         int count_1= 0;
         
         int[] notes = {1000,500,100,50,20,10,5,2,1};
         
         System.out.println("Input an amount: ");
         int amount = sc.nextInt();
         System.out.println("");
         
         while(amount !=0)
         {
            if(amount>= 1000)
                {
                 count_1000 = amount /1000;
                 amount=amount %1000;
                 System.out.println("1000 "+ count_1000 );
         
                }else if(amount>=500 && amount< 1000)
                {
                    count_500 = amount /500;
                    amount=amount %500;
                    System.out.println("500 "+ count_500 );
                
                }else if(amount >=100 && amount< 500)
                {
                    count_100 = amount /100;
                    amount=amount %100;
                    System.out.println("100 "+ count_100 );
                
                }else if( amount>= 50 && amount <100)
                {
                    count_50 = amount /50;
                    amount=amount %50;
                    System.out.println("50 "+ count_50 );
                
                }else if( amount >=20 && amount < 50)
                {
                    count_20 = amount /20;
                    amount=amount %20;
                    System.out.println("20 "+ count_20 );
                
                }else if( amount >=10 && amount <20)
                {
                    count_10 = amount /10;
                    amount=amount %10;
                    System.out.println("10 "+ count_10 );
                
                }else if( amount>=5 && amount<10)
                {
                    count_5 = amount /5;
                    amount=amount %5;
                    System.out.println("5 "+ count_5 );
                }else if(amount>=2 && amount<5)
                {
                    count_2 = amount /2;
                    amount=amount %2;
                    System.out.println("2 "+ count_2 );
                }else
                {   count_1 = amount/1;
                    amount= amount-1;
                    System.out.println("1 "+ count_1 );
                }
         }
         
         
         
         
         
         
         
         
         
         
     }
    
}
