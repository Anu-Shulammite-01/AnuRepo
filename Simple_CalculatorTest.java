import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class Simple_CalculatorTest {
    @Test
    void twoplustwoequalfour() {
        var sc = new Simple_Calculator();
        assertEquals(4,sc.add(2,2));
    }
    @Test
    void oneminusoneequalszero(){
        var sc=new Simple_Calculator();
        assertEquals(0,sc.subtract(1,1));
    }
    @Test
    void twomultiplythreeequalssix(){
        var sc = new Simple_Calculator();
        assertEquals(6,sc.multiply(3,2));
    }
    @Test
    void ninedividebythreeequalsthree(){
        var sc = new Simple_Calculator();
        assertEquals(3,sc.divide(9,3));
    }
    @Test
    void zeroThrowsException(){
        var sc = new Simple_Calculator();
        assertThrows(ArithmeticException.class,()->{
            sc.divide(5, 0);
        });   
        
    }
}
