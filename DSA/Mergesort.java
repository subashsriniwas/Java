public class Mergesort {
    public static void main(String a[]){

        int[] arr = {9,5,7,1,4,2,8};
        int size = arr.length;
        System.out.println("Before sorting : ");

        for (int n : arr)
        System.out.print(n + " ");

        mergeSort(arr, 0, size-1);
        System.out.println();
        System.out.println("After sorting : ");
        for (int n : arr)
            System.out.print(n + " ");

    }

    private static void mergeSort(int[] arr, int left, int right) {
        int mid = (left+right)/2 ;
        // int mid = left + (right - left) / 2;
        if (left<right) {
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }   
    }

    private static void merge(int[] arr, int left, int mid,int right) {

        int n1 = mid-left+1; 
        int n2 = right-mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for(int x=0; x<n1; x++)
            leftArr[x] = arr[left + x];
        
        for(int x=0; x<n2; x++)
            rightArr[x] = arr[mid + 1 + x];

        int i = 0;
        int j = 0;
        int k = left;
        while (i<n1 && j<n2) {
            if (leftArr[i] <= rightArr[j]){
                arr[k] = leftArr[i];
                i++;
            }
            else{
                arr[k] = rightArr[j]; 
                j++;
            }
            k++;
        }
        while (i<n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j<n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}

