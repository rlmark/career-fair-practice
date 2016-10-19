
public class Sorters {

/*
    // The goal is to sort an array in place.

    // This is the original code
    // Is this a singleton object? Why does it have []??? Why can't it exist outside another class?
    public static Object[] sadfaceSort(Object[] original) {
        int N = original.length;
        Object[] result = original; // Apparently this is "redundant" (Protip: two variables are now pointing to the same thing)

        for (int i = 1; i < N; i ++) { // Problem: array index starts with 0, not 1.
            int minPos = i; // the minimum position starts out at the first index in our for loop...
            // currently 1, but should be 0
            Object minValue = result[minPos];
            for (int j = i+1; j <= N; i++) { // doubly incrementing i here.  also j should be less than N?

                // compare to works if the left thing is less than the right thing, it will return a negative number,
                // if the l is more htan the right, it will return +, if == then 0
                if (result[j].compareTo(result[i]) > 0) { // this line flat out doesn't compile. What does compareTo return?
                    // The greater than is the wrong direction
                    // why are we comparing if the elements at the two indices are greater than zero? Why are we not just comparing the elements?
                    minValue = result[j]; // reassigning the minimum value
                    // shouldn't we also reassign the minimum position? Or was that just a starting point...
                }
            }
            Object temp = result[minPos]; // initialize a temp object, holding the value of the element at the current minimum index
            result[i] = result[minPos]; // then reassign the current value at index i to the value at the minumum position
            result[minPos] = temp; // then reassign the minimum position's value to be... the result at minimum position????
        }
        return result;
    }
 */

    public Comparable[] happySort(Comparable[] original) {
        int N = original.length;
        Comparable[] result = original.clone(); // I don't know why but Jos said to do this

        // Note: this does the same thing as clone
        Comparable[] resultClone = new Comparable[original.length];
        for (int i = 0; i < original.length; i++) {
            resultClone[i] = original[i];
        }

        for (int i = 0; i < N; i ++) {
            int minPos = i;
            // Object minValue = result[minPos]; Do not need this! Because we are comparing values in the comparator
            for (int j = i+1; j < N; j++) {
                if (result[j].compareTo(result[minPos]) < 0) {// Wtf is compareTo? Should I write this method?
                    // minValue = result[j]; // Note do not need this! can just keep track of index
                    minPos = j; // do I need to reset the minimum position? Not sure
                }
            }
            Comparable temp = result[i]; // As far as I can tell, I want to take my current value, store it in a temp var
            result[i] = result[minPos]; // then reassign my current value [i] to be the new minimum value
            result[minPos] = temp; // Swapping the result at minimum position to be the result at index i
        }
        return result;
    }

}
