package contactmanager;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
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

    private Set<Contact> contacts = new HashSet<>();
    private Calendar futureMeetingDate = new GregorianCalendar(2015, 6, 1);
    private Calendar pastMeetingDate = new GregorianCalendar(2015, 2, 1);
    private Set<Contact> pubContacts = new HashSet<>();
    private Set<Contact> homeContacts = new HashSet<>();
    private Set<Contact> skiingContacts = new HashSet<>();
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

        pub = new PastMeetingImpl(0, pastMeetingDate, pubContacts, "");
        skiing = new PastMeetingImpl(1, pastMeetingDate, skiingContacts, "Awesome holiday!");
        home = new FutureMeetingImpl(2, futureMeetingDate, homeContacts);
        cm = new ContactManagerImpl();

    }
    @Test
    public void testAddFutureMeeting() {
        //assertEquals(null, cm.getFutureMeetingList(James));
        cm.addFutureMeeting(homeContacts, futureMeetingDate);
        assertEquals(homeContacts, cm.getMeeting(0).getContacts());
    }

    @Test
    public void testGetPastMeeting() {
        cm.addNewPastMeeting(pubContacts, pastMeetingDate, "food");
        cm.addNewPastMeeting(homeContacts, pastMeetingDate, "hung out");
        cm.addNewPastMeeting(skiingContacts, pastMeetingDate, "Morzine");
        //cm.addMeetingNotes(1, "hung out");
        assertEquals("food", cm.getPastMeeting(0).getNotes());
        assertEquals("hung out", cm.getPastMeeting(1).getNotes());
        assertEquals("Morzine", cm.getPastMeeting(2).getNotes());
    }

    @Test
    public void testGetFutureMeeting() {
        cm.addFutureMeeting(pubContacts, futureMeetingDate); // , "");
        cm.addFutureMeeting(homeContacts, futureMeetingDate); //, "hung out");
        cm.addFutureMeeting(skiingContacts, futureMeetingDate); //, "went boarding");
        assertEquals(skiingContacts, cm.getFutureMeeting(2).getContacts());
    }

    @Test
    public void testGetMeeting() {
        cm.addNewPastMeeting(pubContacts, pastMeetingDate, "");
        cm.addFutureMeeting(homeContacts, futureMeetingDate); //, "hung out");
        cm.addFutureMeeting(skiingContacts, futureMeetingDate); //, "went boarding");
        assertEquals(pubContacts, cm.getMeeting(0).getContacts());
        assertEquals(homeContacts, cm.getMeeting(1).getContacts());
        assertEquals(skiingContacts, cm.getMeeting(2).getContacts());
    }

    @Test
    public void testGetFutureMeetingList() {
        cm.addNewPastMeeting(pubContacts, pastMeetingDate, "happened in the past");
        cm.addFutureMeeting(pubContacts, futureMeetingDate);
        cm.addFutureMeeting(homeContacts, futureMeetingDate);
        cm.addFutureMeeting(skiingContacts, futureMeetingDate);
        assertEquals(3, cm.getFutureMeetingList(James).size());
        assertEquals(3, cm.getFutureMeetingList(futureMeetingDate).size());

        Calendar futureMeetingDate2 = new GregorianCalendar(2015, 6, 2);
        Calendar pastMeetingDate2 = new GregorianCalendar(2015, 2, 2);
        cm.addFutureMeeting(pubContacts, futureMeetingDate2);
        cm.addFutureMeeting(skiingContacts, futureMeetingDate);
        cm.addNewPastMeeting(homeContacts, pastMeetingDate, "meetingdate1");
        cm.addNewPastMeeting(pubContacts, pastMeetingDate2, "meetingdate2");
        cm.addNewPastMeeting(skiingContacts, pastMeetingDate, "meetingdate1");

        assertEquals(futureMeetingDate, cm.getFutureMeetingList(James).get(0).getDate());
        assertEquals(futureMeetingDate, cm.getFutureMeetingList(James).get(3).getDate());
        assertEquals(futureMeetingDate2, cm.getFutureMeetingList(James).get(4).getDate());
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
//        for(int i;i in .. cm.getContacts(0, 1, 2, 3)){
//            System.out.println(cm.getContacts(i).iterator().next().getName());
//        }

    }

    @Test
    public void testListSorter() {
        Calendar futureMeetingDate2 = new GregorianCalendar(2015, 6, 2);
        Calendar pastMeetingDate2 = new GregorianCalendar(2015, 2, 2);
        cm.addFutureMeeting(skiingContacts, futureMeetingDate);
        cm.addNewPastMeeting(homeContacts, pastMeetingDate, "meetingdate1");
        cm.addNewPastMeeting(pubContacts, pastMeetingDate2, "meetingdate2");
        cm.addFutureMeeting(pubContacts, futureMeetingDate2);
        cm.addNewPastMeeting(skiingContacts, pastMeetingDate, "meetingdate1");

        cm.listSorter();
//        assertEquals(pastMeetingDate, cm.getMeetingList().get(0).getDate());
//        assertEquals(pastMeetingDate, cm.getMeetingList().get(1).getDate());
//        assertEquals(pastMeetingDate2, cm.getMeetingList().get(2).getDate());
//        assertEquals(futureMeetingDate, cm.getMeetingList().get(3).getDate());
//        assertEquals(futureMeetingDate2, cm.getMeetingList().get(4).getDate());
//
//        SimpleDateFormat simpleDate = new SimpleDateFormat("dd.MM.yyyy");
//
//        System.out.println(simpleDate.format(cm.getMeetingList().get(0).getDate().getTime()));



//        assertEquals(pastMeetingDate, cm.getPastMeeting(0).getDate());
//        assertEquals(pastMeetingDate, cm.getPastMeeting(1).getDate());
//        assertEquals(pastMeetingDate2, cm.getPastMeeting(2).getDate());
//        assertEquals(futureMeetingDate, cm.getFutureMeeting(3).getDate());
//        assertEquals(futureMeetingDate2, cm.getFutureMeeting(4).getDate());

    }

    @Test
    public void testFlush() throws IOException {
        System.out.println("test start");
        DataIO testdata = new DataIO();

        System.out.println("test2");

        Set<Contact> contacts = new HashSet<>();
        contacts.add(James);
        contacts.add(Jess);
        contacts.add(John);
        contacts.add(Julie);

        List<Meeting> meetings = new LinkedList<>();
        meetings.add(pub);
        meetings.add(home);
        meetings.add(skiing);

        System.out.println("test 2.5");
        //cm.listSorter();


        testdata.readFile();

        System.out.println("test 3");


        testdata.writeFile(contacts, meetings);
        System.out.println("test 4");
        String firstline = null;
//        Path path = Paths.get("contacts.txt");
//        try (Scanner scanner = new Scanner(path, String.valueOf(ENCODING))){
//        try (Scanner fileReader = new Scanner("contacts.txt")) {
//            firstline = fileReader.nextLine();
//        }
//
//        assertEquals("James", firstline);

    }
}
