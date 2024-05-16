package Arrays;

public class Array {

    public static int search(int[] array, int value){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
        }
    public static int[] addValue(int[] array1, int newValue) {
        int[] returnArray = new int[array1.length+1];
        for (int i = 0; i < array1.length; i++) {
            returnArray[i] = array1[i];
        }
        returnArray[array1.length] = newValue;
        return returnArray;
    }

    public static int[] deleteValue(int[] array1, int value) {
        int[] returnArray = new int[array1.length-1];
        int j = 0;
        for (int i = 0; i < array1.length; i++) {
            if(array1[i]==value){
                continue;
            } else {
                returnArray[j] = array1[i];
                j++;
            }
        }return returnArray;
    }
    public static int[] reverseArray(int[] array){
        int[] returnArray = new int[array.length];
        for(int i = 0; i<array.length; i++){
            returnArray[array.length-1-i] = array[i];
        }
        return returnArray;
    }

    public static void display(int[] array){
        for (int item : array){
            System.out.print(item + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array1 = {10, 20, 30, 40, 60};

        //Add a value to array
        System.out.print("After value added : ");
        display(addValue(array1, 50));

        //Remove a value from array
        System.out.print("After value deleted : ");
        display(deleteValue(array1, 30));

        //Reversed array
        System.out.print("Reversed array : ");
        display(reverseArray(array1));
        System.out.println(search(array1, 20));
    }

}
