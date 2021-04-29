package loops_strings;

public class FirstCharUpper {

    public static String capFirst(String str){
        String cap = str.substring(0, 1).toUpperCase() + str.substring(1);
        //System.out.println(cap);

        return cap;
    }
}
