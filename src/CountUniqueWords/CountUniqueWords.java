package CountUniqueWords;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.TreeSet;

public class CountUniqueWords {
    public static void main(String[] args) {
        TreeSet<String> unique_words = new TreeSet<>();
        try(BufferedReader in = new BufferedReader(new FileReader("src/CountUniqueWords/input.txt"))){
            String line = in.readLine();
            while(line != null){
                String[] words = line.split("\\W");
                for(String word : words){
                    if(!word.isEmpty()){
                        unique_words.add(word);
                    }
                }
                line = in.readLine();
            }
            System.out.println("Unique words: " + unique_words.size());
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
