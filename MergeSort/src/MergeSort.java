public class MergeSort {
    public static void mergeSort(int[] arr) {
        if (arr.length > 1) {
            int mid = arr.length / 2;

            int[] left = new int[mid];
            int[] right = new int[arr.length - mid];

            System.arraycopy(arr, 0, left, 0, mid);
            System.arraycopy(arr, mid, right, 0, arr.length - mid);


            mergeSort(left);
            mergeSort(right);



            merge(arr, left, right);
        }
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }

        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        // Replace this array with your own data
        int[] myArray = {64, 34, 25, 12, 22, 11, 90};

        System.out.print("Original Array: ");
        for (int num : myArray) {
            System.out.print(num + " ");
        }

        // Apply Merge Sort
        mergeSort(myArray);

        System.out.print("\nSorted Array: ");
        for (int num : myArray) {
            System.out.print(num + " ");
        }
    }
}
