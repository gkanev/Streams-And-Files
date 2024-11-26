package CalculateDirectorySize;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;

public class CalculateDirectorySize {
    public static void main(String[] args) {
        String path = "src/";
        File root = new File(path);
        Deque<File> dirs = new ArrayDeque<>();
        dirs.offer(root);
        int count = 0;
        while (!dirs.isEmpty()) {
            File current = dirs.poll();
            File[] nestedFiles = current.listFiles();
            assert nestedFiles != null;
            for (File nestedFile : nestedFiles){
                if (nestedFile.isDirectory()){
                    dirs.offer(nestedFile);
                }
                else{
                    count+= nestedFile.length();
                }
            }
        }
        System.out.println("Total size: "+ count + " bytes");
    }
}
