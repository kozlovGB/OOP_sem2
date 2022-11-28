package OOP_sem2.dz.controller;

import OOP_sem2.dz.data.Teacher;
import OOP_sem2.dz.data.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TeacherControllerImpl implements UserController {
    private static Stack<Teacher> teacherStack;

    static {
        teacherStack = new Stack<>();
    }

    @Override
    public void create(String name, String birthday, String info) {
        Teacher currentTeacher = new Teacher(name, birthday, info);
        teacherStack.push(currentTeacher);
    }

    @Override
    public OOP_sem2.dz.data.User get() {
        if (!teacherStack.isEmpty()) {
            return teacherStack.pop();
        }
        return null;
    }

    @Override
    public List<User> getAll() {
        return new ArrayList<>(teacherStack);
    }
}
