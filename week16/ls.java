package week16;

import java.io.File;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by jimjohn_thornton on 02/02/15.
 */
public class ls {

    /*public static void getDir() {
        Path dir = Paths.get("./");

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir, "./"))

        {
            for (Path file : stream) {
                System.out.println();
            }
        }
    }*/
    public static void main(String[] args) {
        //System.out.println(getDir())
        //getDir();
        String filename = "./src";
        File file = new File(filename);
        String[] fileArray = file.list();
        for (int i=0; i<fileArray.length; i++) {
            System.out.println(fileArray[i]);
        }

    }
}