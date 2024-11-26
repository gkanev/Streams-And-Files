package CopyFileContent;

import java.io.*;

public class CopyFileContent {
    public static void main(String[] args) {
        try(BufferedInputStream in = new BufferedInputStream(new FileInputStream("src/CopyFileContent/input.txt"));
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("src/CopyFileContent/output.txt"))){
            int symbol = in.read();
            while(symbol >= 0){
                out.write(symbol);
                symbol = in.read();
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
