package Set;

import java.util.HashSet;

/*
HashSet has the following Features:
 - No Duplicate values
 - No Iteration order maintained
 - Permits null value
 - Implements Set Interface
 - Not Synchronized
 - Underlying Data structure is HashTable, Objects are inserted based on HashCode
 - Internal Working is based on HashMap
 - Initial Capacity
 - Load Factor = Number of elements present / Size of HashTable
 - Default initial capacity is 16 & load factor is 0.75
 - HashSet h = new HashSet();
 - HashSet h = new HashSet(int initialCapacity);
 - HashSet h = new HashSet(int initialCapacity, float loadFactor);
 */

public class hashset_example {
    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);

        System.out.println(a);
    }

}
