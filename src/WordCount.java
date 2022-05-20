import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;
public class WordCount {
    public static void main(String[] args) throws FileNotFoundException {
        File alice = new File("alice.txt"); // gets file
        Scanner fileLineScanner = new Scanner(alice); // loads text into scanner
        System.out.println(fileLineScanner.nextLine()); // prints out first line in alice.txt, feel free to change or delete anything!
        // Probably want to scan by lines first and then scanner each string with a different scanner...
        // A hashmap might also be very useful in this project...
    }
}
