package Set;

import java.util.LinkedHashSet;

/*
LinkedHashSet has the following Features:
- No Duplicate values
 - Iteration order maintained
 - Permits null value
 - Implements Set Interface, extends HashSet Class
 - Not Synchronized
 - Underlying Data structure is HashTable & Doubly Linked List
 - Internal Working is based on HashMap
 - Initial Capacity
 - Load Factor = Number of elements present / Size of HashTable
 - Default initial capacity is 16 & load factor is 0.75
 - LinkedHashSet h = new LinkedHashSet();
 - LinkedHashSet h = new LinkedHashSet(int initialCapacity);
 - LinkedHashSet h = new LinkedHashSet(int initialCapacity, float loadFactor);
 */

public class LinkedHashset_example {
    public static void main(String[] args) {
        LinkedHashSet<Integer> a = new LinkedHashSet<>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);

        System.out.println(a);
    }
}
