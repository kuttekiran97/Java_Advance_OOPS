package treeSet;

import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Client {
    public static void main(String[] args) {
        TreeSet<Instructor> ts = new TreeSet<>(new idComparator());

        ts.add(new Instructor(50,"Kiran"));
        ts.add(new Instructor(40,"Mahesh"));
        ts.add(new Instructor(30,"Karan"));
        ts.add(new Instructor(20,"Apple"));
        ts.add(new Instructor(10,"Unicorn"));

        System.out.println(ts);



    }
}
