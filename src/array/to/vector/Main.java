package array.to.vector;

public class Main {
    /**
     * Internally a Vector of the Collection Framework works in the way, that whenever
     * the full capacity of an array is reached,
     * a new array will be created.
     * This new array will have 2-times the size of the previous array and every element of the previous
     * array will be copies/includeded i.e. added into the new created larger array.
     * This cycle will be repeated as often as needed.
     * Essentially this is how a vector works in Java.
     */

    public static void main(String[] args) {
        int[] arrayOriginal = new int[10];
        int[] array = arrayOriginal;
        int size = array.length;
        int j = 0;
        /**
         * If no termination condition setted, then the program would effectively
         * increase the size of the array ifinitely often, thus for testing reasons
         * we want to set a termination condition:
         * In the example below the resulting array shall have a size of at least
         * 20 times the size of the original created array and afterwards the program
         * shall terminate at the next opportunity.
         */
        int terminationCondition = 20 * arrayOriginal.length;

        for (int i = 0; i < size; i++) {
            if (size >= terminationCondition) {
                break;
            }
            if (i >= size - 1 || j >= size - 1) { // when the current array has reached its full capacity
                int[] newArray = new int[size * 2];
                size = newArray.length;
                for (j = 0; j < size; j++) {
                    newArray[j] = j + 1;
                    System.out.println(newArray[j]);
                }
            } else {
                array[i] = i + 1;
                System.out.println(array[i]);

            }
        }
    }
}
