/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author barra
 */
public class UtilsJUnit4Test {
    
    public UtilsJUnit4Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("* UtilsJUnit4Test: @BeforeClass method");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("* UtilsJUnit4Test: @AfterClass method");
    }
    
    @Before
    public void setUp() {
        System.out.println("* UtilsJUnit4Test: @Before method");
    }
    
    @After
    public void tearDown() {
        System.out.println("* UtilsJUnit4Test: @After method");
    }

    /**
     * Test of concatWords method, of class Utils.
     */
    @Test
    public void testConcatWords() {
        System.out.println("concatWords");
        String[] words = null;
        String expResult = "";
        String result = Utils.concatWords(words);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of computeFactorial method, of class Utils.
     */
    @Test
    public void testComputeFactorial() {
        System.out.println("computeFactorial");
        int number = 1;
        String expResult = "";
        String result = Utils.computeFactorial(number);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of normalizeWord method, of class Utils.
     */
    @Test
    public void testNormalizeWord() {
        System.out.println("normalizeWord");
        String word = "";
        String expResult = "";
        String result = Utils.normalizeWord(word);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
