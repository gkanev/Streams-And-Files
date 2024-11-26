package ExtractFilesFromZipArchive;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
public class ExtractFilesFromZipArchive {
    public static void main(String[] args) {
        //Tried with zip input stream, which never managed to recognize the zip file and zis would return null
        //Same result with Zipfile (proposed solution for these issues), so I just assume the libraries are bugged in some way.
        //Could not get it to work.
        String path = "src\\ExtractFilesFromZipArchive\\archive.zip";
        try (ZipFile zis = new ZipFile(path)) {
            Enumeration<? extends ZipEntry> entries = zis.entries();
            while (entries.hasMoreElements()) {
                ZipEntry entry = entries.nextElement();
                if(!entry.isDirectory()) {
                    String[] ext = entry.getName().split("\\.");
                    if(ext[1].equals("txt")){
                        File newFile = new File("src\\ExtractFilesFromZipArchive\\extracted_files" + File.separator + entry.getName());
                        try (InputStream inputStream = zis.getInputStream(entry);
                             FileOutputStream fos = new FileOutputStream(newFile)) {
                            int data = inputStream.read();
                            while(data != -1){
                                fos.write(data);
                                data = inputStream.read();
                            }
                        }
                    }
                }
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
