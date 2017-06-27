/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arrays;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ilgarrasulov
 */
public class Main {
    
    private static Scanner scanner= new Scanner(System.in);
    private static GroceryList groceryList=new GroceryList();
    
    public static void main(String[] args){
        boolean quit=false;
        int choice=0;
        while(!quit){
            System.out.println("Enter your choice: ");
            choice=scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit=true;
                    break;
            }
        }
      }
    
    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To process list.");
        System.out.println("\t 7 - To quit the application.");

    }
    
    public static void addItem(){
        System.out.print("Enter item: ");
        String item=scanner.nextLine();
        groceryList.addGroceryItem(item);
    }
    
    public static void modifyItem(){
        System.out.print("Enter current item: ");
        String currentItem=scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem=scanner.nextLine();
        groceryList.modifyGroceryItem(currentItem, newItem);
    }
    
    public static void removeItem(){
        System.out.print("Enter item: ");
        String item=scanner.nextLine();
        groceryList.removeGroceryItem(item);
    }
    
    public static void searchForItem(){
        System.out.print("Item to search for: ");
        String searchItem=scanner.nextLine();
        if(groceryList.onFile(searchItem)){
            System.out.println("Found "+searchItem+" in the grocery list");
        }
        else{
            System.out.println(searchItem+" is not in the grocery list");
        }
        
    }
     
    public static void processArrayList(){
//        ArrayList<String> newArray= new ArrayList<String>();
//        newArray.addAll(groceryList.getGroceryList());
//        
//        ArrayList<String> nextArray=new ArrayList<String>(groceryList.getGroceryList());
//        
//        String[] myArray=new String[groceryList.getGroceryList().size()];
//        myArray =  groceryList.getGroceryList().toArray(myArray);
    
    }
}
