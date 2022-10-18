/*3. Suppose, in a company , here are some employee salaries in an array
        [35000, 25000, 28000, 32500, 44000, 32800]
        Find out the 3rd highest salary*/


package function_array;

import java.util.Arrays;

public class Find3rdHighestValue {
    public static void main(String[] args) {
    
        int[] salaryArray ={35000,25000,28000,32500,44000,32800};
        int size=salaryArray.length;
       //salaryArray= Arrays.stream(salaryArray).sorted().toArray();
        Arrays.sort(salaryArray);

        System.out.println("Sorted Salary from low to high: "+Arrays.toString(salaryArray));
       int thirdHighestSalary= salaryArray[size-3];
        System.out.println("Third Highest salary is: " +thirdHighestSalary );

    }
    
}
