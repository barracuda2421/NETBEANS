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
/*Se dice que los argumentos son por valor, si la función recibe una copia de esos datos,
es decir la variable que se pasa como argumento no estará afectada por el código. 
*/
public class prueba {
     int metodo1(int entero){entero=18*2;return entero;} 
     
public static void main(String args[]){ 
  int x=8;int y=10;
  prueba miPrueba = new prueba();    
  miPrueba.metodo1(x);
//int z= miPrueba.metodo1(y);   
  System.out.println(x); 
  System.out.println(miPrueba.metodo1(y)); 
//Escribe 24, no 18 
}
}

