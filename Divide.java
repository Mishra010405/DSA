// public class javaBasics {

//     public static void PrintArr(int arr[]) {
//         for(int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void QuickSort(int arr[], int si, int ei) {

//         if(si >= ei) {
//             return;
//         }

//         int pIdx = Partition(arr, si, ei);

//         // Left part
//         QuickSort(arr, si, pIdx - 1);

//         // Right part
//         QuickSort(arr, pIdx + 1, ei);
//     }

//     public static int Partition(int arr[], int si, int ei) {

//         int pivot = arr[ei];
//         int i = si - 1;

//         for(int j = si; j < ei; j++) {

//             if(arr[j] <= pivot) {
//                 i++;

//                 // Swap
//                 int temp = arr[j];
//                 arr[j] = arr[i];
//                 arr[i] = temp;
//             }
//         }

//         i++;

//         // Place pivot at correct position
//         int temp = arr[ei];
//         arr[ei] = arr[i];
//         arr[i] = temp;

//         return i;
//     }

//     public static void main(String args[]) {

//         int arr[] = {6,3,9,8,2,5};

//         QuickSort(arr, 0, arr.length - 1);

//         PrintArr(arr);
//     }
// }


// Merge Sort in the Strings...


// public class javaBasics {

//     public static void mergeSort(String arr[], int si, int ei) {

//         if(si >= ei) {
//             return;
//         }

//         int mid = (si+ei)/2;

//         // Left half
//         mergeSort(arr, si, mid);

//         // Right half
//         mergeSort(arr, mid+1, ei);

//         // Merge
//         merge(arr, si, mid, ei);
//     }


//     public static void merge(String arr[], int si, int mid, int ei) {

//         String temp[] = new String[ei-si+1];

//         int i = si;
//         int j = mid+1;
//         int k = 0;

//         while(i <= mid && j <= ei) {

//             if(arr[i].compareTo(arr[j]) < 0) {
//                 temp[k++] = arr[i++];
//             } else {
//                 temp[k++] = arr[j++];
//             }
//         }

//         while(i <= mid) {
//             temp[k++] = arr[i++];
//         }

//         while(j <= ei) {
//             temp[k++] = arr[j++];
//         }

//         for(k=0, i=si; k<temp.length; k++, i++) {
//             arr[i] = temp[k];
//         }
//     }


//     public static void main(String args[]) {

//         String arr[] = {"sun","earth","mars","mercury"};

//         mergeSort(arr, 0, arr.length-1);

//         for(int i=0; i<arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }


// Return The Majority Elements....

// public class javaBasics {

//     public static int majorityElement(int nums[]) {

//         int count = 0;
//         int candidate = 0;

//         for(int i=0; i<nums.length; i++) {

//             if(count == 0) {
//                 candidate = nums[i];
//             }

//             if(nums[i] == candidate) {
//                 count++;
//             } else {
//                 count--;
//             }
//         }

//         return candidate;
//     }

//     public static void main(String args[]) {

//         int nums[] = {2,2,1,1,1,2,2};

//         System.out.println(majorityElement(nums));
//     }
// }


// Another Method o Count the Number of Elements...
// public class javaBasics {

//     public static int majorityElement(int nums[]) {

//         int majorityElements = nums.length / 2;

//         for(int i = 0; i < nums.length; i++) {

//             int count = 0;

//             for(int j = 0; j < nums.length; j++) {

//                 if(nums[j] == nums[i]) {
//                     count++;
//                 }
//             }

//             if(count > majorityElements) {
//                 return nums[i];
//             }
//         }

//         return -1;
//     }

//     public static void main(String args[]) {

//         int nums[] = {2,2,1,1,1,2,2};

//         System.out.println(majorityElement(nums));

//     }
// }

// Quick Sort..

public static void QuickSort(int arr[] , int si , int ei) {
    if(si>=ei) {
        return;
    }
    // last element
    int pIdx = Partition(arr, si , ei);
    QuickSort(arr , si , pIdx-1); //left
    QuickSort(arr , pIdx+1 , ei); // right

    public static int Partition(int arr[] , int si , int ei) {
        int pivot = arr[ei];
        int i = si-1; // to make place for else smaller than pivot

        for(int j=0 ; j<ei ; j++) {
            if(arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        // swap
        int temp = arr[j];  // pivot = arr[i]
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }   

    public static void main(String args[]) {
        int arr[]  = {2,4,5,6,78,4,5,3};
        QuickSort(arr , 0 , arr.length-1); 
        PrintArr(arr);
    }
}