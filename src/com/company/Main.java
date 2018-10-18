package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Grocery27> mygrocery = new ArrayList<>();
        String grocery = "";
        Scanner Sc = new Scanner(System.in);
        Random rn = new Random();

        String userInput = "";
        do {
            System.out.println("Enter the item name");
            String userInputName = Sc.next(); // One word - orange
//            String userInputName = Sc.nextLine(); // Sentence
            System.out.println("Enter the price");
            double userInputprice = Sc.nextDouble();
            System.out.println("Enter quantity");
            int userInputqunatity = Sc.nextInt();
            double userInputCost = userInputprice*userInputqunatity;
            // Add all the items to the arrayList - here the array list is mygrocery
            // First call the arraylist and add items to it - new Grocery27
//            public Grocery27(String itemname, double price, int quantity, double cost)
            mygrocery.add(new Grocery27(userInputName, userInputprice,userInputqunatity,userInputCost));
            System.out.println("do you want to add more Item y(yes) or N(no)");
            userInput = Sc.next();
        }while (!userInput.equalsIgnoreCase("no"));

        for (Grocery27 tik: mygrocery){
            System.out.println(tik.getItemname() + "   " + tik.getPrice() + "  " + tik.getQuantity()+ "  " + tik.getCost());
            
        }
    }
}
