package OOP_sem2.dz.util;

import OOP_sem2.dz.data.StudyGroup;

import java.util.ArrayList;
import java.util.List;

public class StreamComparator {
    private Integer m = 0;

    protected Integer sizeFlow = 0;
        protected Flow minFlow = new Flow();
        protected ArrayList<Flow> flows = new ArrayList<>();

        protected ArrayList<Flow> flowsRes = new ArrayList<>();

    public List<Flow> addFlows(Flow flow) {
        flows.add(flow);
        flowsRes.add(flow);
        return flows;
    }

    @Override
    public String toString() {
        return "StreamComparator{" +
                "flows=" + flows +
                '}';
    }

    public Flow searhMin(){
            for (int i = 0; i< this.flows.size();i++){
                if (this.flows.get(m).size()>flows.get(i).size()){
                    m=i;
                }
            }
            m = 0;
            minFlow = this.flows.get(m);
            this.flows.remove(minFlow);
            System.out.println(flowsRes.size());
           return minFlow;
        }

}

