import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.*;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1 2
        // 3
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        System.out.println(first+second);
    }

    public static Map<Integer, Integer> counts(List<Integer> list, Set<Integer> set) {
        Map<Integer, Integer> counts = new HashMap<>();
        Iterator<Integer> itr = set.iterator(); // .next() -> next int .hasNext() -> true if there are still ints, false if empty
        while(itr.hasNext() == true) {
            int count = 0;
            int next =  itr.next();
            for(int i = 0; i < list.size(); i++){
                if(next == list.get(i)){
                    count++;
                }
            }
            counts.put(next, count);
        }
        return counts;
    }
}

