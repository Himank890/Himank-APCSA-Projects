package warmup;
// Problem 1 Warmup Project
public class Main {

    public static void main(String[] args) {
        // Your code here.
        int temp = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                temp += i;
            }
        }
        System.out.println(temp);
    }
}
