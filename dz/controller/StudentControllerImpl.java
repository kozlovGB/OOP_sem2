package OOP_sem2.dz.controller;

import OOP_sem2.dz.data.Student;
import OOP_sem2.dz.data.User;
import OOP_sem2.dz.util.StudyGrupIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StudentControllerImpl extends StudyGrupIterator implements UserController {
    private static Stack<Student> studentStack = new Stack<>();
    static {
        studentStack = new Stack<>();
    }

    @Override
    public void create(String name, String birthday, String info) {
        Student currentStudent = new Student(name,birthday,info);
        studentStack.add(currentStudent);
    }
    @Override
    public OOP_sem2.dz.data.User get() {
        if (!studentStack.isEmpty()) {
            return studentStack.pop();
        }
        return null;
    }

    @Override
    public List<User> getAll() {
        return new ArrayList<>(studentStack);
    }
    public void clean() {
        while (!studentStack.isEmpty()) {
            studentStack.pop();
        }
    }

}