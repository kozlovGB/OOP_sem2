package OOP_sem2.dz.util;

import java.util.ArrayList;
import java.util.List;

public class StreamComparator {
    private Integer m = 0;
        protected ArrayList<Flow> minFlow = new ArrayList<>();
        public ArrayList<Flow> searhMin(ArrayList<ArrayList<Flow>> flowList){
            for (int i = 0; i< flowList.size();i++){
                if (flowList.get(m).size()>flowList.get(i).size()){
                    m=i;
                }
            }
           return minFlow = flowList.get(m);
        }

}

