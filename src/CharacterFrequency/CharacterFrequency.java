package CharacterFrequency;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args) {
        try(BufferedReader in = new BufferedReader(new FileReader("src/CharacterFrequency/input.txt"))){
            LinkedHashMap<Character,Integer> number_count = new LinkedHashMap<>();
            int symbol = in.read();
            while(symbol >= 0){
                number_count.merge((char)symbol,1,Integer::sum);
                symbol = in.read();
            }
            for (Map.Entry<Character, Integer> key : number_count.entrySet()){
                System.out.printf("%s: %d%n",key.getKey(),number_count.get(key.getKey()));
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
