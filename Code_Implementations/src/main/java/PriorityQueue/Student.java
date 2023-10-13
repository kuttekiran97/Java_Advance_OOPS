package PriorityQueue;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Student implements Comparable<Student>{

    int id;
    int height;
    int weight;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.weight- o.weight;
    }
}
