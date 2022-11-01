package homeworkweek9kajal;
//Create a HashMap object called people that will store String keys and Integer
//values: And use for each loop to iterate the value from Map.

import java.util.*;

public class Programme_09_People {

    public static void main(String[] args) {
        Programme_09_People obj = new Programme_09_People();
        obj.person();
    }
    public void person() {
        Map<String, Integer> persons = new HashMap<String, Integer>();
        persons.put("Andy ", 1);
        persons.put("Brian ", 2);
        persons.put("Charlie", 3);
        persons.put("Dan", 4);

        for (Map.Entry<String, Integer> entry : persons.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(value + " = " + key);
        }
    }
}