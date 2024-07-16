package End2020.Paper2.Q1;

public class Driver {
    public static void main(String[] args) {
        int[] admission = {100,140,150,200,215,400};
        int[] discharge = {110,300,220,230,315,600};
        PriorityQueue sortedAdmission = new PriorityQueue();
        PriorityQueue sortedDischarge = new PriorityQueue();
        for (int k : admission) {
            sortedAdmission.enqueue(k);
        }
        for (int j : discharge) {
            sortedDischarge.enqueue(j);
        }
        calculateBedsRequired(sortedAdmission,sortedDischarge);

    }

    public static void calculateBedsRequired(PriorityQueue admissions, PriorityQueue discharge) {
        int beds_Required = 0;
        int maxBedsRequired = 0;
        Node tempA = admissions.front;
        Node tempD = discharge.front;

        while (tempA != null && tempD != null) {
            if (tempA.getData() <= tempD.getData()) {
                beds_Required++;
                tempA = tempA.next;
            } else {
                beds_Required--;
                tempD = tempD.next;
            }
            if (beds_Required > maxBedsRequired) {
                maxBedsRequired = beds_Required;
            }
        }

        System.out.println("Max beds required = " + maxBedsRequired);
    }
}
