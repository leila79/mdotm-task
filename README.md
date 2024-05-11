# SelectionTool Libraries

## Overview
The `SelectionTool` libraries provide implementations of algorithms for finding the kth largest element in an array. Two implementations are provided: `QuickSelectionTool` and `MySelectionTool`. Both classes implement the `SelectionTool` interface.

## MySelectionTool
### Overview
The `MySelectionTool` class implements a custom selection algorithm to find the kth largest element in an array.

### Usage
To use the `MySelectionTool`, implement the `SelectionTool` interface and override the `findKthLargestElement` method. This method takes an integer array nums and an integer k, and it returns the kth largest element in the array.

### Example Usage:
```java
int[] nums = {3, 2, 1, 5, 6, 4};
int k = 2;
MySelectionTool selectionTool = new MySelectionTool();
int result = selectionTool.findKthLargestElement(nums, k);
System.out.println("The " + k + "th largest element is: " + result);
```

### Implementation Details
The `MySelectionTool` class iteratively selects the k largest elements from the input array and returns the kth largest element.

### Complexity Analysis
Time Complexity: O((n-k) * k). \
Space Complexity: O(k).

## QuickSelectionTool
### Overview
The `QuickSelectionTool` class implements the `Quickselect` algorithm to efficiently find the kth largest element in an unsorted array.

### Usage
To use the `QuickSelectionTool`, implement the `SelectionTool` interface and override the `findKthLargestElement` method. This method takes an integer array nums and an integer k, and it returns the kth largest element in the array.

Example Usage:
```java
int[] nums = {3, 2, 1, 5, 6, 4};
int k = 2;
QuickSelectionTool selectionTool = new QuickSelectionTool();
int result = selectionTool.findKthLargestElement(nums, k);
System.out.println("The " + k + "th largest element is: " + result);
```

### Implementation Details
The `QuickSelectionTool` class utilizes the `Quickselect` algorithm to partition the array and find the pivot element, which is the element at its correct sorted position.
The algorithm repeats recursively until the pivot index is equal to the target index, indicating that the kth largest element has been found.
### Complexity Analysis
Time Complexity: O(n) on average, O(n^2) in the worst case. \
Space Complexity: O(log n) on average, O(n) in the worst case.




