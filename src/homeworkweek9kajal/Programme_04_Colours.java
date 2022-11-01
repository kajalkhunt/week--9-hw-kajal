package homeworkweek9kajal;

import java.util.ArrayList;

//Write a Java program to create a new array list, add some colours (string) and
//printout the collection using for each loop.
public class Programme_04_Colours {

    public static void main(String[] args) {
        colours1();

    }
    public static void colours1() {
        ArrayList<String> colours = new ArrayList<String>();
        colours.add("Green");
        colours.add("Yellow");
        colours.add("Orange");
        colours.add("Red");
        colours.add("Pink");

        for (String col : colours) {
            System.out.println(col);

        }
    }


}

