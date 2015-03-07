package contactmanager;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This Test class unit tests...
 *
 * @author James Thornton
 */

public class CMTest {

    public static void main(String[] args) throws Exception {
        Contact c = new ContactImpl(0, "James", "is the first contact");
        ContactManager cm = new ContactManagerImpl();


    }

    @Test
    public void getMeeting() {
        assertEquals(0, 0);
    }
}
