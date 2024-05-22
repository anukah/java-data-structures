package End2021.Paper2.Q1;

public class Main {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        int[] numbers = {1245, 2345, 13324, 345, 3356, 2456, 6743, 56444, 66633, 234, 5467, 3445};
        for (int i = 0; i <numbers.length ; i++) {
            pq.insert(numbers[i]);
        }
        pq.display();
    }
}
