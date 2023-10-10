package Hashcode_Equals;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id =1;
        e1.name = "Kiran";

        Employee e2 = new Employee();
        e2.id = 1;
        e2.name="Kiran";

        System.out.println("Equal output is " + (e1.equals(e2)));
// Since we are learning the implementation of Hashmap and in Hashmap,
// to make 2 objects having same content having same Hashcode and both are equal,
// we need to override the equals and hashcode methods



    }
}
