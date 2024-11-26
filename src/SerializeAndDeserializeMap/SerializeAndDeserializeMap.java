package SerializeAndDeserializeMap;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class SerializeAndDeserializeMap {
    public static void main(String[] args) {
        String path = "src/SerializeAndDeserializeMap/map.ser";
        HashMap<String,Integer> values = new HashMap<>();
        int i = 0;
        for(char ch = 'a'; i < 10; i++,ch++){
            values.put(Character.toString(ch),i);
        }
        try(FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);){
            oos.writeObject(values);
            HashMap<String,Integer> loaded_values = (HashMap<String,Integer>) ois.readObject();
            for(var key : loaded_values.entrySet()){
                System.out.println(key.getKey()+ " " +key.getValue());
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
