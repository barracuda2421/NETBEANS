/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

/**
 *
 * @author barra
 */

public class Calculadora_factorial1
                    { 
                    public static void main(String[] args){
                    
                        CalculoFactorial Met1=new CalculoFactorial();
                       int x= Met1.factorial( 30);
                                
                    System.out.println(x); 
                    }
}
                                        
                    
 class CalculoFactorial {
                        public int factorial (int n)
                        {   
                        int fact=1;   
                        while (n>0) {    fact *=n--;}
                        return fact; } 
}

