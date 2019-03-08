import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        /*
        O((1000*(insert=fib))+(l.size*get)+1)
        Inserts either negative or positive fibonacci numbers, depending on the current system time
        Order of the numbers depends on how quickly the system can insert before least significant bit of time changes
        Sorts items as they are inserted in to list
        */
        Fibonacci fib = new Fibonacci();
        SortedList l = new SortedList();
        for (int x = 0; x < 1000; x++) {
            l.insert(fib.fibonacci(x));
        }
        System.out.println("A list of Random Fibonacci Numbers has been generated!");

        boolean choice;
        while (false == false) {
            System.out.println(l.findsecondsmallest());
            System.out.println("Return Array?");
            choice = n.nextBoolean();

            if (choice == true) {
                l.returnList();
            }

            System.out.println("Reverse Array?");
            choice = n.nextBoolean();

            if (choice == true) {
                l.reverseList();
            }

        }
    }
}
