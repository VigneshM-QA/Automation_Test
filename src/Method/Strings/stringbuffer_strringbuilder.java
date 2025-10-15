package Method.Strings;

public class stringbuffer_strringbuilder {
    public static void main(String[] args) {

        StringBuffer obj1 = new StringBuffer("Sample");
        System.out.println(obj1.append("collection"));

        // String buffer is a Thread-safe(each operation sequentially working one by one) -- Synchronized
        // it is slow


        StringBuilder obj2 = new StringBuilder("Sample");
        System.out.println(obj2.append("condition"));
        // Not a threadsafe
        // it is fast
    }
}
