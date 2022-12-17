
import java.util.*;

class Number_of_Elements {
    public static int partition(int arr[], int start, int end) {
        int pivot = arr[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[end] = temp;

        return i;
    }

    public static void quickSort(int arr[], int start, int end) {
        if (start < end) {
            int pindex = partition(arr, start, end);
            quickSort(arr, start, pindex - 1);
            quickSort(arr, pindex + 1, end);
        }
    }

    public static void main(String[] args) {
        // Your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int k = in.nextInt();
        quickSort(arr, 0, n - 1);

        while (k-- > 0) {
            int h = in.nextInt();
            int index = -1;
            int left = 0;
            int right = n - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (arr[mid] == h) {
                    index = mid;
                    break;
                }
                if (arr[mid] > h) {
                    right = mid - 1;
                    // left = mid + 1;
                } else {
                    left = mid + 1;
                    index = mid;
                }
            }
            if (index == -1) {
                System.out.println(n);
            } else {
                while ((index < n - 1) && (arr[index] == arr[index + 1])) {
                    index++;
                }

                System.out.println(n - (index + 1));
            }
        }
    }
}