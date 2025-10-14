package Method.Strings;

public class String_Equals2 {
    public static void main(String[] args) {
        String s1 = "Vicky"; // SCP
        String s2 = "Vicky"; // SCP
        String s3 = new String("Vicky"); // OA
        String s4 = new String("vicky"); // OA
        // SCP = 1, OA = 2
        System.out.println(s1 == s2); // same in SCP so it is true
        System.out.println(s1 == s3); // checking references so it is not equal
        System.out.println(s3 == s4); // same as above

        // checking based on values -> equals()
        System.out.println(s1.equals(s3)); // based on values
        System.out.println(s2.equals(s3)); // based on values
        System.out.println(s3.equals(s4)); // based on values
        System.out.println(s4.equalsIgnoreCase(s1)); // it will check values without case sensitive
        System.out.println(s1.equalsIgnoreCase(s4)); // same as above
    }
}
