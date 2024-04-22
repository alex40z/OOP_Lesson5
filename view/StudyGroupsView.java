package view;

import java.util.List;

import controller.Controller;
import model.Student;
import model.StudyGroup;
import model.Teacher;

public class StudyGroupsView {
    
    private Controller controller = new Controller();

    public void addStudyGroup(String groupName, Teacher teacher, List<Student> students) {
        controller.addStudyGroup(groupName, teacher, students);
        System.out.println(groupName + " добавлена");
    }

    public StudyGroup getStudyGroup(String groupName) {
        return controller.getStudyGroup(groupName);
    }
}
