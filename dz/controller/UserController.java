package OOP_sem2.dz.controller;


import OOP_sem2.dz.data.User;

import java.util.List;

public interface UserController {
    void create(String name, String birthday, String info);
    OOP_sem2.dz.data.User get();
    List<User> getAll();
}