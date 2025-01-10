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
        LinkedList<Student> studentData = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String addAnother = "yes";

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

        scanner.close();

        //Sort linkedList by name in ascending order
        Collections.sort(studentData, Comparator.comparing(Student::getName));

        System.out.println("\nSTUDENT INFORMATION: ");
        for (Student student : studentData) {
            System.out.println("\nName: " + student.getName() + "\nAddress: " + student.getAddress() +
                    "\nGPA: " + student.getGPA());
        }

        writeToFile("outputContents.txt", studentData);
        }

    private static void writeToFile(String file, LinkedList<Student> studentData) throws IOException {
        FileWriter writer = new FileWriter(file);
        for (Student student : studentData) {
            writer.write(student.getName() + ", " + student.getAddress() + ", " + student.getGPA() + "\n");
        }
        writer.close();


    }
    }


