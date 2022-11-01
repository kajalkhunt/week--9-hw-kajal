package homeworkweek9kajal;

import java.util.Scanner;

public class Programme_02_MarkSheet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter Student Name             : ");
        String name = scanner.next();
        System.out.print("\nEnter Student Roll Number      : ");
        int rollNum = scanner.nextInt();
        System.out.print("\nEnter Marks of Subject Maths   : ");
        int mathsMarks = scanner.nextInt();
        while (mathsMarks < 0 || mathsMarks > 100) {
            System.out.print("\nInvalid input, Marks should be between 0 to 100");
            System.out.print("\nPlease enter correct marks : ");
            mathsMarks = scanner.nextInt();
        }
        System.out.print("Enter Marks of Subject Science   : ");
        int scienceMarks = scanner.nextInt();
        while (scienceMarks < 0 || scienceMarks > 100) {
            System.out.print("\nInvalid Input, Marks should be between 0 to 100");
            System.out.print("\nPlease enter correct marks : ");
            scienceMarks = scanner.nextInt();
        }
        System.out.print("Enter Marks of Subject English   : ");
        int englishMarks = scanner.nextInt();
        while (englishMarks < 0 || englishMarks > 100) {
            System.out.print("\nInvalid Input, Marks should be between 0 to 100 ");
            System.out.print("\nPlease enter correct marks :  ");
            englishMarks = scanner.nextInt();
        }
        int total = sum(mathsMarks, scienceMarks, englishMarks);
        int percentage = (total * 100) / 300;
        String result = calculateResult(mathsMarks, scienceMarks, englishMarks);
        String grade = calculateGrade(percentage, result);
        printTheMarkSheet(name, rollNum, mathsMarks, scienceMarks, englishMarks, total, percentage, result, grade);
        scanner.close();
    }

    // calculating the sum of all subject marks
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    //calculating the result "Pass or Fail"  on subjects marks
    public static String calculateResult(int mathsMarks, int scienceMarks, int englishMarks) {
        if (mathsMarks < 35 || scienceMarks < 35 || englishMarks < 35) {
            return "Fail";
        } else {
            return "Pass";
        }
    }

    //Calculating the grade on percentage and result
    public static String calculateGrade(int percentage, String result) {
        String grade = null;
        if (result.equalsIgnoreCase("Pass")) {
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage >= 35) {
                grade = "C";
            } else {
                grade = " - ";
            }
        }
        return grade;
    }

    //printing the Marks Sheet
    public static void printTheMarkSheet(String name, int rollNum, int mathsMarks, int scienceMarks, int englishMarks, double total, double percentage, String result, String grade) {
        System.out.println("-------------------------------------|");
        System.out.println("|                                    |");
        System.out.println("|           Mark Sheet               |");
        System.out.println("|____________________________________|");
        System.out.println("|  Name:  " + name + "                         |");
        System.out.println("|  Roll No: " + rollNum + "                        |");
        System.out.println("|____________________________________|");
        System.out.println("|   Subjects: Marks                  |");
        System.out.println("|____________________________________|");
        System.out.println("|  Math: " + mathsMarks + "                          |");
        System.out.println("|  Science: " + scienceMarks + "                       |");
        System.out.println("|  English: " + englishMarks + "                       |");
        System.out.println("|____________________________________|");
        System.out.println("|  Total: " + total + "                      |");
        System.out.println("|____________________________________|");
        System.out.println("|  Percentage: " + percentage + "                  |");
        System.out.println("|  Result: " + result + "                      |");
        System.out.println("|  Grade: " + grade + "                          |");
        System.out.println("|________ ___________________________|");

    }
}
