/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author barra
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of suma method, of class Calculadora.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        Calculadora calcu = new Calculadora(20,10);
        int resultado = calcu.suma();
        assertEquals(30, resultado);
    }

    /**
     * Test of resta method, of class Calculadora.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        Calculadora calcu= new Calculadora(20,10);
        int resultado = calcu.resta();
        assertEquals(10, resultado);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of multiplica method, of class Calculadora.
     */
    @Test
    public void testMultiplica() {
        System.out.println("multiplica");
        Calculadora calcu= new Calculadora(20,10);
        int resultado = calcu.multiplica();
        assertEquals(200, resultado);
    }

    /**
     * Test of divide method, of class Calculadora.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        Calculadora calcu= new Calculadora(20,10);
        int resultado = calcu.divide();
        assertEquals(2, resultado);
    }
    
}
