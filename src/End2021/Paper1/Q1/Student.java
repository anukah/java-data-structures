package End2021.Paper1.Q1;

public class Student {
    private String regNo;
    private String name;
    private int age;
    private String gender;
    private String events;
    public Student(String regNo, String name, int age, String gender, String events) {
        this.regNo = regNo;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.events = events;
    }
    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEvents() {
        return events;
    }

    public void setEvents(String events) {
        this.events = events;
    }
}
