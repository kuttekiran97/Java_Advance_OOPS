package Comparator_vs_Comparable.Comparable;

public class Employee implements Comparable<Employee>{
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
            return this.id - o.id;



//        - You can do multiple checks as well
//        if (this.id > o.id){
//            return 1;
//        } else if ((this.id == o.id) && (this.name.compareTo(o.name)) >0){
//            return 1;
//
//        }else return -1;
    }
}
