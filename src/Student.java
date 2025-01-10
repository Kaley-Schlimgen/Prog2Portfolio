
public class Student {
    //student data as private fields (name, address, GPA)
    private String name;
    private String address;
    private double GPA;

//constructors (name, address, GPA)
//TODO: add address, GPA

    public Student(String name, String address, double GPA) {
        this.name = name;
        this.address = address;
        this.GPA = GPA;
    }


    @Override
    public String toString() {
        return name;
    }


    public String getAddress() {
        return address;
    }

    public double getGPA() {
        return GPA;
    }

}
