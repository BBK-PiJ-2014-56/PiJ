package contactmanager;

import java.util.*;

/**
 * Created by jimjohn_thornton on 07/03/15.
 */
public class ContactManagerImpl implements ContactManager{

    private Set<Contact> contacts;
    private List<Meeting> futureMeetingList;
    private List<Meeting> meetings;
    private List<PastMeeting> pastMeetings;
    private Contact newContact;
    private int meetingNo;

    public ContactManagerImpl() {
        this.contacts = new HashSet<Contact>();
        this.futureMeetingList = new LinkedList<Meeting>();
        this.meetings = new LinkedList<Meeting>();
        this.pastMeetings = new LinkedList<PastMeeting>();
        this.meetingNo = 0;
    }

    @Override
    public int addFutureMeeting(Set<Contact> contacts, Calendar date) {
        futureMeetingList.add(new MeetingImpl(meetingNo, date, contacts));
        meetingNo++;
        return meetingNo;
    }

    @Override
    public PastMeeting getPastMeeting(int id) {
        return null;
    }

    @Override
    public FutureMeeting getFutureMeeting(int id) {
        return null;
    }

    @Override
    public Meeting getMeeting(int id) {
        return null;
    }

    @Override
    public List<Meeting> getFutureMeetingList(Contact contact) {
        return null;
    }

    @Override
    public List<Meeting> getFutureMeetingList(Calendar date) {
        return null;
    }

    @Override
    public List<PastMeeting> getPastMeetingList(Contact contact) {
        return null;
    }

    @Override
    public void addNewPastMeeting(Set<Contact> contacts, Calendar date, String text) {

    }

    @Override
    public void addMeetingNotes(int id, String text) {

    }

    @Override
    public void addNewContact(String name, String notes) {
        Contact contact = new ContactImpl(contacts.size(), name, notes);
        contacts.add(contact);
    }

    @Override
    public Set<Contact> getContacts(int... ids) {
        Set<Contact> subsetOfContacts = new HashSet<Contact>();
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
    }

    @Override
    public void flush() {

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
