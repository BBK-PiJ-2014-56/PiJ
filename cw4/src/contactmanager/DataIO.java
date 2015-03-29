package contactmanager;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Consumer;

/**
 * Created by James Thornton
 */
public class DataIO {

    private final File contactsFile = new File("contacts.txt");
    final static Charset ENCODING = StandardCharsets.UTF_8;
    private final SimpleDateFormat simpleDate = new SimpleDateFormat("dd.MM.yyyy");

    public DataIO() throws IOException {
        System.out.println("1");
        if (contactsFile.isFile()) {
            System.out.println("2");
            readFile();
        } else {
            System.out.println("3");
            //contactsFile.createNewFile();
            readFile();
        }
//        Path path = Paths.get("contacts.txt");
//        log("Done.");
    }

    public void readFile() {

        // The name of the file to open.
        String fileName = "contacts.txt";

        // This will reference one line at a time
        String line;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader =
                    new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // Always close files.
            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            fileName + "'");
        }
        catch(IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }


//        try (Scanner fileReader = new Scanner(contactsFile)) {
//            while (fileReader.hasNextLine()) {
//                //Readline
//                processLine(fileReader.nextLine());
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

    }


    /**
     Constructor.
     @param aFileName full name of an existing, readable file.
     */
//    public DataIO(String aFileName){
//        fFilePath = Paths.get(aFileName);
//    }


    /** Template method that calls {@link #processLine(String)}.  */
//    public final void processLineByLine() throws IOException {
//        try (Scanner scanner =  new Scanner(contactsFile, ENCODING.name())){
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
//    protected void processLine(String aLine){
//        //use a second Scanner to parse the content of each line
//        Scanner scanner = new Scanner(aLine);
//        scanner.useDelimiter("=");
//        if (scanner.hasNext()){
//            //assumes the line has a certain structure
//            String name = scanner.next();
//            String value = scanner.next();
//            log("Name is : " + quote(name.trim()) + ", and Value is : " + quote(value.trim()));
//        }
//        else {
//            log("Empty or invalid line. Unable to process.");
//        }
//    }

    public void writeFile(Set<Contact> contactData, List<Meeting> meetingData) {
        Path path = Paths.get("contacts.txt");
        try (Scanner scanner = new Scanner(path, String.valueOf(ENCODING))){
            try (BufferedWriter writer = Files.newBufferedWriter(path, ENCODING)){
                for(Contact c : contactData){
                    writer.write("ContactID: " + c.getId() + "," + c.getName() + "," + c.getNotes());
                    writer.newLine();
                }

                for(Meeting m : meetingData){
                    String meetingContactsByID = "";
                    for(Contact c : m.getContacts()){
                        meetingContactsByID = meetingContactsByID + "," + c.getId();
                    }
                    writer.write("MeetingID: " + m.getId() + ", meetingContactIDs" + meetingContactsByID + "," + simpleDate.format(m.getDate().getTime()) + " ");
                    writer.newLine();
                        //if date is in the past get notes
                        if ((Calendar.getInstance().compareTo(m.getDate())>0)) {
                            writer.write(((PastMeeting) m).getNotes());
                        }
                            //writer.newLine();
                            //writer.write(m.getNotes);
                    //writer.newLine();
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

