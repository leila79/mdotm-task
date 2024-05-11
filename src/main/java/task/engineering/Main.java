package task.engineering;

import java.util.*;

public class Main {

    // Algorithm 1
    // with time complexity of O((n-k)k)
    // best case k = 1 or k = n --> O(n)
    // worst case k = n/2 --> O(n^2)




    // Algorithm 2
    // best case is when we can partition the array in halves --> O(n)
    // worst case is when we choose the largest/smallest value as the pivot --> O(n^2)





    // Execution
    public static void main(String[] args) {

        int k = 2;
        int[] numbers = {5,5};

        QuickSelectionTool quickSelectionTool = new QuickSelectionTool();
        MySelectionTool mySelectionTool = new MySelectionTool();

        int result = quickSelectionTool.findKthLargestElement(numbers, k);
//        int result = mySelectionTool.findKthLargestElement(numbers, k);
        System.out.println("The " + k + "th largest element is: " + result);

    }


}