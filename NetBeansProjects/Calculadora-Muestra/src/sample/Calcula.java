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
public class Calcula {
 
    static void metodo_calculadora ()
        {
            System.out.println("He entrado en el método");
            public int num1=0; public int num2=0;
            public int suma() { int resultado= num1 +  num2 ; return resultado; }
            public int resta() { int resultado= num1 -  num2 ; return resultado; }
            public int multiplica() {int resultado= num1 * num2 ; return resultado; }
            public int divide() { int resultado= num1 / num2 ; return resultado;   }
        }
  
    public static void main(String[] args) {
        System.out.println("Aquí queremos hacer una función para llamar al metodo_calculadora");
        metodo_calculadora(resultado);
        //Calculadora  = new Calculadora(6,5);
}
    
}
