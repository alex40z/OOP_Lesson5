package model;

public class Teacher extends User {
    
    private String discipline;

    public Teacher(String lastName, String firstName, int age, String discipline) {
        super(lastName, firstName, age);
        this.discipline = discipline;
    }

    public String getDiscipline() {
        return discipline;
    }
    
    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    @Override
    public String toString() {
        return "Учитель: " + super.toString() + String.format(", предмет: %s", discipline);
    }
}
