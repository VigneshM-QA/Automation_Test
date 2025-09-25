package Method.constants;

public class constants {
    public static void main() {
        int a = 34;
        // after 10000 line suddenly we change the value of a
        a = 45;
        System.out.println(a); // it will change based on the changes

        final int age = 56;
        System.out.println(age);

        age = 65; // cannot change the age value because of final keyword

        final string name = "vicky";
        System.out.println(name);

        name = "Rocky"; // it should not allow because of final and the name would be constant as "vicky"

    }
}
