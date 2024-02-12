package org.example;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class CalculatorTest extends TestCase {
    Calculator myCal = new Calculator();
    @Test
    public void testAdd() {

        assertEquals(myCal.add(2,3), 5);
    }

    @Test
    public void testProduct() {
        assertEquals(myCal.product(2,3), 6);
    }
}