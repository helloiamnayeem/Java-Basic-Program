/*  4. Create your todays bazar list/pocket expenditure which includes the item name and price.
Then create a function named searchItem(String item) which will be used to search
any item from your HashMap and return the price. If found no item, then print message as "No item found" 
and another function named totalSum() which will return total price of items.   */

package function_array;


import java.util.*;


public class bazar_list {
	public void bazar_list(String itemsName) {

		HashMap<String, Double> hashMap =new HashMap<>() ;

		double result = 0;

		if (bazarlist.containsKey(itemsName)) {

			result = bazarlist.get(itemsName);
			System.out.println("Items price: " + result);
		} else {
			System.out.println("No items found");
		}


	}


	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your products name: ");

		String itemsName = input.nextLine();

		double sum=0;


		bazar_list(itemsName);

		//System.out.println(obj.totalSum()) ;


	}






	public double totalSum(){
		HashMap<String, String> hm = this.getHashmap();
		Iterator<Map.Entry<String, Double>> itr = bazar_list.entrySet().iterator();
		double sum=0;
		while (itr.hasNext()) {

			Map.Entry mapElement
					= (Map.Entry)itr.next();
			double price = (int)mapElement.getValue();
			sum+=price;
		}

		return sum;
	}

	public static HashMap<String, String> map = new HashMap<String, String>();  {
		HashMap<String, Double> bazarlist = new HashMap<>();
		bazarlist.put("Chaal", 90.0);
		bazarlist.put("Daal", 70.0);
		bazarlist.put("Ata", 50.0);
	}


}