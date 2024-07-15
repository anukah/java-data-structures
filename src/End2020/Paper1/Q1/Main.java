package End2020.Paper1.Q1;

public class Main {
    public static void main(String[] args) {
        decimalToBinary(124);
    }
    public static void decimalToBinary(int decimal){
        Stack stack = new Stack();
        while (decimal!=1 && decimal!=0){
            stack.push(decimal%2);
            decimal = decimal/2;
        }
        if (decimal == 1) stack.push(1);
        stack.display();
    }
}
