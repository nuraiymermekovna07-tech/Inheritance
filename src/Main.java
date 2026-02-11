import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person[] people = { new Dancer("Daniel","Dancer","f5"),
                          new Singer("Atai","Singer","u8"),
                          new Programmer("Aidana","Programmer") };
            for(Person person : people) {
                person.walk();
            }
        System.out.println(Arrays.toString(people));





    }
}