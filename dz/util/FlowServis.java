package OOP_sem2.dz.util;

import java.util.ArrayList;
import java.util.List;

public class FlowServis extends StreamComparator {

    private List<Flow> arrangeList = new ArrayList<>();


    public List<Flow> flowsArrange() {
        while (arrangeList.size()<flowsRes.size()) {
            arrangeList.add(searhMin());
        }
        return arrangeList;
    }

    @Override
    public String toString() {
        return "FlowServis{" +
                ", arrangeList=" + arrangeList +
                ", flows=" + flows +
                '}';
    }
}
