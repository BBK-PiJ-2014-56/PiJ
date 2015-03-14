package contactmanager;

import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class PastMeetingTest {

    private Meeting m;
    private ContactManager cm;
    private Contact James;
    private Set<Contact> contacts = new HashSet<Contact>();

    @Before
    public void setUp() throws Exception {
        James = new ContactImpl(1, "James", "Is getting old");
        Calendar meetingDate = new GregorianCalendar(2015, 2, 25);
        m = new PastMeetingImpl(1, meetingDate, contacts);
        cm = new ContactManagerImpl();
        cm.addMeetingNotes(1, "Birthday");
    }

    @Test
    public void testGetNotes() throws Exception {
        assertEquals("Birthday", cm.getPastMeeting(1).getNotes());
    }
}