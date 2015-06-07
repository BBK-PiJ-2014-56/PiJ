package Exam2014;

/**
 * Created by jimjohn_thornton on 06/06/15.
 */
public class WordPuzzle {
    public boolean isValidPair (String oldString, String newString) {
        if (isWord(newString)) {
            if (oldString.length() == newString.length()) {
                int differences = 0;
                for (int x=0; x<newString.length(); x++) {
                    if (oldString.charAt(x)!=newString.charAt(x)) {
                        differences++;
                    }
                }
                if (differences==1)
                    return true;
            }
        }
        return false;
    }

    public boolean isWord(String str) {
        return true;
    }
}
