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
public class Main {
    public static void main(String[] args) {
     
//        String var4="This is privateVar to main() method";
//        ScopeChecker scopeChecker=new ScopeChecker();
//        System.out.println("scopeChecker privateVar "+scopeChecker.getPrivateVar());
//        System.out.println("privateVar ="+var4);
//        
//        scopeChecker.timesTwo();
//        System.out.println("**********************************");
//        ScopeChecker.InnerClass innerClass=scopeChecker.new InnerClass();
//        innerClass.timesTwo();
              
               
        X x=new X(new Scanner(System.in));
        
        x.x();
        
    }
}
