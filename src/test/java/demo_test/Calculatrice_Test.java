package demo_test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;

public class Calculatrice_Test {

	@Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testAdd() {
        int a = 2;
        int b = 3;
        Calculatrice calc = new Calculatrice();
        int actual = calc.add(a, b);
        
        Assert.assertEquals(5, actual);
    }

    @Test
    public void testSub() {
        int a = 7;
        int b = 3;
        Calculatrice calc = new Calculatrice();
        int actual = calc.sub(a, b);
        
        Assert.assertEquals(4, actual);    }

    @Test
    public void testMul() {
        int a = 2;
        int b = 3;
        Calculatrice calc = new Calculatrice();
        int actual = calc.mul(a, b);
        
        Assert.assertEquals(6, actual);
    }

    @Test
    public void testDiv() {
        int a = 12;
        int b = 3;
        Calculatrice calc = new Calculatrice();
        int actual = calc.div(a, b);
        
        Assert.assertEquals(4, actual);    }
    
    @Test
    public void testPair() {
        int a = 12;
        Calculatrice calc = new Calculatrice();
        boolean actual = calc.isPair(a);
        
        Assert.assertTrue(actual);    }

}
