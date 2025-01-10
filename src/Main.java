//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.LinkedList;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        LinkedList<Student> studentData = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.println("Enter student name:");
            String name = scanner.nextLine();

            Student student = new Student(name);
            studentData.add(student);
        }

        System.out.println("Student names: ");
        for (Student student : studentData) {
            System.out.println(student);
        }



        scanner.close();


    }
}