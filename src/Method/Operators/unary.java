package Method.Operators;

public class unary {
    public static void main() {
        int a = 10;
        int b = 20;
        System.out.println(a+b); // performs addition based on the integer

        String first_name = "vicky";
        String last_name = "M";
        System.out.println(first_name+last_name); // performs concatination because of string
        // + unary operator concatenates based on the data type

        System.out.println(first_name + last_name + a + b); // from Left to Right it is working as concatenation since string is first
        System.out.println(a+b+first_name+last_name); // initailly it will do addition and then it will concatenate based on datatype

        System.out.println(first_name + last_name + (a+b)); // execute based on BODMAS rule
    }
}
