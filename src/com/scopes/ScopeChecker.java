/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package scopes;

/**
 *
 * @author mragl
 */
public class ScopeChecker {
    public int publicVar=0;
    private int var1=1;
    
    public ScopeChecker(){
        System.out.println("ScopeChecker created, publicVar = "+publicVar+", privateVar = "+var1);
    }

    public int getPrivateVar() {
        return var1;
    }
    public void timesTwo(){
        int var2=2;
        for(int i=1;i<=10;i++){
            System.out.println(i+" times private var is "+i*var2);
        }
    }
    
    public class InnerClass{
        public int var3=3;

        public InnerClass() {
            System.out.println("Inner class created, privateVar = "+var3);
        }
        
     public void timesTwo(){
     //   int privateVar=2;
        for(int i=1;i<=10;i++){
            System.out.println(i+" times private var is "+i*ScopeChecker.this.var1);
        }
    }
     
    }
}
