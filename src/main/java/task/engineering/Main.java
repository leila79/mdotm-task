package task.engineering;

import java.util.*;

public class Main {

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