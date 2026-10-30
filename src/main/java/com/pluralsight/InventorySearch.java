package com.pluralsight;

import java.util.HashMap;
import java.util.Scanner;

public class InventorySearch{
    public static void searchProducts(HashMap<Integer, Inventory> inventoryMap) {
        String answer = "yes";
        Scanner myScanner = new Scanner(System.in);
        while (answer.equalsIgnoreCase("yes")){

            System.out.println("Enter the product ID you want to search");
            int id = Integer.parseInt(myScanner.nextLine());

            Inventory inventory = inventoryMap.get(id);
            if (inventory != null){
                System.out.printf("%d | %s | $%.2f%n",
                        inventory.getId(),
                        inventory.getName(),
                        inventory.getPrice());

            }
            else {
                System.out.println("Product not found!");
            }
            System.out.println("Do you want to search again? yes/no");
            answer = myScanner.nextLine();

        }
    }
}
