package contactmanager;

import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MeetingTest {
    private Meeting m;
    private ContactImpl James;
    private ContactManager cm;
    private Set<Contact> contacts;
    private Calendar meetingDate = new GregorianCalendar(2015, 6, 1);

    @Before
    public void setUp() throws Exception {
        James = new ContactImpl(1, "James", "");
        contacts.add(James);
        Meeting m = new MeetingImpl(1, meetingDate, contacts);
        //cm = new ContactManagerImpl();
        //cm.addFutureMeeting(James, 01/06/15);
    }

    @org.junit.Test
    public void testGetId() throws Exception {
        assertEquals(1, m.getId());
    }

    @Test
    public void testGetDate() throws Exception {
        assertEquals(meetingDate , m.getDate());
    }

    @Test
    public void testGetContacts() throws Exception {
        assertEquals("James", m.getContacts());
    }
}