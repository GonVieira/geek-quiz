package questions;

import java.io.*;
import java.util.HashMap;

public class QuestionManager {

    public static void serialize(HashMap<String,Integer> questions) {
        HashMap<String, Integer> outMap = new HashMap<String,Integer>(questions);
        try {
            FileOutputStream fileOut =
                    new FileOutputStream("src/questions/questions.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(outMap);
            out.close();
            fileOut.close();
            System.out.println("Serialized questions saved in /tmp/srcquestions.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public static HashMap<String,Integer> deserialize() throws IOException {
        HashMap<String,Integer> questions= new HashMap<>();
        FileInputStream fileIn = new FileInputStream("src/questions/questions.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        try {
            questions = (HashMap<String, Integer>) in.readObject();
        } catch (IOException i) {
            i.printStackTrace();
            return null;
        } catch (ClassNotFoundException c) {
            System.out.println("questions not found");
            c.printStackTrace();
            return null;
        } finally {
            in.close();
            fileIn.close();
        }
        return  new HashMap<>(questions);
    }
}
