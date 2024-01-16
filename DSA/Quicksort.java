//big O notation = O(n log n) && O(n2) in worst case scenario

public class Quicksort {
    public static void main(String a[]){

        int nums[] = {9,5,7,1,4,2,8};
        int size = nums.length;
        System.out.println("Before sorting : ");

        for (int n : nums)
        System.out.print(n + " ");

        quickSort(nums, 0, size-1);

        System.out.println();
        System.out.println("After sorting : ");
        for (int n : nums)
            System.out.print(n + " ");
    }
    private static void quickSort(int nums[], int low, int high){
        if(low<high){
            int pi = partition(nums, low, high);
            quickSort(nums, low, pi-1);
            quickSort(nums, pi+1, high);
        }
    }
    private static int partition(int nums[], int low, int high){
        int pivot = nums[high];
        int i = low-1;
        for(int j=low; j<high; j++){
            if (nums[j]<pivot){
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            } 
        }
        int temp = nums[i+1];
        nums[i+1] = nums[high];
        nums[high] = temp;
        return i+1;
    }
}
