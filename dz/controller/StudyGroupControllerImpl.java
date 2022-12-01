package OOP_sem2.dz.controller;

import OOP_sem2.dz.data.Student;
import OOP_sem2.dz.data.StudyGroup;
import OOP_sem2.dz.data.Teacher;
import OOP_sem2.dz.data.User;
import OOP_sem2.dz.util.StudyGrupIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StudyGroupControllerImpl extends StudyGrupIterator implements StudyGroupController{
    private static Stack<StudyGroup> studyGroupsStack;

    static {
        studyGroupsStack = new Stack<>();
    }

    private List<User> commonList = new ArrayList<>();


    @Override
    public void create(User teacher, List<User> studentList) {
        StudyGroup currentStudyGroup = new StudyGroup();
        currentStudyGroup.changeTeacher((Teacher) teacher);
        this.commonList.add(teacher);
        for (var student : studentList) {
            currentStudyGroup.addStudent((Student) student);
            this.commonList.add(student);
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

    public List<User> commonList(){
        return commonList;
    }

    @Override
    public boolean hasNext() {
        return (super.userId < this.commonList.size()-1);

    }

    @Override
    public User next() {
        super.userId++;
        System.out.println(userId);
        return this.commonList.get(super.userId);
    }
}