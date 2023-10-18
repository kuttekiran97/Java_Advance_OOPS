package Lamda_Expression;


@FunctionalInterface
interface A{
    void show();
}

@FunctionalInterface
interface C {
    int add(int a , int b);
}

//class B implements A{
//
//    @Override
//    public void show() {
//        System.out.println("Hi,I am show");
//    }
//}



public class Lambda_Exp {
    public static void main(String[] args) {
    A x = ()-> {
        System.out.println("Hey, i am lambda!");
    };
    x.show();

    //Passing argument to lambda and returning the value
    C c = (a,b)->{

        System.out.println("output is " + (a+b));
        return a+b;
    };
        int k = c.add(5,6);
        System.out.println(k);


    }
}
//https://www.youtube.com/watch?v=4HC_WyBSDGA