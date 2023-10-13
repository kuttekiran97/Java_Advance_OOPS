package PriorityQueue;

import java.util.HashMap;
import java.util.PriorityQueue;

public class Client {
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>(new StudentHeightComparator());


        pq.add(new Student(5,50,70));
        pq.add(new Student(4,49,80));
        pq.add(new Student(3,55,85));
        pq.add(new Student(6,36,75));
        pq.add(new Student(2,48,66));

        int n = pq.size();

        for(int i=0;i<n;i++){
            System.out.println(pq.poll());

        }
    }
}