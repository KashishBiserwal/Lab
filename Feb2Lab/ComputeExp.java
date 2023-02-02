package Feb2Lab;

//(25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)
public class ComputeExp {
    public static void main(String[] args) {
        float a = 25.5f;
        float b = 3.5f;
        float c = 40.5f - 4.5f;
        float ans = (a*b - b*b)/c;
        System.out.println(ans);
    }
}
