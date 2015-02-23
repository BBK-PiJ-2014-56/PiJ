package contactmanager;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContactTest {


    @Before
    public void setUp() throws Exception {
        Contact c = new Contact();
        c.setName("James");
        c.addNotes("");
        c.setID("1");
    }

    @org.junit.Test
    public void testGetId() throws Exception {
        assertEquals(1, c.getID());

    }

    @Test
    public void testGetName() throws Exception {
        assertEquals("James", c.getName());
    }

    @Test
    public void testGetNotes() throws Exception {
        assertEquals("", c.getNotes());
    }

    @Test
    public void testAddNotes() throws Exception {
        assertEquals("", c.getNotes());
        c.AddNotes("loves surfing");
        assertEquals("loves surfing", c.getNotes());
    }
}