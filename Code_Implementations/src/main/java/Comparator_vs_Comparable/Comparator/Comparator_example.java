package Comparator_vs_Comparable.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**  When to use Comparator : -
 * Now, suppose we want to sort movies by their rating and names as well.
 * When we make a collection element comparable(by having it implement Comparable), we get only one chance to implement the compareTo() method.
 * The solution is using Comparator.
 * <p>
 *
 *  Comparator:-
 * Unlike Comparable, Comparator is external to the element type we are comparing. It’s a separate class.
 * We create multiple separate classes (that implement Comparator) to compare by different members.
 * Collections class has a second sort() method and it takes Comparator. The sort() method invokes the compare() to sort objects.
 */
public class Comparator_example {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student(2,"Kiran"));
        list.add(new Student(10,"john"));
        list.add(new Student(5,"Sam"));
        list.add(new Student(23,"Sail"));
        list.add(new Student(1,"Sharan"));

        Collections.sort(list, new StudentComparator());
        System.out.println(list.toString());
    }
}
