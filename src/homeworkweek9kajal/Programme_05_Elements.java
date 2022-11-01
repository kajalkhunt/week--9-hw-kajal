package homeworkweek9kajal;

import java.util.ArrayList;
import java.util.Iterator;

//. Write a Java program to iterate through all elements in an array list using
//Iterator.
public class Programme_05_Elements {

    public static void main(String[] args) {
        Programme_05_Elements obj = new Programme_05_Elements();
        obj.arrayList();
    }
    public void arrayList() {
        ArrayList<String> element = new ArrayList<String>();
        element.add("Helium");
        element.add("Hydrogen");
        element.add("Lithium");
        element.add("Carbon");
        element.add("Nitrogen");
        element.add("Oxygen");
        Iterator itr=element.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    }
