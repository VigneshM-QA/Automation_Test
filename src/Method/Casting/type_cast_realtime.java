package Method.Casting;

public class type_cast_realtime {
    public static void main() {
        //  Example 1:
        long phone_number = 98765432l;
        //  short number1 = phone_number; // can't do type casting directly (by JVM)
        short number = (short) phone_number; // Narrowing (large to small conversion) data loss may occur (done by User)
        System.out.println(number);

        // Example 2:
        int course_amount = 1000;
        float GST = 18.50f;
        int total_course_amount = course_amount + (int) GST; // data loss may occur while float to int conversion
        System.out.println(total_course_amount);
    }
}
