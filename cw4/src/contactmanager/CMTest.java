package contactmanager;

import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Set;

/**
 * This Test class unit tests...
 *
 * @author James Thornton
 */

public class CMTest {
    private Meeting m;
    private Contact James;
    private Set<Contact> contacts = new HashSet<Contact>();
    private Calendar meetingDate = new GregorianCalendar(2015, 6, 1);
    ContactManager cm;

    @Before
    public void setUp() throws Exception {

        James = new ContactImpl(0, "James", "is the first contact");
        cm = new ContactManagerImpl();
        m = new MeetingImpl(0, meetingDate, contacts);

    }
    @Test
    public void testAddFutureMeeting() {
        cm.addFutureMeeting(contacts, meetingDate)
    }

    @Test
    public void testGetPastMeeting() {

    }

    @Test
    public void testGetFutureMeeting() {

    }

    @Test
    public void testGetMeeting() {

    }

    @Test
    public void testGetFutureMeetingList() {

    }

    @Test
    public void testGetPastMeetingList() {

    }

    @Test
    public void testAddNewPastMeeting() {

    }

    @Test
    public void testAddMeetingNotes() {

    }

    @Test
    public void testAddNewContact() {

    }

    @Test
    public void testGetContacts() {

    }

    @Test
    public void testFlush() {

    }
}
