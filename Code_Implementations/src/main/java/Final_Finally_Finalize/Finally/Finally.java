package Final_Finally_Finalize.Finally;

public class Finally {
    static void func1(){
        try{
            System.out.println("This is method1");
            int i = 10/0;
        }catch (Exception e){
            System.out.println("Division error");
        }
        finally {
            System.out.println("Executing Finally block");
        }
    }

    static void func2(){
        try{
            System.out.println("This is method2");
            return;
        }catch (Exception e){
            System.out.println("Error");
        }
        finally {
            System.out.println("Executing Finally block");
        }

        System.out.println("Heyyyyyyyyyyyyyyy");
    }
    public static void main(String[] args) {
        func2();
    }
}
