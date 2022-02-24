import java.util.*;

public class Algorithm {

    private Database data;
    private ArrayList<String> allskills = new ArrayList<String>();

    public Algorithm(String filename) {
        data = new Database(filename);

    }
    public void Sort() {
        ArrayList<Project> p = data.getProjects();
        ArrayList<Worker> w = data.getWorkers();
        int s = w.size();
        for (int i = 0; i < s; i++){
            int hashSize = w.get(i).getSkillToLevel().size();
            for (int j = 0; j < hashSize; j++) {
                // allskills.add(w.get(i).getSkillToLevel().get;
            }
        }
       
    }
    
        
}

