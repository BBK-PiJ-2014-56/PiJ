package contactmanager;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

/**
 * Created by James Thornton
 */
public class DataIO {

    private final File contactsFile = new File("contacts.txt");
    final static Charset ENCODING = StandardCharsets.UTF_8;

    public DataIO() {
        if (contactsFile.isFile()) {
            readFile();
        }
        Path path = Paths.get("contacts.txt");
//        ReadWithScanner parser = new ReadWithScanner("C:\\Temp\\test.txt");
//        parser.processLineByLine();
//        log("Done.");
    }

    private void readFile() {
        try (Scanner fileReader = new Scanner(contactsFile)) {
            while (fileReader.hasNextLine()) {
                //Readline
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }


    /**
     Constructor.
     @param aFileName full name of an existing, readable file.
     */
//    public ReadWithScanner(String aFileName){
//        fFilePath = Paths.get(aFileName);
//    }
//
//
//    /** Template method that calls {@link #processLine(String)}.  */
//    public final void processLineByLine() throws IOException {
//        try (Scanner scanner =  new Scanner(fFilePath, ENCODING.name())){
//            while (scanner.hasNextLine()){
//                processLine(scanner.nextLine());
//            }
//        }
//    }

    /**
     Overridable method for processing lines in different ways.

     <P>This simple default implementation expects simple name-value pairs, separated by an
     '=' sign. Examples of valid input:
     <tt>height = 167cm</tt>
     <tt>mass =  65kg</tt>
     <tt>disposition =  "grumpy"</tt>
     <tt>this is the name = this is the value</tt>
     */
    protected void processLine(String aLine){
        //use a second Scanner to parse the content of each line
        Scanner scanner = new Scanner(aLine);
        scanner.useDelimiter("=");
        if (scanner.hasNext()){
            //assumes the line has a certain structure
            String name = scanner.next();
            String value = scanner.next();
            log("Name is : " + quote(name.trim()) + ", and Value is : " + quote(value.trim()));
        }
        else {
            log("Empty or invalid line. Unable to process.");
        }
    }

    public void writeFile(List<Contact> contactData, List<Meeting> meetingData) {
        Path path = Paths.get("contacts.txt");
        try (Scanner scanner = new Scanner(path, String.valueOf(ENCODING))){
            try (BufferedWriter writer = Files.newBufferedWriter(path, ENCODING)){
                for(Contact c : contactData){
                    writer.write(c.getId() + "," + c.getName() + "," + c.getNotes());
                    writer.newLine();
                }
                for(Meeting m : meetingData){
                    writer.write(m.getId() + "," + m.getContacts() + "," + m.getDate());
                        //if date is in the past get notes
                        if ((Calendar.getInstance().compareTo(m.getDate())<0))
                            //writer.write(m.getNotes);
                    writer.newLine();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // PRIVATE
    //private final Path fFilePath;
    //private final static Charset ENCODING = StandardCharsets.UTF_8;

    private static void log(Object aObject){
        System.out.println(String.valueOf(aObject));
    }

    private String quote(String aText){
        String QUOTE = "'";
        return QUOTE + aText + QUOTE;
    }
}

