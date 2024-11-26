package SerializeCustomObjectList;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

public class SerializeCustomObjectList {
    public static void main(String[] args) {
        String path = "src/SerializeCustomObjectList/persons.ser";
        ArrayList<Person> persons = new ArrayList<>();
        Collections.addAll(persons, new Person("Marry",21), new Person("George",25));

        try(FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);){
            oos.writeObject(persons);
            ArrayList<Person> loaded_people = (ArrayList<Person>) ois.readObject();
            for(var person : loaded_people){
                System.out.println(person.toString());
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
