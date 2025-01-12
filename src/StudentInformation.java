/*
 *
 * @author kaleyschlimgen
 * Programming 2: Final Program
 *
 * Program Requirements:
 * Program incorporates a loop that prompts user for student data.
 * Student data are private fields in a Student class including:
 *      String name, String address, double GPA
 * Each student object is stored in a linked list
 *
 * After user enters data, contents are output in ascending sorted order
 *   by name to a text file
 *
 * Validate numeric data for GPA
 *
 */

import java.util.LinkedList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;

public class StudentInformation {
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

        System.out.println("\nSTUDENT INFO SUCCESSFULLY WRITTEN TO FILE: outputContents.txt");

        writeToFile("outputContents.txt", studentData);
    }

    //Output student data to a regular text file
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


