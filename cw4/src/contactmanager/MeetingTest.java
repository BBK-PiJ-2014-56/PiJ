package contactmanager;

import org.junit.Before;
import org.junit.Test;

public class MeetingTest {
    private Meeting m;
    private Contact James;
    private ContactManager cm;

    @Before
    public void setUp() throws Exception {
        //Meeting m = new MeetingImpl(James, 1, 01/06/15);
        James = new ContactImpl(1, "James", "");
        cm = new ContactManagerImpl();
        //cm.addFutureMeeting(James, 01/06/15);
    }

    @org.junit.Test
    public void testGetId() throws Exception {
        //assertEquals(1, m.getID());
    }

    @Test
    public void testGetDate() throws Exception {
        //assertEquals(01 / 06 / 15, m.getDate());
    }

    @Test
    public void testGetContacts() throws Exception {
        //assertEquals("James", m.GetContacts());
    }
}