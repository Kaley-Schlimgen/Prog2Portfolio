import java.util.Scanner;

public class Student {
    private String name;
//    private String address;
//    private double GPA;

//constructors (name, address, GPA)
//TODO: add address, GPA

    public Student(String name) {
        this.name = name;

// this.address = address;
// this.GPA = GPA;
    }

//getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

/* public String getAddress() {
        return address;
        }
   public void setAddress(String address) {
        this.address = address;
        }
   public Double getGPA() {
        return GPA;
        }
   public void setGPA() {
        this.GPA = GPA;
        }


 */
}
