import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;
public class WordCount {
    public static void main(String[] args) throws FileNotFoundException {
        Map<String, Integer> wordCounts = new HashMap<>();
        File alice = new File("alice.txt"); // gets file
        Scanner fileLineScanner = new Scanner(alice); // loads text into scanner

        while(fileLineScanner.hasNextLine() == true) {
            String line = fileLineScanner.nextLine();
            Scanner wordScanner = new Scanner(line);
            String word = wordScanner.next();
            if(wordCounts.containsKey(word) == false) {
                wordCounts.put(word, 1);
            }
             else if (wordCounts.containsKey(word) == true){
                wordCounts.put(word, wordCounts.get(word) + 1);
            }

        }
        System.out.println(wordCounts.values()); // prints out first line in alice.txt, feel free to change or delete anything!
        // Probably want to scan by lines first and then scanner each string with a different scanner...
        // A hashmap might also be very useful in this project...
    }
}
