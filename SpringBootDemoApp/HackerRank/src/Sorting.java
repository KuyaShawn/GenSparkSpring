import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Sorting {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int numOfElem = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arrayList = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        // Track number of elements swapped during a single array traversal
        int numberOfSwaps = 0;

        // Write your code here
        for (int iteration = 0; iteration < numOfElem; iteration++) {
            for (int index = 0; index < numOfElem - 1; index++) {
                // Swap adjacent elements if they are in decreasing order
                if (arrayList.get(index) > arrayList.get(index + 1)) {
                    // creates a temporary variable for the highest element
                    int temporaryVariable = arrayList.get(index);

                    // swaps the index elements with the lowest value
                    arrayList.set(index, arrayList.get(index + 1));

                    // swaps the index elements with the highest value
                    arrayList.set(index + 1, temporaryVariable);

                    numberOfSwaps++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }
        bufferedReader.close();

        System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
        System.out.println("First Element: " + arrayList.get(0));
        System.out.println("Last Element: " + arrayList.get(arrayList.size() - 1));
    }
}
