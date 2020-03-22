/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas1;

/**
 *
 * @author barra
 */
public class vehiculo_metodo_prueba {
    public static void main(String args[])
    {
    vehiculo_metodo miCoche = new vehiculo_metodo();  
    miCoche.acelerar(12);    
    miCoche.frenar(5);     
    System.out.println(miCoche.obtenerVelocidad()+ "Km/h");   
    }
}
class vehiculo_metodo 
    {
    /** Función principal */  
    int ruedas;    
    double velocidad=10; 
    String nombre="Prueba "; 

    /** Aumenta la velocidad*/
     void acelerar(double cantidad ) {velocidad += cantidad;}   
    
    /** Disminuye la velocidad*/   
      void frenar(double cantidad) { velocidad -= cantidad;} 
    
    /** Devuelve la velocidad*/  
    double obtenerVelocidad(){return velocidad; }
    }
  