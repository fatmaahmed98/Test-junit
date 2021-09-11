/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorapp.testing;
import calculatorapp.Samplecalc;
//import org.junit.After;
//import org.junit.AfterClass;
import org.junit.Before;
//import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fatma
 */
public class TestCalculatorApp {
    Samplecalc calc1;
    @Before
    public void calc(){
        calc1 = new Samplecalc();
    }
    @Test
    public void testSum(){
        int sum = calc1.Sum(70, 30);
        assertEquals(100, sum);
    }
    @Test
    public void testSub(){
        int sub = calc1.Sub(70, 30);
        assertEquals(40, sub);
    }
    @Test
    public void testMul(){
        int mul = calc1.Mul(3, 3);
        assertEquals(9, mul);
    }
    @Test
    public void testDiv(){
        int div = calc1.Div(9, 3);
        assertEquals(3, div);
    }

}
