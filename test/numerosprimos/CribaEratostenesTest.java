/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package numerosprimos;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lucia
 */
public class CribaEratostenesTest {
    
    public CribaEratostenesTest() {
    }

    /**
     * Test of generarPrimos method, of class CribaEratostenes.
     */
    @Test
    public void testGenerarPrimos() {
        System.out.println("generarPrimos");
        int max = 100;
        int[] expResult = null;
        int[] result = CribaEratostenes.generarPrimos(100);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }    
}
