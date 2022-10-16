/* 1. Take input from a user and check if the number exists in the array
let the array is [1,3,5,7,2,4,6,8]
Input: 7
Output: Found in the position 3
Input: 9
Output: Found no element*/


package arrayproblems;

import java.util.Scanner;


public class number_exist {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr= {1,3,5,7,2,4,6,8};
        
        System.out.println("Enter a number [0-10]");
        int number=sc.nextInt();
        
        int flag=0;
        for(int i=0; i<arr.length;i++)
        {
            if(number==arr[i])
            {
                System.out.println("Found in the position "+i);
                flag=1;
            }
                
        
        
        }
        if(flag == 0)
            System.out.println("Found no element");
    }
    
}
