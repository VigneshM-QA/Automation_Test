package Method.Strings;

public class Immutable_fix {
    public static void main(String[] args) {
        String name = "Vicky";
        name = name.toUpperCase(); // it will create another memory in SCP-String Constant Pool
        // name = Vicky
        // name.toUpperCase() = VICKY  (This is called assigning into the name itself
        // Strings are Immutable and cannot change

        System.out.println(name);
    }
}
