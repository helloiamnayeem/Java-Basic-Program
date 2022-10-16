
package if_else_loop;

import java.util.Scanner;

public class largest_smallest_number {
     public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
     System.out.println("Enter numbers , and to stop press 'q' ");
     int largest=-9999;
     int smallest= 999999;
     while(true)
     {
        String number=sc.next();
        if(! number.equals("q"))
        {
            if(Integer.parseInt(number)> largest)
                largest= Integer.parseInt(number);
            else if(Integer.parseInt(number) <smallest)
                smallest= Integer.parseInt(number);
                
        
        
        }
        else
            break;
        
     
     
     
     
     }
     System.out.println("largest: "+largest +" smallest "+ smallest);

     
  }
}