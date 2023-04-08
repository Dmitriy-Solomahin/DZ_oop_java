package DZ4.DZ_dop;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Task {
    private String urgency;
    private String task;
    private Map<String,ArrayList<Integer>> deadline = new HashMap<String,ArrayList<Integer>>(); 
    private Date dataTameApp;

    public Task(String task,Map<String,ArrayList<Integer>> deadline){
        this.task = task;
        this.deadline = deadline;
        this.dataTameApp = new Date();
    }
}
