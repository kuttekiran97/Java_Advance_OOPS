package Final_Finally_Finalize.Finalize;


class Student{
    void print(){
        System.out.println("This is print");
    }


    //Since the Java 9. "finalize" method is deprecated,below code will not run
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Hey, Finalize method is executing");
    }


}

public class Finalize {


    public static void main(String[] args) {

        Student st = new Student();
        st.print();

        System.gc();
        System.out.println("This is end of the execution");

    }
}

//https://www.scaler.com/topics/finalize-method-in-java/
