package labs.lab7;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CarTest {
    
    public CarTest() {
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
    public void testIsAutomatic() {
        System.out.println("isAutomatic");
        Car automaticCar = new Car("ABC123", "Toyota Corolla", 2025, true);
        Car manualCar = new Car("ABC123", "Toyota Corolla", 2025, false);
        assertEquals(true, automaticCar.isAutomatic());
        assertEquals(false, manualCar.isAutomatic());
    }

    @Test
    public void testCalculateRentalPrice_int() {
        System.out.println("calculateRentalPriceInt");
        Car automaticCar = new Car("ABC123", "Toyota Corolla", 2025, true);
        Car manualCar = new Car("ABC123", "Toyota Corolla", 2025, false);
        assertEquals(65.0, automaticCar.calculateRentalPrice(1), 0.0001);
        assertEquals(55.0, manualCar.calculateRentalPrice(1), 0.0001);
    } 
}
