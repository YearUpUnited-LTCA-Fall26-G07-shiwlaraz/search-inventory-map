package com.pruralsight;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class InventoryFileReader {
    public static HashMap<Integer, Inventory> readInventoryFromFile(){
        HashMap<Integer, Inventory> inventoryMap = new HashMap<>();

        try{
            FileReader fr1 = new FileReader("inventory.csv");
            BufferedReader br1 = new BufferedReader(fr1);

            String line;

            while ((line = br1.readLine()) != null){
                String[] split = line.split("[|]");

                int id = Integer.parseInt(split[0]);
                String name = split[1];
                double price = Double.parseDouble(split[2]);

                Inventory inventory = new Inventory(id, name, price);

                inventoryMap.put(id, inventory);
            }

        }catch (IOException e) {

        }
        return inventoryMap;


    }
}
