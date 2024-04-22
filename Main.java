import java.util.ArrayList;
import java.util.List;

import model.Student;
import model.Teacher;
import view.StudyGroupsView;

public class Main {
    public static void main(String[] args) {

        List<Student> students1 = new ArrayList<>();
        students1.add(new Student("Иванов", "Иван", 24));
        students1.add(new Student("Петров", "Пётр", 22));
        students1.add(new Student("Сидоров", "Сидор", 25));
        Teacher teacher1 = new Teacher("Преображенский", "Филипп", 53, "Физика");

        List<Student> students2 = new ArrayList<>();
        students2.add(new Student("Николаев", "Николай", 20));
        students2.add(new Student("Олегов", "Олег", 21));
        students2.add(new Student("Константин", "Константинов", 22));
        Teacher teacher2 = new Teacher("Ломоносов", "Михаил", 61, "Математика");

        StudyGroupsView studyGroupsView = new StudyGroupsView();
        studyGroupsView.addStudyGroup("ФМП-1", teacher1, students1);
        studyGroupsView.addStudyGroup("МПС-3", teacher2, students2);

        System.out.println();
        System.out.println();
         
        System.out.println(studyGroupsView.getStudyGroup("ФМП-1"));
        System.out.println();
        System.out.println();
        System.out.println(studyGroupsView.getStudyGroup("МПС-3"));
    }
}