package MergeLinesFromTwoFiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class MergeLinesFromTwoFiles {
    public static void main(String[] args) {
        try(BufferedReader in1 = new BufferedReader(new FileReader("src/MergeLinesFromTwoFiles/input1.txt"));
            BufferedReader in2 = new BufferedReader(new FileReader("src/MergeLinesFromTwoFiles/input2.txt"));
            BufferedWriter out = new BufferedWriter(new FileWriter("src/MergeLinesFromTwoFiles/output.txt"))){
            String line = in1.readLine();
            boolean first_empty = false;
            boolean second_empty = false;
            int alternator = 0;
            while(line !=null){
                out.write(line+"\n");
                if(!first_empty && !second_empty){
                    alternator++;
                }
                if(alternator % 2 == 0 && !first_empty){
                    line = in1.readLine();
                    if (line == null){
                        first_empty = true;
                        line = in2.readLine();
                        alternator++;
                    }
                }
                else if (alternator % 2 != 0 && !second_empty) {
                    line = in2.readLine();
                    if (line == null){
                        second_empty = true;
                        line = in1.readLine();
                        alternator++;
                    }
                }
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
