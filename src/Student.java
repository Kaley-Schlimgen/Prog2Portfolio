
public class Student {
    //Student data as private fields (name, address, GPA)
    private String name;
    private String address;
    private double GPA;

    public Student(String name, String address, double GPA) throws IllegalAccessException {
        this.name = name;
        this.address = address;
        validateGPA(GPA);
        //this.GPA = GPA;
    }

    //Validate numeric data for GPA
    public void validateGPA(double GPA) throws IllegalAccessException {
        if (GPA >= 0.0 && GPA <= 4.0) {
            this.GPA = GPA;
        }
        else {
            throw new IllegalAccessException("GPA not valid");
        }
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getGPA() {
        return GPA;
    }

}
