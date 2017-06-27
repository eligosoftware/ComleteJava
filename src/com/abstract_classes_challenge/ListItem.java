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
public abstract class ListItem {
    protected ListItem prev,next;

    public void setValue(Object value){
        this.value=value;
    }
    public Object getValue()
    {
        return value;
    }    
    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    
    abstract ListItem next();
    abstract ListItem setNext(ListItem next);
    
    
    abstract ListItem prev();
    abstract ListItem setPrev(ListItem prev);
    
    
    abstract int compareTo(ListItem item);
}
