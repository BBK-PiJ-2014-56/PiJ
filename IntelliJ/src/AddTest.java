/**
 * Created by jthorn05 on 05/01/2015.
 */
import org.junit.*;
import static org.junit.Assert.*;
public class AddTest {
    @Test
    public void testsAdd() {
        int a = 2;
        int b = 3;
        int expected = 5;
        int output = Add.Add(a,b);
        assertEquals(output, expected);
    }
}