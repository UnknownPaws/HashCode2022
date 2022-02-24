import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;

public class AnExample_Database {
    private ArrayList<String> lines;
    private ArrayList<Worker> workers;
    private ArrayList<Project> projects;
    private int workerCount;
    private int projectCount;

    public AnExample_Database() {
        lines = readFromFile("a_an_example.in.txt");
        String[] initInfo = lines.get(0).split(" ");
        workerCount = Integer.parseInt(initInfo[0]);
        projectCount = Integer.parseInt(initInfo[1]);

        int currInd = 1;
        for (int i = 0; i < workerCount; i++) {
            String[] header = lines.get(currInd).split(" ");
            String name = header[0];
            int skills = Integer.parseInt(header[1]);
            HashMap<String, Integer> skillLevel = new HashMap<String, Integer>();
            for (int k = currInd+1; k <= currInd+skills; k++) {
                String[] skillHeader = lines.get(k).split(" ");
                skillLevel.put(skillHeader[0], Integer.parseInt(skillHeader[1]));
            }
            new Worker(name, skills, skillLevel);
            currInd += skills;
        }
        for (int i = workerCount; i <= projectCount; i++) {
            String[] header = lines.get(currInd).split(" ");
            String name = header[0];
            int daysNeeded = Integer.parseInt(header[1]);
            int points = Integer.parseInt(header[2]);
            int bestBefore = Integer.parseInt(header[3]);
            int roles = Integer.parseInt(header[4]);
            HashMap<String, Integer> roleLevel = new HashMap<String, Integer>();
            for (int k = currInd+1; k <= currInd+roles; k++) {
                String[] roleHeader = lines.get(k).split(" ");
                roleLevel.put(roleHeader[0], Integer.parseInt(roleHeader[1]));
            }
            new Project(name, daysNeeded, points, bestBefore, roles, roleLevel);
            currInd += roles;
        }
    }

    private ArrayList<String> readFromFile(String fileName) {
        ArrayList<String> data = null;
        try {
            data = (ArrayList<String>) Files.readAllLines(Paths.get(fileName));
        } catch (IOException e) {
            System.out.println("The file " + fileName + " could not be opened.");
            e.printStackTrace();
        }
        return data;
    }
}