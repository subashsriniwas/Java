//big O notation = O(n2)

public class Bubblesort {
    public static void main(String a[]){

        int nums[] = new int[10];
        int size = nums.length;
        int temp = 0;

        //int nums[] = {9,4,5,7,1,4,2,8};
        // int size = nums.length;
        for (int i=0; i<nums.length; i++){
            nums[i] = (int) (Math.random()*10);
        }

        System.out.println("Before sorting : ");
        for (int n : nums)
            System.out.print(n + " ");

        for (int i=0; i<size; i++){
            for (int j=0; j<size-1; j++){
                if(nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("After sorting : ");
        for (int n : nums)
            System.out.print(n + " ");
    }
}
