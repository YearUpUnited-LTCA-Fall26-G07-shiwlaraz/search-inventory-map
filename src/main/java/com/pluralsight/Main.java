package com.pluralsight;

import java.util.HashMap;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Inventory> inventoryMap = loadInventory();
        InventorySearch.searchProducts(inventoryMap);

        for (Inventory inventory: inventoryMap.values()){
            if (inventory != null){
                System.out.printf(" %d | %s | $%.2f%n",
                        inventory.getId(),
                        inventory.getName(),
                        inventory.getPrice());
            }
        }

    }
    public static HashMap<Integer, Inventory> loadInventory() {
        return InventoryFileReader.readInventoryFromFile();
    }

}

