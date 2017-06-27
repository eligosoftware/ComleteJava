/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arrayListChallenge;

import java.util.ArrayList;

/**
 *
 * @author ilgarrasulov
 */
class Contact{
private String name,contact;

    public String getName() {
        return name;
    }

    

    public String getContact() {
        return contact;
    }

    
    public Contact(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

 
}

public class MobilePhone {
    private ArrayList<Contact> contacts=new ArrayList<Contact>();

    public ArrayList<Contact> getContacts() {
        return contacts;
    }
  
    
    public void updateContact(String name, String phone){
        int position =findContact(name); 
        if(position>-1){
            contacts.set(position, new Contact(name, phone));
            System.out.println("Updated contact "+name);
        }
        else{
            System.out.println("Couldn't find contact with name "+name);
        }
    }
    
    public void printContactsList(){
        System.out.println("You have "+contacts.size()+" contacts in mobile phone");
        int index=1;
        for(Contact contact : contacts){
            System.out.println(index+" : "+contact.getName()+" - "+contact.getContact());
            index++;
        }
    }
    
    public void removeContact(String name){
        int position =findContact(name); 
        if(position>-1){
            contacts.remove(contacts.get(position));
            System.out.println("Deleted contact "+name);
        }
        else{
          System.out.println("Couldn\t find contact with name "+name);
        }
    }
    
    public void addContact(String name,String phone){
        if(findContact(name)>-1){
        //there is already such contact
            System.out.println("Contact with name "+name+" already exists in contacts list");
        }
        else{
            contacts.add(new Contact(name, phone));
            System.out.println("Added contact with name "+name+" and phone "+phone+" to the contacts list");
        }
    }
    public int findContact(String searchText){
        for (Contact contact : contacts) {
            if(contact.getName().equals(searchText) || contact.getContact().equals(searchText)){
                return contacts.indexOf(contact);
            }           
        }
        return -1;
    }
}
