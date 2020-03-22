

package sample;

public class NewMain {
  
            static void myMethod(int a, int b) {
              System.out.println("El valor producto es: " + a*b);
             
            }
            static void myMethod1(int a, int b) {
            
                double resultado=Math.pow(a,b);
              System.out.println("El valor potencia es: " + resultado);
              
            }
          
          
          
  public static void main(String[] args) {
    myMethod(5,6);
    myMethod(4,8);
     myMethod1(5,6);
     myMethod1(4,8);
  }
}
