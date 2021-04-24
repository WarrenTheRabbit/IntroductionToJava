package SingleDimensionalArrays.Exercise7_2;

public class ReverseArray {
    public static void main(String[] args) {
        // Initialise sequence to be reversed.
        int[] sequence = {1,2,3,4,5,6};

        // Test printReverse()
        System.out.println("Testing print Reverse():");
        printReverse(sequence);

        // Test reverseArray()
        System.out.println("Testing reverseArray():");
        System.out.println();
        reverseArray(sequence);
        for (int number : sequence) {
            System.out.println(number);
        }

        // Test createReversedCopy()
        System.out.println("Testing createReversedCopy():");
        int[] restoredSequence = createReversedCopy(sequence);
        for (int number : restoredSequence) {
            System.out.println(number);
        }

    }

    // Print the contents of the array in reverse order.
    public static void printReverse(int[] sequence) {

        int lastIndex = sequence.length - 1;
        for (int i = lastIndex; i >= 0; i--) {
            System.out.println(sequence[i]);
        }
    }

    // Create a reversed copy of the array.
    public static int[] createReversedCopy(int[] sequence) {
        int[] reversedCopy = new int[sequence.length];

        for (int n = 0; n < sequence.length; n++) {
            int nthLastIndex = sequence.length - n - 1;
            reversedCopy[n] = sequence[nthLastIndex];
        }
        return reversedCopy;
    }

    // Reverse the array in place.
    public static void reverseArray(int[] sequence) {
        // For every pair of items occurring at the nthIndex and
        // nthLastIndex, swap them once.
        for (int n = 0; n < sequence.length / 2; n++) {
            // Declare the index of the item that will be swapped
            // with the item at the nth index.
            int nthLastIndex = sequence.length - 1 - n;

            // Store a temporary copy of the nthItem.
            int nthItem = sequence[n];

            // Set element at nth index to nth last item.
            sequence[n] = sequence[nthLastIndex];
            // Set element at nth last index to copy of the
            // nthItem.
            sequence[nthLastIndex] = nthItem;
        }

    }


    // Return a new array that is the reverse of the source array.
}
