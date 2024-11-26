package ReplaceWord;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReplaceWord {
    public static void main(String[] args) {
        try(BufferedReader in = new BufferedReader(new FileReader("src/ReplaceWord/input.txt"));
            BufferedWriter out = new BufferedWriter(new FileWriter("src/ReplaceWord/output.txt"))){
            String line = in.readLine();
            //First pass to get the two words we want to mark
            if(line != null){
                String[] replace = line.split(" -> ");
                String toreplace = replace[0];
                String replacewith = replace[1];
                line = in.readLine();
                while(line !=null){
                    line = line.replaceAll(toreplace,replacewith);
                    out.write(line+"\n");
                    line = in.readLine();
                }
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
