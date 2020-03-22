/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

class Calculadoraxx 
        {  
        static public int factorial(int n) 
            { 
            int fact=1;
                while (n>0) 
                {fact *=n--; }
            return fact;  
            }
        }   
 

 public class Otrofactorial
        {     
         public static void main(String[] args) 
             {  
            System.out.println(Calculadoraxx.factorial(5));} 
             } 