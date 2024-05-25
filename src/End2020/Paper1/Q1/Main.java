package End2020.Paper1.Q1;

public class Main {
    public static void toBinary(int data){
        Stack stack = new Stack();
        if (data == 0) {
            System.out.print(0);
            return;
        }
        else if (data == 1) {
            System.out.print(1);
            return;
        } else {
            while (data > 0) {
                stack.push(data % 2);
                data = data / 2;
            }
        }
        stack.display();
        System.out.println();
    }


    public static void main(String[] args) {
        toBinary(126);
    }
}
