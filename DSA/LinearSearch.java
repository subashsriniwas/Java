public class LinearSearch {
    public static void main(String a[]) {

        int nums[] = {2, 3, 4, 6, 7, 9, 10};
        int target = 87;
        boolean found = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                System.out.println("Target found at index: " + i);
                break;
            }
        }

        if (!found) {
            System.out.println("Target is not found in the array.");
        }
    }
}
