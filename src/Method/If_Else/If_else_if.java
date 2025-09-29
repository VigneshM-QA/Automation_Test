package Method.If_Else;

public class If_else_if {
    public static void main() {
        String a = "orange";
        String b = "orange";

        if(a != b){
            System.out.println("Mango is good");
        } else if (b != a) {
            System.out.println("Orange is good");
        }
        else {
            System.out.println("Both are equal");
        }
    }
}
