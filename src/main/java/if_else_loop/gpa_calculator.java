//2. Write a program to calculate GPA and find grade

/*  total
    Marks(%) 	GPA       	Grade
    80–  100  	5.00	          A+
    70 – 79	4.00	          A
    60 – 69	3.50	          A-
    50 – 59	3.00	          B
    40 – 49	2.00	          C
    33 – 39	1.00	          D
     0 – 32	0.00	          F          */

package if_else_loop;

import java.util.Scanner;

public class gpa_calculator {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       
       System.out.println("How many subjects? ");
       int subject_number=sc.nextInt();
       
       System.out.println("Enter the marks of "+subject_number+" subject [0-100]");
       float total_marks=0;
       for(int i=0; i<subject_number; i++)
       {
           total_marks+=sc.nextDouble();
       
       }
       System.out.println();
       System.out.println("Total marks: "+total_marks);
       
       float total_marks_percentage = (total_marks/(subject_number * 100)*100 );
       System.out.println("Percentage of total marks: "+String.format("%.2f", total_marks_percentage));
       
               
       if(total_marks_percentage >= 80.00 && total_marks_percentage<= 100.00)
           System.out.println("GPA: 5.00\t Grade: A+");
       else if(total_marks_percentage >= 70.00 && total_marks_percentage<= 79.00)
           System.out.println("GPA: 4.00\t Grade: A");
       else if(total_marks_percentage >= 60.00 && total_marks_percentage<= 69.00)
           System.out.println("GPA: 3.50\t Grade: A-");
       else if(total_marks_percentage >= 50 && total_marks_percentage<= 59.00)
           System.out.println("GPA: 3.00\t Grade: B");
       else if(total_marks_percentage >= 40.00 && total_marks_percentage<= 49.00)
           System.out.println("GPA: 2.00\t Grade: C");
       else if(total_marks_percentage >= 33.00 && total_marks_percentage<= 39.00)
           System.out.println("GPA: 1.00\t Grade: D");
       else if(total_marks_percentage < 33.00)
           System.out.println("GPA: 0.00\t Grade: F");
       
        
    }
    
    
}
