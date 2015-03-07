package contactmanager;

import org.junit.Before;
import org.junit.Test;

public class PastMeetingTest {

    private Meeting m;
    private ContactManager cm;
    @Before
    public void setUp() throws Exception {
        //m = new MeetingImpl("James", 1, 25/02/15);
        cm = new ContactManagerImpl();
        cm.addMeetingNotes(1, "Birthday");
    }

    @Test
    public void testGetNotes() throws Exception {
        //assertEquals("Birthday", m.getNotes());
    }
}