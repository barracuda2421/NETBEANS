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
public class vehiculo {
    /** Función principal */  
    int ruedas;    
    double velocidad=10; 
    String nombre="Prueba "; 

    /** Aumenta la velocidad*/
     private void acelerar(double cantidad ) {velocidad += cantidad;}   
    
    /** Disminuye la velocidad*/   
      void frenar(double cantidad) { velocidad -= cantidad;} 
    
    /** Devuelve la velocidad*/  
    double obtenerVelocidad(){return velocidad; }

 public static void main(String args[]){
vehiculo miCoche = new vehiculo();  
miCoche.acelerar(12);    
miCoche.frenar(5);     
System.out.println(miCoche.obtenerVelocidad()+ "Km/h");   
}
}
