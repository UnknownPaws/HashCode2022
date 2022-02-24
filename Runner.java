import java.util.HashMap;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

public class Runner {
    
    public static void main(String args[]) {

    }

    public static void createPlainTxt(int planned, String[] projectNames, HashMap<String, String> answers){
        try {
            FileWriter writer = new FileWriter("Hashcode_2022_answer");
            writer.write(planned + "\n");
            for(int i = 0; i < planned*2; i++){
                String project = projectNames[i];
                writer.write(project + "\n");
                writer.write(answers.get(project) + "\n");
            }
            writer.close();
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}
