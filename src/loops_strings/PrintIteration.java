package loops_strings;

public class PrintIteration {

    public static void main(String[] args){

        for (int i = 0; i < 10; i++){
            printForNthTime(i);
        }
    }

    public static void printForNthTime(int n){
        n = n + 1;
        System.out.println("I am now printing for the " + n + "th time");
    }
}
