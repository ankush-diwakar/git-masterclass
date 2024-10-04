public class fk {

    // Method to perform binary search
    public int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (arr[mid] == target) {
                return mid;
            }

            // If target greater, ignore left half
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                // If target is smaller, ignore right half
                right = mid - 1;
            }
        }

        // Target not present in array
        return -1;
    }

    public static void main(String[] args) {
        fk search = new fk();
        int[] arr = { 2, 3, 4, 10, 40 };
        int target = 10;
        int result = search.binarySearch(arr, target);

        if (result == -1) {
            System.out.println("Element not present in array");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}