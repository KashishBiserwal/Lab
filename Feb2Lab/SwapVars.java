package Feb2Lab;

public class SwapVars {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("a: " + a +", b: " + b);
        //Swapping
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a and b after swapping: " + "a: " + a +", b: " + b);
    }
}
