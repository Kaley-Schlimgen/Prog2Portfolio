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


        for (int i = 0; i < 2; i++) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Address: ");
            String address = scanner.nextLine();

            System.out.print("Enter GPA: ");
            double GPA = scanner.nextDouble();
            scanner.nextLine();

            studentData.add(new Student(name, address, GPA));


        }
        scanner.close();

        //Sort linkedList by name in ascending order
        Collections.sort(studentData, Comparator.comparing(Student::toString));

        System.out.println("\nSTUDENT INFORMATION: ");
        for (Student student : studentData) {
            System.out.println("\nName: " + student.toString() + "\nAddress: " + student.getAddress() +
                    "\nGPA: " + student.getGPA());
        }

        writeToFile("outputContents.txt", studentData);
        }

    private static void writeToFile(String file, LinkedList<Student> studentData) throws IOException {
        FileWriter writer = new FileWriter(file);
        for (Student student : studentData) {
            writer.write(student.toString() + ", " + student.getAddress() + ", " + student.getGPA() + "\n");
        }
        writer.close();


    }
    }


