import org.junit.*;
import static org.junit.Assert.*;
public class AddTest {
	@Test
	public void testsAdd() {
		int a = 2
		int b = 3
		int expected = 5
		int output = Add(a,b);
		assertEquals(output, expected);
	}
}