package End2020.Paper2.Q1;

public class Driver {
    public static void main(String[] args) {
        int Beds_required = 0;
        int[] admission = {100, 140, 150, 200, 215, 400};
        int[] discharge = {110, 300, 220, 230, 315, 600};

        sort(admission);
        sort(discharge);

        System.out.println("Sorted admission times: ");
        display(admission);
        System.out.println("Sorted discharge times: ");
        display(discharge);

        int maxBedsRequired = selectMin(admission, discharge);
        System.out.println("Maximum beds required: " + maxBedsRequired);
    }

    public static void sort(int[] arr) {
        // Bubble sort
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
    }

    public static int selectMin(int[] admission, int[] discharge) {
        int Beds_required = 0;
        int maxBedsRequired = 0;
        int i = 0, j = 0;

        while (i < admission.length && j < discharge.length) {
            if (admission[i] < discharge[j]) {
                Beds_required++;
                i++;
            } else {
                Beds_required--;
                j++;
            }
            if (Beds_required > maxBedsRequired) {
                maxBedsRequired = Beds_required;
            }
        }

        return maxBedsRequired;
    }

    public static void display(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }
}
