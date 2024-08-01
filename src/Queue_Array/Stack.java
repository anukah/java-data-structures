package Queue_Array;
public class Stack {
    int[] stack;
    int index = 0;
    public Stack(int length) {
        this.stack = new int[length];
    }

    public void push(int data){
        if (index<=stack.length-1){
            stack[index] = data;
            index++;
        } else
            System.out.println("Overflow");
    }

    public int pop(){
        int ret = 0;
        if (index <= 0){
            System.out.println("Underflow");
        } else if (index<=stack.length){
            ret = stack[index-1];
            int[] retStack = new int[stack.length-1];
            for (int i = 0; i < retStack.length; i++) {
                retStack[i] = stack[i];
            }
            stack = retStack;
            index--;
        }
        return ret;
    }

    public void display(){
        for (int j : stack) {
            System.out.print(j + ", ");
        }
    }

}
