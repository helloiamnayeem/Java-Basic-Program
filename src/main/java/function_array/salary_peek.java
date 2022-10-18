/*  3. Suppose, in a company , here are some employee salaries in an array
[35000, 25000, 28000, 32500, 44000, 32800]
Find out the 3rd highest salary */


package function_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class salary_peek {
    public static void main(String[] args) {
    
        int[] salary ={35000,25000,25000,28000,325000,44000,328000};
        
        Set <Integer> salarySet =new HashSet<>();
        for(int i=0; i<salary.length; i++)
        {
            salarySet.add(salary[i]);  // to remove duplicates
        
        }
        ArrayList<Integer> salaryList = new ArrayList<>(salarySet);
        Collections.sort(salaryList, Collections.reverseOrder());   //descending sort
        
        
      //  System.out.println(salaryList); 
        
        System.out.println("3rd highest salary: "+salaryList.get(2));
        
     
        
    
    }
    
}
