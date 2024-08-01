package End2022.Paper1.Q1;

public class Order {
    private String regNo;
    private float time;
    private String items;
    private float total;

    public Order(String regNo, float time, String items, float total) {
        this.regNo = regNo;
        this.time = time;
        this.items = items;
        this.total = total;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
}
