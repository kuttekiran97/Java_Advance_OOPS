package Generics;

public class Printer<T extends Number> extends Parent {
    T value;
    public Printer(T value){
        this.value = value;
    }
    public void print(){
        System.out.println("Value to be printed is " + value);
    }


}
