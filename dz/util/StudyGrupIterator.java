package OOP_sem2.dz.util;

import OOP_sem2.dz.data.StudyGroup;
import OOP_sem2.dz.data.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGrupIterator implements Iterator <User> {

    protected List<StudyGroup> userList = new ArrayList<>();

    protected Integer userId = -1 ;

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public User next() {
        return null;
    }
}
