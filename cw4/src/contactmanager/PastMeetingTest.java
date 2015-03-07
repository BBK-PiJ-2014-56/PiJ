package contactmanager;

import org.junit.Before;

public class PastMeetingTest {

    @Before
    public void setUp() throws Exception {
        Meeting m = new MeetingImpl(James, 1, 25/02/15);
        ContactManager cm = new ContactManagerImpl();
        cm.addMeetingNotes(1, "Birthday");
    }

    @org.junit.Test
    public void testGetNotes() throws Exception {
        assertEquals("Birthday", m.getNotes());
    }
}