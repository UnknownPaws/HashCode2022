import java.util.*;

public class Algorithm {

    private Database data;
    private ArrayList<String> allWorkerSkills = new ArrayList<String>();
    private ArrayList<String> allProjectSkills = new ArrayList<String>();

    public Algorithm(String filename) {
        data = new Database(filename);

    }
    // 
    public void Sort() {
        ArrayList<Project> p = data.getProjects();
        ArrayList<Worker> w = data.getWorkers();
        int s = w.size();
        int d = p.size();
        for (int i = 0; i < s; i++){
            int hashSize = w.get(i).getSkillToLevel().size();
            for (int j = 0; j < hashSize; j++) {
                allWorkerSkills.add(w.get(j).getSkills().get(j));
            }
        }
        Set set1 = new HashSet(allWorkerSkills);
        ArrayList
        for (int i = 0; i < d; i++){
            int hashSize = p.get(i).getRoles().size();
            for (int j = 0; j < hashSize; j++) {
                allProjectSkills.add(p.get(j).getRoles().get(j));
            }
        }
        Set set2 = new HashSet<>(allProjectSkills);
        

       
    }
    
        
}

