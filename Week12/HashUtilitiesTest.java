import org.junit.*;
import static org.junit.Assert.*;
import java.util.Random;
public class HashUtilitiesTest {
	@Test
	public void shortHash() {
		Random ranInt = new Random();
		for (int i = 0; i <= 2000; i++) {
		  int input = ranInt.nextInt(1000);
		  int output = HashUtilities.shortHash(input);
		  assertEquals(output, input);
		}
	}
}