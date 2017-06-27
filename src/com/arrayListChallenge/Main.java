/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arrayListChallenge;


import java.util.Scanner;

/**
 *
 * @author ilgarrasulov
 */
public class Main {
    
     private static Scanner scanner= new Scanner(System.in);
    private static MobilePhone mobilePhone=new MobilePhone();
    
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
                    mobilePhone.printContactsList();
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
                    quit=true;
                    break;
            }
        }
    }

    
 public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of contacts.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");

    }    
 
 public static void addItem(){
 
     System.out.print("Enter contact name:");
     String name=scanner.nextLine();
     System.out.println("Enter phone number:");
     String phone = scanner.nextLine();
     
     mobilePhone.addContact(name, phone);
 }
 
 public static void modifyItem(){
     System.out.print("Enter contact name:");
     String name=scanner.nextLine();
     System.out.println("Enter phone number:");
     String phone = scanner.nextLine();
     
     mobilePhone.updateContact(name, phone);
 
 }
 
 public static void removeItem(){
     System.out.print("Enter contact name:");
     String name=scanner.nextLine();
     mobilePhone.removeContact(name);
 }
 public static void searchForItem(){
     System.out.print("Enter contact name:");
     String name=scanner.nextLine();
     
     int position=mobilePhone.findContact(name);
     if(position>-1){
         Contact contact =mobilePhone.getContacts().get(position);
         System.out.println("Found contact "+contact.getName()+" with phone "+contact.getContact());
     }else{
         System.out.println("Couldn't find contact "+name);     
     }
 }
 
 
}
