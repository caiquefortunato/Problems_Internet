import java.util.ArrayList;
import java.util.Collections;

/**
 * Implement the uniqueNames method. When passed two arrays of names, 
 * it will return an array containing the names that appear in either or both arrays. 
 * The returned array should have no duplicates.

* @author Caíque Fortunato
 */
public class MergeNames {
    
    public static String[] uniqueNames(String[] names1, String[] names2) {
       ArrayList<String> allNames = new ArrayList();
       
        for (String names11 : names1) 
            if (!allNames.contains(names11)) 
                allNames.add(names11);
        
        for (String names21 : names2) 
            if (!allNames.contains(names21)) 
                allNames.add(names21);
        
        Collections.sort(allNames); 
 
        String[] strings = (String[]) allNames.toArray (new String[0]);
        return strings;
    }
    
    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}
