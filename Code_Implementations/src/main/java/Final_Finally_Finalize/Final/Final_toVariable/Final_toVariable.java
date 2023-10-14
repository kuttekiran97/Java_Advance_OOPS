package Final_Finally_Finalize.Final.Final_toVariable;

/**
 * final with Variables: The value of the variable cannot be changed once initialized.
 */

public class Final_toVariable {
    public static void main(String[] args) {
        // Non final variable
        int a = 5;

        // final variable
        final int b = 6;

        // modifying the non final variable : Allowed
        a++;

        /**
         * modifying the final variable :
         * Immediately gives Compile Time error.
        **/

        // b++;  --> This line will compiler time error

    }

}
