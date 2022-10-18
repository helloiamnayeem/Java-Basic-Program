/* 5. Take 5 numbers from users in an array. Then find out the average number,
how many even and how many odd numbers using these functions: average(), countEvenNumbers(), countOddNumbers()  */


package function_array;

import java.util.Scanner;


public class avg_odd_even {
    
    public static float average(int[] number, int n)
    {
        int sum=0;
        for(int i=0; i<n; i++ )
        {
            sum+= number[i];
        
        }
    return sum/n;
    }
    
    public static int countEvenNumbers(int[] number, int n)
    {   int count=0;
        for(int i=0; i<n; i++)
        {
            if(number[i]%2 == 0 && number[i]!=0)
                count++;
                
        }
    
    return count;
    }
    
    
        public static int countOddNumbers(int[] number, int n)
    {   int count=0;
        for(int i=0; i<n; i++)
        {
            if(number[i]%2 != 0 && number[i]!=0)
                count++;
                
        }
    
    return count;
    }
    
    
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int n=5;   // number of numbers
        int[] number= new int[n];
        System.out.println("Enter 5 numbers: ");
        for(int i=0; i<5; i++)
            number[i]= sc.nextInt();
    
        float avg = average(number,n);
        int even_count = countEvenNumbers(number, n);
        int odd_count = countOddNumbers(number, n);
        
        System.out.println("avg: "+avg+"\teven: "+even_count+ "\t odd: "+odd_count);
        
        
    
    
    }
}
