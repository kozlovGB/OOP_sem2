package OOP_sem2.dz.controller;

import OOP_sem2.dz.data.Student;
import OOP_sem2.dz.data.StudyGroup;
import OOP_sem2.dz.data.Teacher;
import OOP_sem2.dz.data.User;

import java.util.List;
import java.util.Stack;

public class StudyGroupControllerImpl implements StudyGroupController{
    private static Stack<StudyGroup> studyGroupsStack;

    static {
        studyGroupsStack = new Stack<>();
    }


    @Override
    public void create(User teacher, List<User> studentList) {
        StudyGroup currentStudyGroup = new StudyGroup();
        currentStudyGroup.changeTeacher((Teacher) teacher);
        for (var student : studentList) {
            currentStudyGroup.addStudent((Student) student);
        }
        studyGroupsStack.push(currentStudyGroup);
    }

    @Override
    public StudyGroup get() {
        if (studyGroupsStack.size() > 0) {
            return studyGroupsStack.pop();
        }
        return null;
    }

}