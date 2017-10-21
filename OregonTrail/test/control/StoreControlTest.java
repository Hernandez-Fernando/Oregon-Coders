/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fernando
 */
public class StoreControlTest {
    
    public StoreControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTotalAmount method, of class StoreControl.
     */
    @Test
    public void testGetTotalAmount() {
        System.out.println("getTotalAmount");
        // Test 1
        System.out.println("Test 1");
        double price = 15.0;
        int quantity = 35;
        double expResult = 525.0;
        double result = StoreControl.getTotalAmount(price, quantity);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
        
        // Test 2
        System.out.println("Test 2");
        price = 1.0;
        quantity = -5;
        expResult = -60.0;
        result = StoreControl.getTotalAmount(price, quantity);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");

        
        // Test 3
        System.out.println("Test 3");
        price = -6;
        quantity = 13;
        expResult = -60.0;
        result = StoreControl.getTotalAmount(price, quantity);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");

        
        // Test 4
        System.out.println("Test 4");
        price = -4;
        quantity = -4;
        expResult = -60.0;
        result = StoreControl.getTotalAmount(price, quantity);
        assertEquals(expResult, result, 0.0001);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getRemainChash method, of class StoreControl.
     */
    @Test
    public void testGetRemainChash() {
        System.out.println("getRemainChash");
        // Test 1
        System.out.println("Test 1");
        double totalAmount = 145.0;
        double cash = 1600.0;
        double expResult;
        expResult = 1455.0;
        double result = StoreControl.getRemainChash(totalAmount, cash);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
        
         // Test 2
        System.out.println("Test 2");
        totalAmount = 263.0;
        cash = 100.0;
        expResult = -100.0;
        result = StoreControl.getRemainChash(totalAmount, cash);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
        
         // Test 3
        System.out.println("Test 3");
        totalAmount = -6.0;
        cash = 13.0;
        expResult = -100.0;
        result = StoreControl.getRemainChash(totalAmount, cash);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
        
         // Test 4
        System.out.println("Test 4");
        totalAmount = 4.0;
        cash = -100.0;
        expResult = -100.0;
        result = StoreControl.getRemainChash(totalAmount, cash);
        assertEquals(expResult, result, 0.0001);
        
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
