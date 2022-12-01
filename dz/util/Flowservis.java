package OOP_sem2.dz.util;

import OOP_sem2.dz.data.StudyGroup;

import java.util.ArrayList;
import java.util.List;

public class Flowservis extends StreamComparator {
    private List<Flow> groupList = new ArrayList<>();
    public List<Flow> addFl(Flow flow) {
        groupList.add(flow);
        return groupList;
    }
    public ArrayList<Flow> sort (groupList){

        }

}
