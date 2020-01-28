/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Sample1.settest.test;

import com.mycompany.sample1.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author milon
 */
public class CalculatorTest {
    Calculator c;
    
    public CalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("*** Executing setUp class method****");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("*** Executing teardown class method****");
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
}
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
