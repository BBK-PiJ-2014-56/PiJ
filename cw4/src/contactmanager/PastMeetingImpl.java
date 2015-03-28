package contactmanager;

import java.util.Calendar;
import java.util.Set;

/**
 * Created by jimjohn_thornton on 07/03/15.
 */
public class PastMeetingImpl implements PastMeeting {

    private int id;
    private Set<Contact> contacts;
    private Calendar calendar;
    private String notes;

    public PastMeetingImpl(int id, Calendar calendar, Set<Contact> contacts, String notes) {
        this.id = id;
        this.contacts = contacts;
        this.calendar = calendar;
        this.notes = notes;
    }

    @Override
    public String getNotes() {
        return notes;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public Calendar getDate() {
        return calendar;
    }

    @Override
    public Set<Contact> getContacts() {
        return contacts;
    }

    public void addNotes(String note){
        this.notes = notes + note;
    }
}
