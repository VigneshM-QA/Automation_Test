package Method.Operators;

public class Terniary {
    public static void main() {
        // condition ? "Positive" :  "Negative"
        //Example 1:
        int a = -5;
        System.out.println(a > 0 ? "correct" : "Non-correct");

        //Example 1:
        int age = 21;
        System.out.println(age > 18 ? "Allowed to vote" : "Non allowed to vote");

        //Example 3:
        //Nested ternary -> condition 1 ? "expression1": (condition 2 ? condition 3 : "expression 2);
        //Largest number among three characters using ternary
        int num1 = 50;
        int num2 = 35;
        int num3 = 45;
        String the_numbers_are = (num1 > num2) ? "num1 is large" : (num2 > num3) ? "num2 is large" : "num3 is large";
        System.out.println("The largest number is:"+the_numbers_are);
    }
}
