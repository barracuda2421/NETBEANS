/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;
import java.util.Date; 

/**
 *
 * @author barra Mauricio Campo / Eso es un proyecto de prueba
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println( "Te saludo Mauricio" );System.out.println( "Mi primer programa de Java" );
        String Nombre = "Mauricio"; 
        String Apellido = "Campo";
        int  Edad =59; /* También se puede escribir Integer Edad=59;*/
         System.out.println("Mi nombre es: " +  Nombre + Apellido + "y mi edad es: " + Edad);
        /* Ahora probafremos como sumar dos números*/
        int a;a=0; int b;b=0;int c = a + b;
        /*Como preguntar los valores al sistema*/
        
        System.out.println("La suma de dos númera a y b es: "+c);
        
        /*Ahora probaremos la entrada de datos*/
                
        int x, y, sum;
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.println("Type a number:");
        x = myObj.nextInt(); // Read user input

        System.out.println("Type another number:");
        y = myObj.nextInt(); // Read user input

        sum = x + y;  // Calculate the sum of x + y
        System.out.println("Sum is: " + sum); // Print the sum
        
        
    }

    /* No se de donde salió esto parece un método*/
    private static class string {

        public string() {
        }
    }
    
}
