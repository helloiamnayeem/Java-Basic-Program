//  5. Write a program to sum of numbers which only divisible by 5 from 1 to 100
package if_else_loop;

public class sum_divisible_by_5 {
      public static void main(String[] args) {
         
          int sum=0;
          for(int i=1; i<=100 ; i++)  // 1 to 100
          {
              if(i%5==0)
                  sum+=i;
                  
          }
          
          /* for(int i=1; i<= 100; i+=5)
                sum+=i;
          */
          
        
          
          System.out.println("The sum: "+sum);
          
          
          
      }
      
    
}
