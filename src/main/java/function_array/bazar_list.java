/*  4. Create your todays bazar list/pocket expenditure which includes the item name and price.
Then create a function named searchItem(String item) which will be used to search
any item from your HashMap and return the price. If found no item, then print message as "No item found" 
and another function named totalSum() which will return total price of items.   */

package arrayproblems;


import java.util.*;
public class bazar_list
{
    public static HashMap<String, Double> bazarlist;
    
	public static boolean SearchItem(String name){
	    if(bazarlist.containsKey(name))
	        return true;
	    else
	        return false;
	}
	
	public static double totalSum(){
             Iterator<Map.Entry<String, Double>> itr = bazarlist.entrySet().iterator(); 
	    double sum=0;
	    while (itr.hasNext()) {

            Map.Entry mapElement
                = (Map.Entry)itr.next();
            double price = (int)mapElement.getValue();
            sum+=price;
        }
        
        return sum;
	}
	
	public static void main(String[] args) {
	    double sum=0;
		
		bazarlist = new HashMap<>();
		
		bazarlist.put("Chaal", 90.0);
		bazarlist.put("Daal", 70.0);
		bazarlist.put("Ata", 50.0);
                
                bazar_list obj = new bazar_list();
                System.out.println(obj.totalSum()) ;
                
		
		return;
		
	}
}