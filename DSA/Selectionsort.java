//big O notation = O(n2)

public class Selectionsort{
    public static void main(String a[]){
        
        int nums[] = {9,5,7,1,4,2,8};
        int size = nums.length;
        int temp = 0;
        int minIndex = 0;

        System.out.println("Before sorting : ");

        for (int n : nums)
            System.out.print(n + " ");
        System.out.println();
        
        for (int i=0; i<size-1; i++){
            minIndex = i;
            for (int j=i+1; j<size; j++){
                if(nums[minIndex] > nums[j])
                    minIndex = j;
            }
        temp = nums[minIndex];
        nums[minIndex] = nums[i];
        nums[i] = temp;
        }
    System.out.println("After sorting : ");

    for (int n : nums)
        System.out.print(n + " ");
    }
}