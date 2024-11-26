package ReverseLines;
import java.io.*;

public class ReverseLines {
    public static void main(String[] args) {
        try(BufferedReader in = new BufferedReader(new FileReader("src/ReverseLines/input.txt"));
            PrintWriter out = new PrintWriter("src/ReverseLines/output.txt")){
            String line = in.readLine();
            while(line !=null){
                StringBuilder build = new StringBuilder(line);
                out.write(build.reverse().toString()+"\n");
                line = in.readLine();
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
