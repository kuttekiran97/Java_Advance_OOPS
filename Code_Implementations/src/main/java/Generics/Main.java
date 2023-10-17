package Generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Printer<Integer> p = new Printer<>(10);
        p.print();



        Printer<Float> p1 = new Printer<>(10.56f);
        p1.print();

        p.show();

        //Generic method calls
        shout(10);
        shout(15.23);
        shout("Kiran");
        shout(new Parent());


        List<Integer> list = new ArrayList<>();
        list.add(10);
        printList(list);

    }

    // Generics for methods
    public static <T> void shout(T obj){
        System.out.println(obj);
    }

    //Wild-Card
    public static void printList(List<?> myList){
        System.out.println(myList);
    }


}

/*
 * For more info
 * https://www.youtube.com/watch?v=K1iu1kXkVoA
 */
