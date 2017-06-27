/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package abstract_classes_challenge;

/**
 *
 * @author ilgarrasulov
 */
public class MyLinkedList implements NodeList{

    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }
    
    
    
    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if(this.root==null){
            //list was empty
            this.root=item;
            return true;
        }
        ListItem currentItem=this.root;
        
        while(currentItem!=null){
            int comparisson=currentItem.compareTo(item);
            if(comparisson <0){
                //newItem is greater, move right if possible
                if(currentItem.next() !=null){
                    currentItem=currentItem.next();
                }
                else {
                    //there is no next, so insert at the end of list
                    currentItem.setNext(item).setPrev(currentItem);
                    return true;
                }
            }
            else if(comparisson>0){
                //new item is less, insert before
                if(currentItem.prev()!=null){
                    currentItem.prev().setNext(item).setPrev(currentItem.prev());
                    item.setNext(currentItem).setPrev(item);
                }
                else{
                     item.setNext(this.root).setPrev(item);
                     this.root=item;
                     
                }
                return true;
            } else{
                //equal
                System.out.println(item.getValue()+" is already present, not added");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(item!=null){
            System.out.println("Deleting item "+item.getValue());
         }
        ListItem currentItem=this.getRoot();
        while(currentItem!=null){
            int comparison=currentItem.compareTo(item);
            if(comparison==0){
                
                if(currentItem==this.root){
                    this.root=currentItem.next();
                }
                else
                {   
                    currentItem.prev().setNext(currentItem.next());
                    if(currentItem.next()!=null){
                        currentItem.next().setPrev(currentItem.prev());
                    }
                }
                return true;
                }
            else if(comparison<0){
                currentItem=currentItem.next();
            }
            else{
                //we are at an item greater than deleted item, so it is not found
                return false;
            }
            }
            return false;
        }
    

    @Override
    public void traverse(ListItem root) {
        if(root==null){
            System.out.println("The list is empty");
        }
        else{
            while(root!=null){
                System.out.println(root.getValue());
                root=root.next();
            }
        }
    }
    
}
