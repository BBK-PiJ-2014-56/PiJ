package contactmanager;

import java.io.IOException;
import java.util.*;

/**
 * @author James Thornton
 */
public class ContactManagerImpl implements ContactManager {

    private Set<Contact> contacts;
    private List<Meeting> meetings;
    private int meetingNo;

    public ContactManagerImpl() {
        this.contacts = new HashSet<>();
        this.meetings = new LinkedList<>();
        this.meetingNo = 0;
    }

    @Override
    public int addFutureMeeting(Set<Contact> contacts, Calendar date) {
        Meeting fm = new MeetingImpl(meetingNo, date, contacts);
        meetings.add(fm);
        meetingNo++;
        //System.out.println(meetings.get(0));
        return meetingNo;
    }

    @Override
    public PastMeeting getPastMeeting(int id) {
        Iterator meetingIterator = meetings.iterator();
        PastMeeting currentMeeting;
        while (meetingIterator.hasNext()) {
            currentMeeting = (PastMeetingImpl) meetingIterator.next();
            if (currentMeeting.getId() == id) {
                return currentMeeting;
            }
        }
        return null;
    }

    @Override
    public FutureMeeting getFutureMeeting(int id) {
        FutureMeeting m = new FutureMeetingImpl(id, getMeeting(id).getDate(), getMeeting(id).getContacts());
        if (Calendar.getInstance().compareTo(m.getDate())<=0)
            try{
                return m;
            }catch (ClassCastException ex){
                return null;
            }
        return null;


//        Iterator meetingIterator = meetings.iterator();
//        FutureMeeting currentMeeting;
//        while (meetingIterator.hasNext()) {
//            currentMeeting = (FutureMeeting) meetingIterator.next();
//            currentMeeting.getClass();
//            if (currentMeeting.getId() == id) {
//                return currentMeeting;
//            }
//        }

        /*
        List<Meeting> allfutureMeetings = futurechecker(meetings);
        Iterator meetingIterator = allfutureMeetings.iterator();
        Meeting currentMeeting;
        while (meetingIterator.hasNext()){
            currentMeeting = (Meeting) meetingIterator.next();
            if (currentMeeting.getId()==id){

                //return currentMeeting;
            }
        }
        return null;
        */
    }

    @Override
    public Meeting getMeeting(int id) {
        return meetings.get(id);
    }

    @Override
    public List<Meeting> getFutureMeetingList(Contact contact) {
        listSorter();
        List<Meeting> futureMeetings = new LinkedList<>();
        //List<Meeting> allfutureMeetings = futurechecker(meetings);
        //Iterator meetingIterator = allfutureMeetings.iterator();
        Iterator meetingIterator = meetings.iterator();
        Meeting currentMeeting;
        //System.out.println("start");
        while(meetingIterator.hasNext()) {
            currentMeeting = (Meeting) meetingIterator.next();

            //date is today or in the future
            if ((currentMeeting.getDate().compareTo(Calendar.getInstance())>=0)) {
                //System.out.println(currentMeeting.getDate());
                //currentMeeting = (FutureMeeting) meetingIterator.next();
                Contact currentContact;
                Iterator contactIterator = currentMeeting.getContacts().iterator();
                while (contactIterator.hasNext()) {
                    currentContact = (Contact) contactIterator.next();
                    if (currentContact.getName().equals(contact.getName())) {
                        futureMeetings.add(currentMeeting);
                    }
                }
            }
        }
        return futureMeetings;
    }

    @Override
    public List<Meeting> getFutureMeetingList(Calendar date) {
        List<Meeting> futureMeetings = new LinkedList<>();
        //List<Meeting> allfutureMeetings = futurechecker(meetings);
        //Iterator meetingIterator = allfutureMeetings.iterator();
        Iterator meetingIterator = meetings.iterator();
        Meeting currentMeeting;
        //System.out.println("start of futureMeeting by date");
        listSorter();
        while(meetingIterator.hasNext()) {
            currentMeeting = (Meeting) meetingIterator.next();
            if (currentMeeting.getDate().equals(date)) {
                futureMeetings.add(currentMeeting);
            }
        }
        return futureMeetings;
    }

    @Override
    public List<PastMeeting> getPastMeetingList(Contact contact) {
        List<PastMeeting> pastMeetings = new LinkedList<>();
        //List<Meeting> allfutureMeetings = futurechecker(meetings);
        //Iterator meetingIterator = allfutureMeetings.iterator();
        Iterator meetingIterator = meetings.iterator();
        PastMeeting currentMeeting;
        //System.out.println("startPast");
        while(meetingIterator.hasNext()) {
            currentMeeting = (PastMeeting) meetingIterator.next();
            Contact currentContact;
            Iterator contactIterator = currentMeeting.getContacts().iterator();
            while(contactIterator.hasNext()){
                currentContact = (Contact) contactIterator.next();
                if (currentContact.getName().equals(contact.getName())) {
                    pastMeetings.add(currentMeeting);
                }
            }
        }
        return pastMeetings;
    }

    @Override
    public void addNewPastMeeting(Set<Contact> contacts, Calendar date, String text) {
        Meeting m = new PastMeetingImpl(meetingNo, date, contacts, text);
        meetings.add(m);
        meetingNo++;

    }

    @Override
    public void addMeetingNotes(int id, String text) {
        getPastMeeting(id).addNotes(text);
        //PastMeeting pm = new PastMeetingImpl(id, getPastMeeting(id).getDate(), getPastMeeting(id).getContacts(), text);

    }

    @Override
    public void addNewContact(String name, String notes) {
        Contact contact = new ContactImpl(contacts.size(), name, notes);
        contacts.add(contact);
    }

    @Override
    public Set<Contact> getContacts(int... ids) {
        Set<Contact> subsetOfContacts = new HashSet<>();
        Iterator i = contacts.iterator();
        Contact currentContact;
        while(i.hasNext()) {
            currentContact = (Contact) i.next();
            for (int id : ids) {
                if (currentContact.getId() == id) {
                    subsetOfContacts.add(currentContact);
                }
            }
        }
        return subsetOfContacts;
    }

    @Override
    public Set<Contact> getContacts(String name) {
        Set<Contact> subsetOfContacts = new HashSet<>();
        Iterator i = contacts.iterator();
        Contact currentContact;
        while(i.hasNext()) {
            currentContact = (Contact) i.next();
            if (currentContact.getName().equals(name)) {

                subsetOfContacts.add(currentContact);
            }
        }
        return subsetOfContacts;
    }

    @Override
    public void flush() throws IOException {
        listSorter();
        DataIO writer = new DataIO();
        writer.writeFile(contacts, meetings);
    }
    /*
    private List<Meeting> pastchecker(List<Meeting> meetings) {
        List<Meeting> pastMeetings = new LinkedList<Meeting>();
        Iterator meetingIterator = meetings.iterator();
        Meeting currentMeeting;
        while (meetingIterator.hasNext()){
            currentMeeting = (Meeting) meetingIterator.next();
            if (Calendar.getInstance().after(currentMeeting.getDate())){
                pastMeetings.add(currentMeeting);
            }
        }
        return pastMeetings;
    }
    private List<Meeting> futurechecker(List<Meeting> meetings) {
        List<Meeting> futureMeetings = new LinkedList<Meeting>();
        Iterator meetingIterator = meetings.iterator();
        Meeting currentMeeting;
        while (meetingIterator.hasNext()){
            currentMeeting = (Meeting) meetingIterator.next();
            if (Calendar.getInstance().before(currentMeeting.getDate())){
                futureMeetings.add(currentMeeting);
            }
        }
        return futureMeetings;
    }
*/

    /**
     * Sorts meetings into order by date
     * @return returns a list of meetings sorted by date
     */
    public List<Meeting> listSorter () {
        for (Meeting meeting : meetings) {
            //System.out.println(meeting.getId());
        }

        //List<Meeting> sortedMeetings = new LinkedList<>();

        Collections.sort(meetings, (m1, m2) -> m1.getDate().compareTo(m2.getDate()));
        /*
        Collections.sort(meetings.) {
            public int compare(MyObject o1, MyObject o2) {
                DateTime a = o1.getDateTime();
                DateTime b = o2.getDateTime();
                if (a.lt(b))
                    return -1;
                else if (a.lteq(b)) // it's equals
                    return 0;
                else
                    return 1;
            }
        });
        Iterator meetingIterator = meetings.iterator();
        Meeting currentMeeting;
        while (meetingIterator.hasNext()){
            currentMeeting = (Meeting) meetingIterator.next();

        }
        */
    //}
        List<Meeting> sortedPastMeetings = new LinkedList<>();
        List<Meeting> sortedFutureMeetings = new LinkedList<>();
        for (Meeting meeting : meetings) {
            //System.out.println(meeting.getId());
            //System.out.println(meetings.get(i).getDate().compareTo(Calendar.getInstance()));
            //if date is in the past
            if (meeting.getDate().compareTo(Calendar.getInstance()) < 0) {
                sortedPastMeetings.add(meetingNowInPast(meeting));
                //PastMeeting pm = new PastMeetingImpl(meetings.get(i).getId(), meetings.get(i).getDate(), meetings.get(i).getContacts(), "");

            } else {
                //sortedFutureMeetings.add(meetingInTheFuture(meetings.get(i)));
                FutureMeeting fm = new FutureMeetingImpl(meeting.getId(), meeting.getDate(), meeting.getContacts());
                sortedFutureMeetings.add(fm);
                //futureMeetingList.add((FutureMeeting)meetings.get(i));
            }
        }
        for (Meeting sortedFutureMeeting : sortedFutureMeetings) {
            sortedPastMeetings.add(sortedFutureMeeting);
        }
        //meetings = sortedPastMeetings;
        return sortedPastMeetings;
    }
    public PastMeeting meetingNowInPast(Meeting m) {
        return new PastMeetingImpl(m.getId(), m.getDate(), m.getContacts(), "");
    }
    /*
    public FutureMeeting meetingInTheFuture(Meeting m) {
        FutureMeeting fm = new FutureMeetingImpl(m.getId(), m.getDate(), m.getContacts());
        return fm;
    }
    */
    public List<Meeting> getMeetingList() {
        return meetings;
    }

    /*
    private Set<Contact> contactSubsetGenerator() {
        Set<Contact> subsetOfContacts = new HashSet<Contact>();
        Iterator i = contacts.iterator();
        Contact currentContact;
        while(i.hasNext()) {
            currentContact = (Contact) i.next();
            if (currentContact.getName().equals(name)) {

                subsetOfContacts.add(currentContact);
            }
        }
        return subsetOfContacts;
    }*/
}
