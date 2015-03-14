package contactmanager;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

/**
 * This Test class unit tests...
 *
 * @author James Thornton
 */

public class CMTest {
    private Meeting pub;
    private Meeting home;
    private Meeting skiing;
    private Contact James;
    private Contact Julie;
    private Contact John;
    private Contact Jess;

    private Set<Contact> contacts = new HashSet<Contact>();
    private Calendar futureMeetingDate = new GregorianCalendar(2015, 6, 1);
    private Calendar pastMeetingDate = new GregorianCalendar(2015, 2, 1);
    private Set<Contact> pubContacts = new HashSet<Contact>();
    private Set<Contact> homeContacts = new HashSet<Contact>();
    private Set<Contact> skiingContacts = new HashSet<Contact>();
    private ContactManagerImpl cm;

    @Before
    public void setUp() throws Exception {

        James = new ContactImpl(0, "James", "is the first contact");
        Julie = new ContactImpl(1, "Julie", "is the second contact");
        John = new ContactImpl(2, "John", "is the third contact");
        Jess = new ContactImpl(3, "Jess", "is a cat");


        pubContacts.add(James);
        pubContacts.add(Julie);
        pubContacts.add(John);

        //homeContacts.addAll(contacts);
        homeContacts.add(James);
        homeContacts.add(Julie);
        homeContacts.add(John);
        homeContacts.add(Jess);

        skiingContacts.add(James);
        skiingContacts.add(Julie);

        pub = new MeetingImpl(0, pastMeetingDate, pubContacts);
        skiing = new MeetingImpl(1, pastMeetingDate, skiingContacts);
        home = new MeetingImpl(2, futureMeetingDate, homeContacts);
        cm = new ContactManagerImpl();

    }
    @Test
    public void testAddFutureMeeting() {
        cm.addFutureMeeting(homeContacts, futureMeetingDate);
        assertEquals(home, cm.getFutureMeetingList(futureMeetingDate));
    }

    @Test
    public void testGetPastMeeting() {
        assertEquals(pub, cm.getPastMeeting(0));
    }

    @Test
    public void testGetFutureMeeting() {
        assertEquals(home, cm.getFutureMeeting(2));
    }

    @Test
    public void testGetMeeting() {
        assertEquals(home, cm.getMeeting(2));
    }

    @Test
    public void testGetFutureMeetingList() {
        List<Meeting> futureMeeting = null;
        futureMeeting.add(home);
        assertEquals(futureMeeting, cm.getFutureMeetingList(futureMeetingDate));
    }

    @Test
    public void testGetPastMeetingList() {
        List<Meeting> pastMeeting = null;
        pastMeeting.add(pub);
        pastMeeting.add(skiing);
        assertEquals(pastMeeting, cm.getFutureMeetingList(futureMeetingDate));
    }

    @Test
    public void testAddNewPastMeeting() {
        cm.addNewPastMeeting(skiingContacts, pastMeetingDate, "a previous holiday");
        assertEquals("a previous holiday", cm.getPastMeeting(3).getNotes());
    }

    @Test
    public void testAddMeetingNotes() {
        cm.addNewPastMeeting(pubContacts, pastMeetingDate, "");
        cm.addMeetingNotes(0, "a good beer");
        assertEquals("a good beer", cm.getPastMeeting(0).getNotes());

    }

    @Test
    public void testAddNewContact() {
        cm.addNewContact("Pauline", "");
        Contact Pauline = new ContactImpl(3, "Pauline", "");
        assertEquals(Pauline.getName() , cm.getContacts("Pauline"));
    }

    @Test
    public void testGetContacts() {
        assertEquals(James, cm.getContacts("James"));
    }

    @Test
    public void testFlush() {

    }
}
