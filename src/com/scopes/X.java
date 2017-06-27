/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package scopes;

import java.util.Scanner;

/**
 *
 * @author mragl
 */
public class X {
    private int x;
    
    public X(Scanner x){
        this.x=x.nextInt();
    }
    public void x(){
        
        for(int x=1;x<=12;x++){
            System.out.println(x+" * "+this.x+" = "+x*this.x);
        }
    }
    
}
