package Annoatations;

public class Main {
    public static void main(String[] args) {


        cat mycat = new cat("Stella");


        if(mycat.getClass().isAnnotationPresent(veryImportant.class)){
            System.out.println("This has annotation");
        }else{
            System.out.println("No Annotation");
        }


    }
}
