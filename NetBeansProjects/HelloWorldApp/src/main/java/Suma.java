/* This is a comment    System.out.println("Hello World");
/* The code below will print the words Hello World
to the screen, and it is amazing */
     /*String - stores text, such as "Hello". String values are surrounded by double quotes
int - stores integers (whole numbers), without decimals, such as 123 or -123
float - stores floating point numbers, with decimals, such as 19.99 or -19.99
char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
boolean - stores values with two states: true or false    */

public class Suma {
  public static void main(String[] args) {
    System.out.println("Que tal mundo, probando el Java");
    String name = "John";
    System.out.println(name);
    int myNum;
    myNum = 15;
    System.out.println(myNum);
    final int myNum1 = 15;
    myNum = 20;  // will generate an error: cannot assign a value to a final variable
    String firstName = "John ";
    String lastName = "Doe";
    String fullName = firstName + lastName;
    System.out.println(fullName);
    int x = 5;
    int y = 6;
    int z;
    System.out.println(x + y); // Print the value of x + y
    x = 5; y = 6; z = 50;
    System.out.println(x + y + z);
    // Good
    int minutesPerHour = 60;

    // Java Identifiers OK, but not so easy to understand what m actually is
    int m = 60;
    
    String saludo;
    saludo = "Hola Mundo!";
    System.out.println(saludo);
    saludo = ("Estoy utilizando variables");
    System.out.println( saludo );
     int xx = 1;

        if (xx > 0) {
           saludo = "Hola Mundo con if!";
        }
        System.out.println( saludo );

        float myNumf = 5.75f;
        System.out.println(myNumf);

        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);
        
        char a = 65, b = 66, c = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        


  }
}
