import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // 5.1 Приведите пример использования рекурсии.
        // 5.2 Реализуйте простой пример бесконечной рекурсии и обычной рекурсии с условием для выхода

        System.out.print("Пример обычноый <<правильной>> рекурсии: ");
        System.out.print(" [" + recursionCountdown(10) + "] ");

        // Пример бесконечной рекурсии закомментирован, чтобы не сбивать выполнение программы

//        endlessRecursionCountdown(10);

        // 5.3 Приведите пример изображающий стек вызова и стек вызова с рекурсией.

        System.out.println("\n Пример работы с обычным стеком вызова: " + genericStackDemo(1));

        System.out.print("\n Пример работы стека вывзова с рекурсией: ");
        recursiveStackDemo(5, 3);

        // 5.4 Реализуйте простой алгоритм использующий цикл и простой алгоритм использующий рекурсию.
        // + 5.5 Реализуйте алгоритм двоичного рекурсивного поиска

        int[] arrForSearch = {3, 7, 8, 6, 5, 20};
        int from = arrForSearch [0];
        int to = arrForSearch [arrForSearch.length - 1];

        simpleBinarySearch(arrForSearch, 7);

        // System.out.println("\n" + recursiveBinarySearch(arrForSearch, arrForSearch [0], arrForSearch [arrForSearch.length - 1], 2));


        // 5.6 реализуйте алгоритм сортировки слиянием

        mergeSort(arrForSearch, arrForSearch.length);

        System.out.println("\n Пример работы сортировки слоиянием: " + Arrays.toString(arrForSearch));
    }

    public static int recursionCountdown(int n) {
        while (!(n == 0)) {
            System.out.print(" [" + n + "] ");
            return recursionCountdown(n - 1);
        }
        return 0;
    }

    public static int endlessRecursionCountdown(int n) {
        System.out.println(n);
        return endlessRecursionCountdown(n - 1);
    }

    public static int genericStackDemo(int n) {
        return genericStackDemo2(n + 1);
    }

    public static int genericStackDemo2(int n) {
        return genericStackDemo3(n + 1);
    }

    public static int genericStackDemo3(int n) {
        return n + 1;
    }

    public static int recursiveStackDemo(int n, int counter) {
        if (!(counter == 0)) {
            System.out.print(" " + n + " ");
            return recursiveStackDemo(n + 1, counter - 1);
        } else return 0;
    }

    public static int simpleBinarySearch(int[] arrayForSort, int key) {

        int low = 0;

        int high = arrayForSort.length - 1;

        int index = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arrayForSort[mid] < key) {
                low = mid + 1;
            } else if (arrayForSort[mid] > key) {
                high = mid - 1;
            } else if (arrayForSort[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;

    }



    public static int recursiveBinarySearch(int arr[], int firstElement, int lastElement, int elementToSearch) {

        if (lastElement >= firstElement) {
            int mid = firstElement + (lastElement - firstElement) / 2;


            if (arr[mid] == elementToSearch)
                return mid;


            if (arr[mid] > elementToSearch)
                return recursiveBinarySearch(arr, firstElement, mid - 1, elementToSearch);


            return recursiveBinarySearch(arr, mid + 1, lastElement, elementToSearch);
        }

        return -1;
    }

    public static void mergeSort(int[]a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n/2;
        int[]l = new int[mid];
        int[]r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i]= a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid]= a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public static void merge(
            int[]a, int[]l, int[]r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i]<= r[j]) {
                a[k++]= l[i++];
            }
            else {
                a[k++]= r[j++];
            }
        }
        while (i < left) {
            a[k++]= l[i++];
        }
        while (j < right) {
            a[k++]= r[j++];
        }
    }

}
