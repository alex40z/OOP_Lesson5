package model;

public class Student extends User {

    private int studentId;

    public Student(String lastName, String firstName, int age) {
        super(lastName, firstName, age);
    }

    public int getStudentId() {
        return studentId;
    }
    
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Студент: " + super.toString() + String.format(", Id: %d", studentId);
    }
}
