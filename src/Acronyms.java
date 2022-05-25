import java.util.*;

public class Acronyms {
    public static void main(String args[]){

    }

    public static Map<String, List<List<String>>> acronyms(Set<List<String>> setOfLists) {
        Map<String, List<List<String>>> result = new TreeMap<>();
        Iterator<List<String>> iterator = setOfLists.iterator();
                while(iterator.hasNext()) {
                    List<String> crr = iterator.next();
                    String currAcronym = "";
                    for(int i = 0; i < crr.size(); i++) {
                        String word = crr.get(i);
                        char firstChar = word.charAt(0);
                        currAcronym += firstChar;
                    }
                    currAcronym = currAcronym.toUpperCase();
                    if(result.containsKey(currAcronym)) {
                        // AD = [[attention, deficit]]
                        List<List<String>> newValue = result.get(currAcronym);
                        newValue.add(crr);
//                        result.put(currAcronym, newValue);
                    }
                    else {
                        List<List<String>> newValue = new ArrayList<>();
                        newValue.add(crr);
                        result.put(currAcronym, newValue );
                    }
                }
        return result;
    }
    }

