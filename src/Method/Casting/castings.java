package Method.Casting;

public class castings {
    public static void main() {
        //Type casting -> converting data types
        // Widening -> Implicit casting, Explicit casting --- lossless
        byte b = 100;
        int a = b; // can store in int (Byte to Int -> small to large ) implicit casting done by JVM
        int a1 = (int) b; // Explicit casting outer of changing into integer datatype
        System.out.println(a1);

        //Narrowing (converting large to small datatypes) -> Implicit casting, Explicit casting, loss
        int value = 200;
        //byte b1 = value;  invalid -- implicit casting -- JVM
        byte b1 = (byte) value; // valid -- Explicit casting -- by user
        System.out.println(b1);
    }
}
