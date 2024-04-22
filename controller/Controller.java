package controller;

import java.util.List;

import model.Student;
import model.StudyGroup;
import model.Teacher;
import service.DataService;

public class Controller {
    
    private DataService service = new DataService();

    public void addStudyGroup(String groupName, Teacher teacher, List<Student> students) {
        service.addStudyGroup(groupName, teacher, students);
    }

    public StudyGroup getStudyGroup(String groupName) {
        return service.getStudyGroup(groupName);
    }
}
