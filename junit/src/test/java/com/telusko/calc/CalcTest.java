package com.telusko.calc;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalcTest {

    Calc calc;

    @Before
    public void setUp() {
        calc = new Calc();
    }

    @Test
    public void testAdd() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void testSub() {
        assertEquals(2, calc.sub(5, 3));
    }

    @Test
    public void testMul() {
        ;
        assertEquals(6, calc.mul(2, 3));
    }

    @Test
    public void testDiv() {
        assertEquals(2, calc.div(6, 3));
    }

}
