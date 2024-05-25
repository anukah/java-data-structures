package End2020.Paper1.Q2;

public class Driver {
    public static void main(String[] args) {
        String[] ipAddresses = {"212.134.12.1","168.234.32.15","12.64.10.25","35.28.147.36","218.104.70.24"};
        ClassArray classArray = new ClassArray();
        for (String ipAddress : ipAddresses) {
            classArray.sortToClass(ipAddress);
        }
        IPAddress ipAddress = new IPAddress();
    }
}
