package End2022.Paper1.Q1;

public class Main {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.enqueue("1001", 2.43f, "Badminton Racket", 15f);
        pq.enqueue("1020", 3.28f, "3D Five Glow Butterfly Pack", 8f);
        pq.enqueue("3105", 4.11f, "Smart Electric Blanket", 32f);
        pq.enqueue("6702", 4.39f, "Ten Scented Pillar Candles", 18f);
        pq.enqueue("1071", 4.39f, "Four Door Lock Knobs, Tool Kit Set", 42f);
        pq.enqueue("8125", 5.12f, "Five Hair bands, Two Hair Claws, A Scrunchy", 4f);
        pq.enqueue("2301", 6.27f, "Geyser, Water Purifier", 50f);
        pq.enqueue("4100", 6.44f, "Bluetooth Rechargeable Speaker", 7f);
        pq.enqueue("1008", 6.54f, "Two Game Gloves, Four Pieces Finger Gloves", 10f);
        pq.enqueue("7230", 7.36f, "Safety Swing", 12f);
        pq.display();
        System.out.println();
        pq.dequeue();
        pq.dequeue();
        pq.dequeue();
        pq.display();
        System.out.println();
        pq.enqueue("2390", 20.35f, "Double layer Storage Bag", 33f);
        pq.enqueue("3400", 21.10f, "Rotating Case Cover, Two Magnetic Case Covers", 20f);
        pq.display();
        System.out.println();
        pq.firstOrder();
    }
}
