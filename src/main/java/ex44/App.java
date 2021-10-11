/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Gabriel Mousa
 */


package ex44;

import java.io.*;
import java.util.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class App {


    static int searchAndPrint(String key, Product[] items){
        //If this method can find the items in the inventory then it prints out the information

        for(int i = 0; i < items.length; i++){
            if(key.equalsIgnoreCase(items[i].name)){
                System.out.println("Name: " + items[i].name);
                System.out.println("Price: " + items[i].price);
                System.out.println("Quantity: " + items[i].quantity);
                return 1;
            }
        }
        System.out.println("Sorry, that product was not found in our inventory.");
        return 0;
    }

    static void prompter(Product[] items){
        //The loop that prompts for the item name and passess it into the checker to see if it's in the products

        Scanner input = new Scanner(System.in);

        int val = 0;

        while(val == 0){
            System.out.format("What is the product name? ");
            String key = input.next();
            val = searchAndPrint(key, items);
        }
    }

    public static void main(String[] args) throws Exception {
        //Creates the list of items
        Product[] items = Product.findProducts();

        prompter(items);
    }
}

class Product {
    String name;
    double price;
    long quantity;



    Product(String oName, double oPrice, long oQ){
        name = oName;
        price = oPrice;
        quantity = oQ;
    }

    static Product[] findProducts() throws Exception{
        Product[] items = new Product[3];
        Object obj = new JSONParser().parse(new FileReader("input/exercise44_input.json"));
        JSONObject main = (JSONObject) obj;
        JSONArray products = (JSONArray) main.get("products");
        for(int i = 0; i < products.size(); i++){
            JSONObject item = (JSONObject) products.get(i);
            String oName = (String) item.get("name");
            Double oPrice = (Double) item.get("price");
            //Double dPrice = Double.parseDouble(oPrice);
            long oQ = (long) item.get("quantity");
            //int iQ = Integer.parseInt(oQ);
            items[i] = new Product(oName, oPrice, oQ);

        }

        return items;
    }
}