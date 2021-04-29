package OA_methods_loops;

public class MulitPrint {

    /**
     * Takes (String, int) and prints string number of times
     * designated by integer
     * */

    public static void main(String[] args) {

        intPrint("Hello", 6);
    }

    // Define method intPrint with parameters string = str and int = rep
    public static void intPrint(String str, int rep){

        // Run iteration rep number of times
        for (int i = 0; i < rep; i++){

            // print out str from input
            System.out.println(str);
        }
    }
}
