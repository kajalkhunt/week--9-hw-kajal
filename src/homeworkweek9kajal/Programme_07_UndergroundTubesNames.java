package homeworkweek9kajal;

import java.util.ArrayList;

//Write a Java program to test an array list is empty or not. Define array list with
//underground tube names
public class Programme_07_UndergroundTubesNames {
    public static void main(String[] args) {
        Programme_07_UndergroundTubesNames obj = new Programme_07_UndergroundTubesNames();
        isUnderGroundTrainLists();
    }
    public static void isUnderGroundTrainLists() {

        ArrayList<String> underGroundTrains = new ArrayList<>();

        System.out.println("Original array list: " + underGroundTrains);
        if (underGroundTrains.isEmpty()) {
            System.out.println("ArrayList is empty");
        }
        underGroundTrains.add("Jubilee Line");
        underGroundTrains.add("Victoria Line");
        underGroundTrains.add("Bakerloo Line");
        underGroundTrains.add("Metropolitan Line");
        underGroundTrains.add("Northern Line");
        underGroundTrains.add("Central Line");
        underGroundTrains.add("District Line");
        underGroundTrains.add("Elizabeth Line");

        System.out.println("Udated ArrayList: " + underGroundTrains);
        System.out.println("ArraList is not empty");


    }
}




