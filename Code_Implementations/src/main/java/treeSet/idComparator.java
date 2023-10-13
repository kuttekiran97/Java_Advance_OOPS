package treeSet;

import java.util.Comparator;

public class idComparator implements Comparator<Instructor> {

    @Override
    public int compare(Instructor o1, Instructor o2) {
        return o1.id - o2.id;
    }
}
