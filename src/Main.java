//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.LinkedList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        //each student object stored in a linked list
        LinkedList<Student> studentData = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String addAnother = "yes";

        try {
            //Loop that prompts user for student data
            while (addAnother.equalsIgnoreCase("yes")) {

                System.out.println("ENTER STUDENT INFORMATION");
                System.out.print("Name: ");
                String name = scanner.nextLine();

                System.out.print("Address: ");
                String address = scanner.nextLine();

                System.out.print("GPA: ");
                double GPA = scanner.nextDouble();
                scanner.nextLine();

                studentData.add(new Student(name, address, GPA));

                System.out.print("Do you have a student to add (yes/no)? ");
                addAnother = scanner.nextLine();
            }
        } catch (IllegalArgumentException | IllegalAccessException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();

        //Sort linkedList by name in ascending order
        Collections.sort(studentData, Comparator.comparing(Student::getName));

        //Output student data
/*        System.out.println("\nSTUDENT INFORMATION: ");
        for (Student student : studentData) {
            System.out.println("\nName: " + student.getName() + "\nAddress: " + student.getAddress() +
                    "\nGPA: " + student.getGPA());
        }
*/
        System.out.println("\nSTUDENT INFO SUCCESSFULLY WRITTEN TO FILE: outputContents.txt");

        writeToFile("outputContents.txt", studentData);
    }

    //Also output student data to a regular text file
    private static void writeToFile(String file, LinkedList<Student> studentData) throws IOException {
        FileWriter writer = new FileWriter(file);
        writer.write("STUDENT INFORMATION:\n");
        for (Student student : studentData) {
            writer.write("\nName: " + student.getName() + "\nAddress: " + student.getAddress() +
                    "\nGPA: " + student.getGPA() + "\n");
        }
        writer.close();

    }
}


