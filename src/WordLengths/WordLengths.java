package WordLengths;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class WordLengths {
    public static void main(String[] args) {
        try(BufferedReader in = new BufferedReader(new FileReader("src/WordLengths/input.txt"));){
            //should change this to be while line != null
            String line = in.readLine();
            String[] words = line.split(" ");
            ArrayList<String> len = new ArrayList<>();
            for (String word : words){
                len.add(String.valueOf(word.length()));
            }
            System.out.println(String.join(", ",len));
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
