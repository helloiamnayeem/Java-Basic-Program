/*   3. Input 2 decimal numbers and check if
they are both same or different up to two decimal places. E.g 120.546 & 120.241  */
package if_else_loop;
import java.util.Scanner;

public class check_upto_2_decimal {
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        System.out.print("Enter 2 decimal numbers: ");
        
        float number1 = sc.nextFloat();
        float number2 = sc.nextFloat();
        
        if(Math.abs(number1 - number2) <= 0.01)
            System.out.println("Same numbers");
        else
            System.out.println("Different numbers");

    }
    
}
