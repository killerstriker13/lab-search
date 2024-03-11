import java.util.function.Predicate;

public class Utils {
    /**
     * Search values for the first value for which pred holds.
     */
    public static <T> T search(Iterable<T> values, Predicate<? super T> pred) throws Exception {
       for (T value : values) {
            if (pred.test(value)) {
                return value;
            }
       }
       throw new Exception("Value does not appear");
    } // search(Iterable<T>, Predicate<? super T>)

    /**
    * Search for val in values, return the index of an instance of val.
    *
    * @param values
    *   A sorted array of integers
    * @param val
    *   An integer we're searching for
    * @result
    *   index, an integer
    * @throws Exception
    *   If there is no i s.t. values[i] == val
    * @pre
    *   values is sorted in increasing order.  That is, values[i] <
    *   values[i+1] for all reasonable i.
    * @post
    *   values[index] == val
    */
    public static int binarySearch (int[] vals, int val) throws Exception {
        int lb = 0;
        int ub = vals.length;
        do {
            int mid = lb + ((ub - lb)/2);
            if (val == vals[mid]){
                return mid;
            } else if (val > vals[mid]){
                lb = mid+1;
            } else {
                ub = mid-1;
            }
        } while (lb < ub);
        throw new Exception(val + " does not exist");
    } // binarySearch
}