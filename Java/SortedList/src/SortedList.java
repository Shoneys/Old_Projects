import java.util.Arrays;

public class SortedList implements SortedListable {
    private int size = 0;
    public Integer[] list = new Integer[1];

    public void insert(int number) {
        /*
         O(1(create templist)+4*size(copy+paste list)+1(size++))

         Binary Insertion Sort
            Worst Case Performance: O(log n)
            Best Case Performance: O(1)

         @param number: the number to be appended

         int[] templist: temporary storage for list while it is copied
         System.arraycopy(original list, position to begin copy, target list, position to begin paste, amount of elements to copy): copies contents of list in to templist O(list.length)
         int j: finds the absolute position of where number should be inserted in to list, Arrays.binarySearch & using math.abs
            Arrays.binarySearch: uses a
         size++: increases size counter


        Adds contents of list to templist
        Finds absolute position of where number should be placed in list using binary search
        Shifts array to one location right
        Copies remaining array past that position, shifts it one element to the right
        Places element at its correct location
        assigns main list memory address equal to templist
        */
        Integer[] templist = new Integer[size + 1];

        System.arraycopy(list, 0, templist, 0, size);
        int j = Math.abs(Arrays.binarySearch(templist, 0, size, number) + 1);
        System.arraycopy(templist, j, templist, j + 1, size - j);
        templist[j] = number;
        list = templist;

        size++;
    }

    public int get(int i) throws IndexOutOfBoundsException {
        /*
        O(1)
        If element is outside range of Array, throws IndexOutOfBoundsException
        */
        if (i < 0 || i >= list.length) {
            throw new IndexOutOfBoundsException("No element at position " + i + "; size = " + size());
        }
        return list[i];
    }

    public void reverseList() {
        for (int i = 0; i < size / 2; i++) {
            int temp = list[i];
            list[i] = list[size - i - 1];
            list[size - i - 1] = temp;
        }


    }

    public void returnList() {
        for (int i = 0; i < size; i++) {
            System.out.println(get(i));
        }
    }

    public int findsecondsmallest() {
        int tempsecondsmallest = list[0];
        int tempsmallest = list[1];

        for (int i = 0; i < size/2; i++) {
            if (list[i] < tempsmallest){
                tempsecondsmallest=tempsmallest;
                tempsmallest=list[i];
            }
            if(list[size-i-1]<tempsmallest){
                tempsecondsmallest=tempsmallest;
                tempsmallest=list[i];
            }
        }
        return tempsecondsmallest;
    }

    public int size() {
        /*
        O(1)
        Returns value of size variable
        Size starts at zero; increments by 1 each time an element is inserted in to array
        Allows outside access to size of this instance of SortedList
        */
        return size;
    }

}