// 7. Generate 20 random numbers from 0 to 100 and print the max, min and duplicate random numbers (if any)
package function_array;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class max_min_duplicate {
     public static void main(String[] args) {
     
         Random random = new Random();
         int n=20;  // 20 random numbers
         int[] random_number = new int[n];
         
         int max= -1;
         int min= 101;
         int i=0;
         while(i!=n)
         {
             random_number[i]= random.nextInt(100);  // range [0-100]
         //   System.out.print(random_number[i]+ " ");
            if(random_number[i]>max)
                max=random_number[i];
            else if(random_number[i]<min)
                min= random_number[i];
            
            
            
             i++;
         }
         
         System.out.print("max: "+max+" min "+min);
         System.out.println();
         
         Set <Integer> duplicate =new HashSet<>();
         for(int j=0; j<n-1; j++)
         {  
             
             for(int k=j+1; k<n; k++)
             {
                 if(random_number[j] == random_number[k] && j!=k )
                 {
                     duplicate.add(random_number[k]);
                 }
             
             }
        
         
         }
         if(duplicate.isEmpty())
             System.out.println("No duplicate numbers");
         else
             System.out.println("duplicate numbers:"+ duplicate);
          
         
         
         
     }
    
}
