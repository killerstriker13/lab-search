import java.util.ArrayList;
import java.util.Arrays;
import java.io.PrintWriter;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Experiments {
    public static void main(String[] args) {
        PrintWriter pen = new PrintWriter(System.out, true);
        String[] tmp = 
        new String[] { "alpha", "bravo", "charlie", "delta", "echo",
                       "foxtrot", "golf", "hotel", "india",
                       "juliett", "kilo", "lima", "mike", 
                       "november", "oscar", "papa", "quebec",
                       "romeo", "sierra", "tango", "uniform",
                       "victor", "whiskey", "xray", "yankee", "zulu" };
    ArrayList<String> strings = new ArrayList<String>(Arrays.asList(tmp));

    try {
        String ex1b = Utils.search(strings, (s) -> s.length() == 6);
        pen.println(ex1b);

        String ex1d = Utils.search(strings, (s) -> s.contains("u"));
        pen.println(ex1d);
    } catch (Exception e) {}
        for (int s = 1; s <= 32; s++) {
            int[] arr = new int[s];
            for (int k = 1; k <= s; k++) {
                arr[k-1] = 2 * (k-1); 
            }
            for (int i = 0; i <= s-1; i++) {
                System.err.println(2*i + " " + Arrays.toString(arr));
                /** 
                if (Utils.binarySearch(arr, 2*i) == i) {
                    pen.println("True");
                }
                try {
                    Utils.binarySearch(arr, 2*i+1);
                } catch (Exception e) {
                    pen.println("Throws appropriate Exception.");
                }
            }
            try {
               Utils.binarySearch(arr, -1);
            } catch (Exception e) {
                pen.println("Throws appropriate Exception.");
            }*/
            try {
                int result = Utils.binarySearch(arr, 2*i);
                if (result != i) {
                  System.err.println("binarySearch(" + 2*i + ") returned " + result);
                }
              } catch (Exception e) {
                System.err.println("binarySearch(" + 2*i + ") threw an unexpected exception " + Arrays.toString(arr));
              } // try/catch

              try {
                System.err.println((2*i+1) + " " + Arrays.toString(arr));
                int result = Utils.binarySearch(arr, 2*i + 1);
              } catch (Exception e) {}
        }
    }
    }
}
