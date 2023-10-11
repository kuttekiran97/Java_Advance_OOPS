package Comparator_vs_Comparable.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Comparable Features :-
 * A comparable object is capable of comparing itself with another object.
 * The class itself must implements the java.lang.Comparable interface to compare its instances.
 * Consider a Movie class that has members like, rating, name, year.
 * Suppose we wish to sort a list of Movies based on year of release.
 * We can implement the Comparable interface with the Movie class, and we override the method compareTo() of Comparable interface.
 */


public class Comparable_example {
    public static void main(String[] args) {
        List<Employee> ep = new ArrayList<>();

        ep.add(new Employee(2,"Sail"));
        ep.add(new Employee(2,"Kiran"));
        ep.add(new Employee(10,"john"));
        ep.add(new Employee(5,"Sam"));
        ep.add(new Employee(1,"Sharan"));

        Collections.sort(ep);
        System.out.println(ep.toString());
    }
}
