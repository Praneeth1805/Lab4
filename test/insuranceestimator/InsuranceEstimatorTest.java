
package insuranceestimator;
import org.junit.Test;
import static org.junit.Assert.*;


public class InsuranceEstimatorTest {
    
    public InsuranceEstimatorTest() {
    }
    
    @Test
    public void testCalculateInsurance() {
        System.out.println("calculateInsurance");
        Integer expResult = 465;
        Integer number = 33;
        Integer result = InsuranceEstimator.calculateInsurance(number);
        assertEquals(expResult, result);
    }

   
}
