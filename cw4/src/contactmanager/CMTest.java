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
        //assertEquals(null, cm.getFutureMeetingList(James).size());
        cm.addFutureMeeting(homeContacts, futureMeetingDate);
        assertEquals(homeContacts, cm.getFutureMeeting(0).getContacts());
    }

    @Test
    public void testGetPastMeeting() {
        cm.addNewPastMeeting(pubContacts, pastMeetingDate, "");
        cm.addNewPastMeeting(homeContacts, pastMeetingDate, "hung out");
        cm.addNewPastMeeting(skiingContacts, pastMeetingDate, "");
        //cm.addMeetingNotes(1, "hung out");
        assertEquals("hung out", cm.getPastMeeting(1).getNotes());
    }

    @Test
    public void testGetFutureMeeting() {
        cm.addFutureMeeting(pubContacts, futureMeetingDate); // , "");
        cm.addFutureMeeting(homeContacts, futureMeetingDate); //, "hung out");
        cm.addFutureMeeting(skiingContacts, futureMeetingDate); //, "went boarding");
        //System.out.println("id is "+cm.getFutureMeeting(2).getId());
        assertEquals(skiingContacts, cm.getFutureMeeting(2).getContacts());
    }

    @Test
    public void testGetMeeting() {
        cm.addNewPastMeeting(pubContacts, pastMeetingDate, "");
        cm.addFutureMeeting(homeContacts, futureMeetingDate); //, "hung out");
        cm.addFutureMeeting(skiingContacts, futureMeetingDate); //, "went boarding");
        //System.out.println("id is "+cm.getFutureMeeting(2).getId());
        assertEquals(skiingContacts, cm.getMeeting(2).getContacts());
    }

    @Test
    public void testGetFutureMeetingList() {
        System.out.println("Start");
        cm.addFutureMeeting(pubContacts, futureMeetingDate);
        cm.addFutureMeeting(homeContacts, futureMeetingDate);
        cm.addFutureMeeting(skiingContacts, futureMeetingDate);
        System.out.println("id is "+cm.getFutureMeeting(2).getId());
        System.out.println(cm.futureMeetingList.get(0).getId());
        System.out.println(cm.futureMeetingList.get(1).getId());
        System.out.println(cm.futureMeetingList.get(2).getId());
        //System.out.println(cm.getFutureMeetingList(James).get(0).getId());
        assertEquals(3, cm.getFutureMeetingList(James).size());
        //assertEquals(3, cm.getFutureMeetingList(futureMeetingDate).size());

    }

    @Test
    public void testGetPastMeetingList() {

        cm.addNewPastMeeting(pubContacts, pastMeetingDate, "");
        cm.addNewPastMeeting(homeContacts, pastMeetingDate, "hung out");
        cm.addNewPastMeeting(skiingContacts, pastMeetingDate, "");
        assertEquals(3, cm.getPastMeetingList(James).size());
        assertEquals(1, cm.getPastMeetingList(Jess).size());
    }

    @Test
    public void testAddNewPastMeeting() {
        cm.addNewPastMeeting(skiingContacts, pastMeetingDate, "a previous holiday");
        assertEquals("a previous holiday", cm.getPastMeeting(0).getNotes());
    }

    @Test
    public void testAddMeetingNotes() {
        cm.addNewPastMeeting(pubContacts, pastMeetingDate, "");
        cm.addMeetingNotes(0, "a good beer");
        assertEquals("a good beer", cm.getPastMeeting(0).getNotes());

    }

    @Test
    public void testAddNewContact() {
        assertEquals(0, cm.getContacts("Pauline").size());
        cm.addNewContact("Pauline", "");
        assertEquals(1, cm.getContacts("Pauline").size());
        //Contact Pauline = new ContactImpl(1, "Pauline", "");
        //assertEquals(Pauline.getName() , cm.getContacts("Pauline"));
    }

    @Test
    public void testGetContacts() {
        cm.addNewContact("James", "");
        cm.addNewContact("Julie", "");
        cm.addNewContact("John", "");
        cm.addNewContact("Jess", "");
        cm.addNewContact("James", "");
        cm.addNewContact("James2", "");
        assertEquals(2, cm.getContacts("James").size());
        assertEquals(3, cm.getContacts(0, 2, 3).size());

    }

    @Test
    public void testFlush() {

    }
}
