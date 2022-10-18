/*  4. Create your todays bazar list/pocket expenditure which includes the item name and price.
Then create a function named searchItem(String item) which will be used to search
any item from your HashMap and return the price. If found no item, then print message as "No item found" 
and another function named totalSum() which will return total price of items.   */

package function_array;


import java.util.*;
public class bazar_list {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your products name: ");

		String itemsName = input.nextLine();

		searchItem(itemsName);
		input.close();

                System.out.println("getTotal") ;
	}
	public int getTotal (HashMap<Integer, Integer> p) {
		int total = 0;
		for (int value : p.values()) {
			total += value;
		}
		return total;
	}
/*
	public static double totalSum(){
		Iterator<Map.Entry<String, Double>> itr = bazar_list.totalSum();
		double sum=0;
		while (itr.hasNext()) {

			Map.Entry mapElement
					= (Map.Entry)itr.next();
			double price = (int)mapElement.getValue();
			sum+=price;
		}

		return sum;
	}
*/



	public static void searchItem(String itemsName) {
		HashMap<String, Integer> itemsList = new HashMap<>();

		itemsList.put("Cucumber", 55);
		itemsList.put("Onion", 30);
		itemsList.put("Rice", 60);
		itemsList.put("Chocolate", 10);

		double result = 0;

		if (itemsList.containsKey(itemsName)) {
			result = itemsList.get(itemsName);
			System.out.println("Items price: " + result);
		} else {
			System.out.println("No items found");
		}
	}
}

/*
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
*/
