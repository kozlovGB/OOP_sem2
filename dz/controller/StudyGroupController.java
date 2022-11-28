package OOP_sem2.dz.controller;

import OOP_sem2.dz.data.StudyGroup;
import OOP_sem2.dz.data.User;

import java.util.List;

public interface StudyGroupController {
    void create(User teacher, List<User> studentList);
    StudyGroup get();
}