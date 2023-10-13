package treeSet;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Instructor implements Comparable<Instructor>{
    int id;
    String name;


    @Override
    public String toString() {
        return "Instructor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Instructor o) {
        return this.name.compareTo(o.name);
    }
}
