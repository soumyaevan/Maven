package com.test;

import com.calc.Calculator;
import junit.framework.TestCase;

public class CalcTest extends TestCase {
    Calculator calc;
    @Override
    public void setUp() throws Exception {
       calc = new Calculator();
    }

    @Override
    public void tearDown() throws Exception {
        System.gc();
    }

    public void testAdd() throws Exception {
        assertTrue(calc.add(10,15)==25);
    }

    public void testSub() throws Exception {
        assertTrue(calc.sub(25,10)==15);
    }
}
