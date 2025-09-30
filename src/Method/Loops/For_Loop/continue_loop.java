package Method.Loops.For_Loop;

public class continue_loop {
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++) {
            if(i == 5){   // skip the condition and proceed the loop
                continue;
            }
            System.out.println(i);
        }
        //example : only print the even number

        for(int j = 0; j<=20; j++){
            if(j%2==0){
                System.out.println("Even" + j);
                continue;
            }
            System.out.println(j);   // if you need only even you can comment this line else it will show odd in center
        }

    }
}
