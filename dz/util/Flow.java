package OOP_sem2.dz.util;

import OOP_sem2.dz.data.StudyGroup;
import OOP_sem2.dz.data.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flow implements Iterator<StudyGroup> {
    private Integer index = 0;
    private List<StudyGroup> groupList = new ArrayList<>();
    public List<StudyGroup> addFlow(StudyGroup studyGroup) {
        groupList.add(studyGroup);
        return groupList;
    }

    @Override
    public String toString() {
        return "Flow{" +
                "groupList=" + groupList +
                '}';
    }

    @Override
    public boolean hasNext() {
        return (index< groupList.size());
    }

    @Override
    public StudyGroup next() {
        return groupList.get(index++);
    }
}
