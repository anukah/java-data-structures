package End2020.Paper2.Q1;

public class Driver {
    public static void main(String[] args) {
        int Beds_required = 0;
        int[] admission = {100, 140, 150, 200, 215, 400};
        int[] discharge = {110, 300, 220, 230, 315, 600};
        sort(admission);
        for (int i: sort(admission)) {
            System.out.println(i);
        }
        sort(discharge);
        System.out.println(selectMin(sort(admission),sort(discharge)));

    }
    public static int[] sort(int[] arr) {
        //bubbleSort
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return arr;
    }

    public static int selectMin(int[] arr1, int[] arr2){
        Queue queue = new Queue();
        for (int i : arr1){
            queue.enqueue(i);
            queue.enqueue(i);
        }
        return queue.front.data;
    }

    public static void counter(int[] arr1, int[] arr2){

    }
}
