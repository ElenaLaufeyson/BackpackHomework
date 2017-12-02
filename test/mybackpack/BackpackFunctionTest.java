package mybackpack;

import org.junit.*;
import static org.junit.Assert.*;

public class BackpackFunctionTest {
    
    @Test
    public void testFunction01() {
        System.out.println("function01");
        int[] w1 = {2, 3, 4};
        int[] c1 = {5, 7, 6};
        int L1 = 6;
        int[] w2 = {2, 9, 4, 1};
        int[] c2 = {5, 10, 7, 2};
        int L2 = 12;
        BackpackFunction fun1 = new BackpackFunction();
        int expResult1 = 12;
        int result1 = fun1.function01(w1, c1, L1);
        int expResult2 = 17;
        int result2 = fun1.function01(w2, c2, L2);
        assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
    }    
}
