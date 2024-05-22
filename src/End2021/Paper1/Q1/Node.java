package End2021.Paper1.Q1;

public class Node {
    private Student student;
    protected Node next;
    public Node(String regNo, String name, int age, String gender, String events) {
        this.student = new Student(regNo, name, age, gender, events);
        this.next = null;
    }
    public Student getStudent() {
        return student;
    }
    public void setStudent(Student student) {
        this.student = student;
    }

}
