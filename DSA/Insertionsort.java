//big O notation = O(n2)

public class Insertionsort{
    public static void main(String a[]){

        int nums[] = {9,5,7,1,4,2,8};
        int size = nums.length;
        System.out.println("Before sorting : ");

        for (int n : nums)
            System.out.print(n + " ");
        
        for (int i=1; i<size; i++){
            int key = nums[i];
            int j = i-1;
            while (j >= 0 && nums[j]>key) {
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
        System.out.println();
        System.out.println("After sorting : ");
    
        for (int n : nums)
            System.out.print(n + " ");
    }
}
