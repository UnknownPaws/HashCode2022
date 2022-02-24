import java.util.HashMap;
import java.util.ArrayList;

public class Worker {
    String name;
    int skillNumber;
    HashMap<String, Integer> skillToLevel;
    ArrayList<String> skills;

    public Worker(String name, int skillNumber, HashMap<String, Integer> skillToLevel, ArrayList<String> skills) {
        this.name = name;
        this.skillNumber = skillNumber;
        this.skillToLevel = skillToLevel;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public int getSkillNumber() {
        return skillNumber;
    }

    public HashMap<String, Integer> getSkillToLevel() {
        return skillToLevel;
    }

    public void increaseSkillLevel(String skill){
        int currentSkillLevel = skillToLevel.get(skill);
        skillToLevel.put(skill, currentSkillLevel++);
    }

    public ArrayList<String> getSkills() { //test
        return skills;
    }
}
