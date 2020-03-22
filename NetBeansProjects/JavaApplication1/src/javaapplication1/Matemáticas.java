/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author barra
 */
public class Matemáticas {
    public double factorial(int n){ 
        double resultado;
   for (resultado=1;n>1;n--) resultado*=n;  return resultado; } 

public static void main(String args[]){
                     Matemáticas m1=new Matemáticas(); 
                     double x=m1.factorial(4);//Llamada al método  
                     //System.err.println("El factorial es: " + x);
                     System.out.println("El factorial es: " + x);
                     System.out.println("El factorial es: " + m1.factorial(5));
                     System.out.println(m1.factorial(5)); 
 
   }
}
