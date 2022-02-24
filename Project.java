import java.util.HashMap;
import java.util.ArrayList;

public class Project {
    String name;
    int daysNeeded;
    int points;
    int bestBefore;
    int roleNumber;
    HashMap<String, Integer> roleToLevel;
    ArrayList<String> roles;

    public Project(String name, int daysNeeded, int points, int bestBefore, int roleNumber, HashMap<String, Integer> roleToLevel, ArrayList<String> roles) {
        this.name = name;
        this.daysNeeded = daysNeeded;
        this.points = points;
        this.bestBefore = bestBefore;
        this.roleNumber = roleNumber;
        this.roleToLevel = roleToLevel;
        this.roles = roles;
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

    public ArrayList<String> getRoles() {
        return roles;
    }
}
