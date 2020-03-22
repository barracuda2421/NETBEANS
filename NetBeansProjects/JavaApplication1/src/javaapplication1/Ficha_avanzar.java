package javaapplication1;

 
public class Ficha_avanzar {                
                public static void main( String[] args)
                {   
                Fichaparam1 ficha1 = new Fichaparam1(6);
                ficha1.avanzar(10); 
                System.out.println(ficha1.casillaActual());
//Da 9 
                }}

class Fichaparam1 { 
             private int casilla; //Valor inicial de la propiedad  
            //constructor 
            Fichaparam1 (int n) { casilla = n;  }   
            //
            public void avanzar(int n) {   casilla += n;}
            public int casillaActual(){   return casilla;}
    }

                