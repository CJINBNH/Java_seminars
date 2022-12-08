import java.util.Comparator;

public class IntegerComparator implements Comparator<Integer> {
    /* (non-Javadoc)
     * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
     */
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}
