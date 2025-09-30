package Method.Loops.For_Loop;

public class Questions {
    public static void main(String[] args) {

        // ********** condition is more important to exit the loop **********

//        // interview quesions:
//        final boolean b1 = true;
//        for(int i=0 ; b1; i++) {
//        System.out.println("Hello"); // it will print infinite times since b1 is true
//    }
//        for(int j = 0;  ; ) {
//            System.out.println("hi");  // it will go infinite loop because of no condition and updation
//        }

        for (; ; ) {
            System.out.println("bye");  // it will go infinite loop since there is no initialization, condition and updation
        }
    }
}

