/*2. Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and 1 sharee,
        then 400 tk will be discounted. After your purchase what will be your total cost?*/

package string_manipulation;

import java.util.Scanner;

public class TotalPurchaseCost {
    public static void main(String[] args) {

    System.out.println("Buy two shirt and 1 sharee you get 400TK discount");

    int shirtQuantity, shirtPrice = 1200;
    int shareeQuantity, shareePrice = 3500;
    int discountPrice = 400;

    Scanner input = new Scanner(System.in);
    System.out.println("Enter shirt quantity: ");
    shirtQuantity = input.nextInt();
    System.out.println("Enter Sharee quantity: ");
    shareeQuantity = input.nextInt();

    int totalShirtPrice = shirtQuantity * shirtPrice;
    int totalShareePrice = shareeQuantity * shareePrice;
    int orginalPrice = totalShirtPrice + totalShareePrice;

    if (shirtQuantity >= 2 && shareeQuantity >= 1) {
        int finalPrice = orginalPrice - discountPrice;

        System.out.println("Total Cost after Discount: " + finalPrice);
     }
    else {

        System.out.println("Total Cost: " + orginalPrice);
            }

                        }
}