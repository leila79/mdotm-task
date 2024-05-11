package task.engineering;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MySelectionTool implements SelectionTool{
    @Override
    public int findKthLargestElement(int[] nums, int k) {
        int[] kLargest = Arrays.stream(nums).limit(k).toArray();
        Map<String, Integer> result = minValue(kLargest);
        int min = result.get("min");
        int index = result.get("index");
        for (int i = k; i < nums.length; i++) {
            if (nums[i] > min){
                kLargest[index] = nums[i];
                result = minValue(kLargest);
                min = result.get("min");
                index = result.get("index");
            }
        }
        return min;
    }

    private Map<String, Integer> minValue(int[] nums){
//        int min = Arrays.stream(nums).min().orElseThrow();
//        int index = Arrays.stream(nums).boxed().toList().indexOf(min);
        int index = 0;
        int min = nums[index];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min){
                min = nums[i];
                index = i;
            }
        }
        HashMap<String, Integer> result = new HashMap<>();
        result.put("min", min);
        result.put("index", index);
        return result;
    }
}
