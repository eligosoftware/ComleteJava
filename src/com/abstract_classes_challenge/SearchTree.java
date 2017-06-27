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
public class SearchTree implements NodeList{
    
    private ListItem root=null;

    public SearchTree(ListItem root) {
        this.root=root;
    }
    
    

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if(this.root==null){
            this.root=item;
            return true;
        }
        ListItem currentItem=this.root;
        
        while(currentItem!=null){
            int comparisson = currentItem.compareTo(item);
            if(comparisson<0){
                if(currentItem.next()!=null){
                currentItem=currentItem.next();
                }
                else{
                    currentItem.setNext(item);
                    return true;
                }
            }
            else if (comparisson>0){
                if(currentItem.prev()!=null){
                    currentItem=currentItem.prev();
                }
                else{
                    currentItem.setPrev(item);
                    return true;
                }
            }
            else{
                System.out.println(item.getValue()+" is already present");
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
        ListItem currentItem=this.root;
        ListItem parentItem = currentItem;
        
        while(currentItem!=null){
            int comparisson=currentItem.compareTo(item);
            if(comparisson<0){
                parentItem=currentItem;
                currentItem=currentItem.next();
            }
            else if(comparisson>0){
                parentItem=currentItem;
                currentItem=currentItem.prev();
            }
            else{
                //equal; we've found the item to remove
                performRemoval(currentItem,parentItem);
                return true;
            }
        }
        
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if(root!=null){
            traverse(root.prev());
            System.out.println(root.getValue());
            traverse(root.next());
        }        
    }

    private void performRemoval(ListItem item, ListItem parent) {
        if(item.next()==null){
            if(parent.next()==item){
                parent.setNext(item.prev());
            }
            else if(parent.prev()==item){
                parent.setPrev(item.prev());
            }
            else{
                //this is root of tree
                this.root=item.prev();
            }
        }
        else if(item.prev()==null){
            if(parent.next()==item){
                parent.setNext(item.next());
            }
            else if(parent.prev()==null){
                parent.setPrev(item.next());
            }
            else{
                this.root=item.next();
            }
        }
        else {
            ListItem current=item.next();
            ListItem leftmostParent=item;
            
            while(current.prev()!=null){
                leftmostParent=current;
                current=current.prev();
            }
            
            item.setValue(current.getValue());
            if(leftmostParent==item){
                leftmostParent.setNext(current.next());
            }
            else{
                leftmostParent.setPrev(current.next());
            }
        }
    }
    
}
