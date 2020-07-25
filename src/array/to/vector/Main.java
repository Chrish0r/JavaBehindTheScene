package array.to.vector;

public class Main {
    /**
     * Internally a Vector of the Collection Framework works in the way, that whenever
     * the full capacity of an array is reached
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
         * In the example below the final array shall have a size of
         * 10 times the size of the original created array.
         * The arrays inbetween have each double the size of the precursor array.
         */
        int terminationCondition = 10 * arrayOriginal.length;
        int arrayId = 1;
        String indent = "   ";

        System.out.println(arrayId + ". array:");
        for (int i = 0; i <= size; i++) {
            if (i >= size || j >= size) { // when the current array has reached finally its full capacity
                arrayId = arrayId + 1;
                System.out.println();
                System.out.println(arrayId + ". array:");
                int[] newArray = new int[size * 2];
                size = newArray.length;
                for (j = 0; j < size; j++) {
                    if(j == terminationCondition) {
                        System.exit(0);
                    }
                    newArray[j] = j + 1;
                    System.out.print(indent + newArray[j]);
                }
            } else {
                array[i] = i + 1;
                System.out.print(indent + array[i]);
            }
        }
    }
}
