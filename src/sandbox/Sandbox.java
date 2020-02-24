/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 fuck yu
 * and open the template in the editor.
 */
package sandbox;

/**
 *
 * @author Ali Zoubeidi
 */
public class Sandbox {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello my sandbox in NetBeans!!!");
        System.out.println("My first change to be saved to git");
        
        int a = 5;
        int b= 5;
        
     
                
        System.out.println("Equality: a==b " + (a==b));
        System.out.println("Equality: a!=b " + (a!=b));
        System.out.println("Equality: !(a==b)" + !(a==b));
        
        System.out.println();
        System.out.println("Relational: a<b " + (a<b));
        System.out.println("Relational: a<=b " + (a<=b));
        System.out.println("Relational: a>b " + (a>b));
        System.out.println("Relational: a>=b " + (a>=b));
        
        System.out.println();
        System.out.println("Logical: !(a<=b) " + !(a<=b));
        System.out.println("Logical: T && T " + ((a==b) && true));
        System.out.println("Logical: T && F " + (true && false));
        System.out.println("Logical: F && T " + ((a!=b) && true));
        System.out.println("Logical: T || T " + (true || true));
        System.out.println("Logical: T || F " + (true || false));
        System.out.println("Logical: F || F " + (false || false));
        
        System.out.println();
        //a=2;
        if (a<b){
            System.out.println("a is less than b");
            if (a==2)
                System.out.println("a is equal 2");
        } else if (a<0){
            System.out.println("a is less than zero");
        } else {
            System.out.println("a is NOT less than b nor than zero");
        }
        System.out.println("Outside the if");
        
        System.out.println("Conditional operator");
        String result;
        
        result = (a==b)?"Yes, of course it is TRUE":"FALSE";
        
        System.out.println("");
        
        
    }
    
}
