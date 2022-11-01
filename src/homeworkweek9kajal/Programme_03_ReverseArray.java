package homeworkweek9kajal;

//Write a Java program to reverse an array of integer values.
public class Programme_03_ReverseArray {

    public static void main(String[] args) {
        Programme_03_ReverseArray obj = new Programme_03_ReverseArray();
        array();

    }

    public static void array() {
        int[] my_array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println("Original Arrays : ");
        for (int i = 0; i < my_array.length; i++) {
            System.out.print(my_array[i] + " ");

        }
        System.out.println();
        System.out.println("Arrays in Reverse Order : ");
        for (int i = my_array.length - 1; i >= 0; i--) {
            System.out.print(my_array[i] + " ");

        }
    }
}