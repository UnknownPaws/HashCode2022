import java.util.HashMap;

public class Worker {
    String name;
    int skillNumber;
    HashMap<String, Integer> skillToLevel;

    public Worker(String name, int skillNumber, HashMap<String, Integer> skillToLevel) {
        this.name = name;
        this.skillNumber = skillNumber;
        this.skillToLevel = skillToLevel;
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
}
