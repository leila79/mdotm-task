package task.engineering;

import java.util.HashMap;
import java.util.Map;

public class QuickSelectionTool implements SelectionTool{
    @Override
    public int findKthLargestElement(int[] nums, int k) {
        Map<String, Integer> result = quickSelect(nums, 0, nums.length);
        int pivot = result.get("pivot");
        int pivotIndex = result.get("index");

        while (pivotIndex != nums.length - k){
            if (pivotIndex < nums.length - k){
                // do quick select on the right side
                result = quickSelect(nums, pivotIndex+1, nums.length);
                pivot = result.get("pivot");
                pivotIndex = result.get("index");
            }
            else if (pivotIndex > nums.length - k){
                // do quick select on the left side
                result = quickSelect(nums, 0, pivotIndex);
                pivot = result.get("pivot");
                pivotIndex = result.get("index");
            }
        }
        return pivot;
    }

    private  Map<String, Integer> quickSelect(int[] nums, int left, int right) {
        right -= 1;
        int pivot = nums[left];
        int pivotIndex = left;
        while (left < right){
            // case 1
            // put smaller than pivot, on the left
            boolean flagL = true;
            while (flagL){
                if (left+1 < nums.length && nums[left+1] < pivot){
                    swap(nums, pivotIndex, left+1);
                    pivotIndex = left+1;
                    left++;
                }
                else {
                    flagL = false;
                }
            }
            // case 2
            // put greater than pivot, on the right
            boolean flagR = true;
            while (flagR){
                if (right >= 0 && nums[right] >= pivot){
                    right--;
                }
                else {
                    flagR = false;
                }
            }

            // case 3
            // (nums[l] > pivot) and (nums[R] < pivot) and (R > L)
            if (right > left+1){
                swap(nums, right, left+1);
            }
        }

        HashMap<String, Integer> result = new HashMap<>();
        result.put("pivot", pivot);
        result.put("index", pivotIndex);
        return result;
    }

    private  void  swap(int[] a, int i, int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
