package OOP_sem2.dz.controller;

import OOP_sem2.dz.data.Student;
import OOP_sem2.dz.data.StudyGroup;
import OOP_sem2.dz.data.User;
import OOP_sem2.dz.util.StudyGrupIterator;

import java.util.List;

public interface StudyGroupController  {
    void create(User teacher, List<User> studentList);
    StudyGroup get();




}