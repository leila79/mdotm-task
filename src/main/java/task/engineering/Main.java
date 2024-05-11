package task.engineering;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int k = 3;
        int[] numbers = {3, 2, 1, 5, 6, 4};

        QuickSelectionTool quickSelectionTool = new QuickSelectionTool();
        MySelectionTool mySelectionTool = new MySelectionTool();

        int quickSelectionResult = quickSelectionTool.findKthLargestElement(numbers, k);
        int mySelectionResult = mySelectionTool.findKthLargestElement(numbers, k);
        System.out.println("The " + k + "th largest element is using QuickSelection: " + quickSelectionResult);
        System.out.println("The " + k + "th largest element is using MySelection: " + mySelectionResult);

    }


}