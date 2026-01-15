package coe318.lab8;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CircuitTest {
    
    public CircuitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetCircuit() {
        System.out.println("getCircuit");
        Circuit c1 = Circuit.getCircuit();
        Circuit c2 = Circuit.getCircuit();
        assertEquals(false, c1 == null);
        assertEquals(false, c2 == null);
        assertEquals(true, c1 == c2);
    }

    @Test
    public void testAdd() {
        System.out.println("add");
        Component component = null;
        Circuit c = Circuit.getCircuit();
        c.add(new Resistor(1,2,5.0));
        c.add(new VoltageSource(2,0,3.0));
        assertEquals(2, c.getSize());
    }
}