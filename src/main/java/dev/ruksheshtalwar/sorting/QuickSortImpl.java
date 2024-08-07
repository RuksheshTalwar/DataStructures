package main.java.dev.ruksheshtalwar.sorting;

public class QuickSortImpl {
    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};
        System.out.println("Before Quick Sort");
        printArray(arr);
        quickSort(arr, 0, arr.length - 1);
        System.out.println("\nAfter Quick Sort in ascending order");
        printArray(arr);
    }

        public static void quickSort(int[] array, int low, int high) {
            if (low < high) {
                int partitionIndex = partition(array, low, high);
                quickSort(array, low, partitionIndex - 1);
                quickSort(array, partitionIndex + 1, high);
            }
        }

        private static int partition(int[] array, int low, int high) {
            int pivot = array[low];
            int i = low;
            int j = high;
            while (i < j) {
                while (array[i] <= pivot && i <= high - 1) {
                    i++;
                }
                while (array[j] > pivot && j >= low + 1) {
                    j--;
                }
                if (i < j) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            int temp = array[low];
            array[low] = array[j];
            array[j] = temp;
            return j;
        }

        private static void printArray(int[] numbers) {
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
