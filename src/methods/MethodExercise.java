public class MethodExercise {

        public static void main(String[] args){
            sum(2 ,4 ,7);

            printThrice("Hello");

            calcBMI(84, 1.8);

            makeUpperCase("Hello");

            stringLength("hello");
        }

        public static int sum(int firstInt, int secondInt, int thirdInt){
            int sum = firstInt + secondInt + thirdInt;
            System.out.println(sum);
            return sum;
        }

        public static void printThrice(String stringName){
            System.out.println(stringName);
            System.out.println(stringName);
            System.out.println(stringName);
        }

        public static double calcBMI(double weight, double height){
            double BMI = weight / (height * height);
            System.out.println(BMI);
            return BMI;
        }

        public static String makeUpperCase(String word){
            String largeWord = word.toUpperCase();
            System.out.println(largeWord);
            return largeWord;
        }

        public static int stringLength(String letters){
            int amountChars = letters.length();
            System.out.println(amountChars);
            return amountChars;
        }
}
