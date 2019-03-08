/**
 * An interface which represents a Sorted List of integers.
 * Implementations do not necessarily need to keep their lists sorted, but they need to return the elements
 * in sorted order.
 */
public interface SortedListable {

    /**
     * Inserts number into the list
     * @param number
     */
    void insert(int number);

    /**
     * Gets the "i"-th smallest number in the list.
     * @param i
     * @return the i-th smallest number in the list
     * @throws IndexOutOfBoundsException if i is not between 0 and size() - 1
     */
    int get(int i);

    /**
     * Returns the number of elements in this list.
     * @return the number of elements in this list
     */
    int size();
}
