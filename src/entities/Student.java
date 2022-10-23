package entities;

public class Student extends Person{
    private String course;
    private String shift;

    public Student(int registration, String name,
                   String email, int telephone,
                   String course, String shift) {
        super(registration, name, email, telephone);
        this.course = course;
        this.shift = shift;
    }

    //Getters & Setters
    public String getCourse() {return course;}
    public void setCourse(String course) {this.course = course;}

    public String getShift() {return shift;}
    public void setShift(String shift) {this.shift = shift;}

    @Override
    public String toString() {
        return getName()+", "
                +getEmail();
    }
}
