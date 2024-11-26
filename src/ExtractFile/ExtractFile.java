package ExtractFile;
import java.io.File;
import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String givenpath = input.nextLine();
        File file = new File(givenpath);
        if(file.exists()){
            if(!file.isDirectory()){
                String[] getext = file.getName().split("\\.");
                String extension = getext[1];
                System.out.printf("File name: %s%nFile extension: %s%nFile size: %s bytes",file.getName(),extension,file.length());
            }
            else{
                System.out.println("File is a directory.");
            }
        }
        else{
            System.out.println("File does not exist.");
        }
    }
}
