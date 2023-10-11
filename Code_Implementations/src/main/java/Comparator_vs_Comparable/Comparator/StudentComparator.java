package Comparator_vs_Comparable.Comparator;

import Comparator_vs_Comparable.Comparator.Student;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {

        return o1.id - o2.id;

        // For string comparison
        // int i = o1.name.compareTo(o2.name);
        // if (i>0){
        //     return 1;
        // }
        // else{
        //     return -1;
        // }
        //
    }
}
