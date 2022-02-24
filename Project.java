import java.util.HashMap;

public class Project {
    String name;
    int daysNeeded;
    int points;
    int bestBefore;
    int roleNumber;
    HashMap<String, Integer> roleToLevel;

    public Project(String name, int daysNeeded, int points, int bestBefore, int roleNumber, HashMap<String, Integer> roleToLevel) {
        this.name = name;
        this.daysNeeded = daysNeeded;
        this.points = points;
        this.bestBefore = bestBefore;
        this.roleNumber = roleNumber;
        this.roleToLevel = roleToLevel;
    }

    public String getName() {
        return name;
    }

    public int getDaysNeeded() {
        return daysNeeded;
    }

    public int getPoints() {
        return points;
    }

    public int getBestBefore() {
        return bestBefore;
    }

    public int getRoleNumber() {
        return roleNumber;
    }

    public HashMap<String, Integer> getRoleToLevel() {
        return roleToLevel;
    }
}
