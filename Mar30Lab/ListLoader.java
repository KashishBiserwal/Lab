package Mar30Lab;
import java.util.ArrayList;

public class ListLoader {
    ArrayList<Integer> L;

    public void loadList(Integer startNumber, Integer lastNumber) {
        L = new ArrayList<>();
        for (int i = startNumber; i <= lastNumber; i++) {
            L.add(i);
        }
    }

    public static void main(String[] args) {
        ListLoader listLoader = new ListLoader();
        long startTime = System.currentTimeMillis();
        listLoader.loadList(0, 1000000);
        long endTime = System.currentTimeMillis();
        long responseTime = endTime - startTime;
        System.out.println("Response Time: " + responseTime + " milliseconds");
    }
}
