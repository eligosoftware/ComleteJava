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
public class Node extends ListItem{

    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.next;
    }

    @Override
    ListItem setNext(ListItem next) {
        this.next=next;
        return this.next;
    }

    @Override
    ListItem prev() {
       return this.prev;
    }

    @Override
    ListItem setPrev(ListItem prev) {
        this.prev=prev;
        return this.prev;
    }

    @Override
    int compareTo(ListItem item) {
        if (item!=null){
        return ((String)this.getValue()).compareTo((String)item.getValue());
        }
        return -1;
    }
    
}
