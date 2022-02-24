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
}
