package service;

import java.util.ArrayList;
import java.util.List;
import model.*;

public class DataService {
    
    List<StudyGroup> studyGroups = new ArrayList<>();

    public StudyGroup addStudyGroup(String groupName, Teacher teacher, List<Student> students) {
        StudyGroup studyGroup = new StudyGroup(groupName, teacher, students);
        studyGroups.add(studyGroup);
        return studyGroup;
    }

    public StudyGroup getStudyGroup(String groupName) {
        for (StudyGroup studyGroup : studyGroups) {
            if (studyGroup.getGroupName().equals(groupName)) {
                return studyGroup;
            }
        }
        return null;
    }
}
