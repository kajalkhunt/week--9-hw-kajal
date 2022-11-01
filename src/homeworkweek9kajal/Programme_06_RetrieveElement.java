package homeworkweek9kajal;

import java.util.ArrayList;
import java.util.Scanner;

public class Programme_06_RetrieveElement {
    //Write a Java program to retrieve an element (at a specified index) from a given array list
    public static void main(String[] args) {
        Programme_06_RetrieveElement obj = new Programme_06_RetrieveElement();
        obj.specifiedIndex();
    }

    public void specifiedIndex() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Red");
        list.add("Blue");
        list.add("Pink");
        list.add("Yellow");
        list.add("Purple");

        System.out.println(list);
        System.out.println("Please enter index ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a < 0 || a > 4) {
            System.out.println("Nothing to return at index " + a);
        } else {
            String element = list.get(a);
            System.out.println("Element at index " + a + " " + element);

        }
    }
}



