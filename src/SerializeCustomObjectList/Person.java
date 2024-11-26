package SerializeCustomObjectList;

import java.io.Serializable;

public class Person implements Serializable {
    public String name;
    public int age;

    public Person() {
    }

    @Override
    public String toString() {
        return "Name: " + name + " Age: " + age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
