package model;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup {
    
    private String groupName;
    private Teacher teacher;
    private List<Student> students;

    public StudyGroup(String groupName, Teacher teacher, List<Student> students) {
        this.groupName = groupName;
        this.teacher = teacher;
        this.students = students;
        int currentId = 0;
        for (Student student : students) {
            student.setStudentId(++currentId);
        }
    }

    public String getGroupName() {
        return groupName;
    }

    public List<User> getStudyGroup() {
        List<User> usersList = new ArrayList<>();
        usersList.add(teacher);
        usersList.addAll(students);
        return usersList;
    }

    @Override
    public String toString() {
        String usersList = groupName + "\n" + teacher;
        for (Student student : students) {
            usersList = usersList + "\n" + student;
        }
        return "Группа: " + usersList;
    }    
}
