package CountLinesWordsCharacters;
import java.io.BufferedReader;
import java.io.FileReader;

public class CountLinesWordsCharacters {
    public static void main(String[] args) {
        try(BufferedReader in = new BufferedReader(new FileReader("src/CountLinesWordsCharacters/input.txt"))){
            String line = in.readLine();
            int lines = 0;
            int words = 0;
            int characters = 0;
            while(line != null){
                lines++;
                String[] splitline = line.split(" ");
                words += splitline.length;
                characters +=line.length();
                line = in.readLine();
            }
            System.out.printf("Lines: %s%nWords: %s%nCharacters %s%n",lines,words,characters);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
