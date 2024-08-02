package Stack_Array;

public class Stack{
    int[] stack ;
    int top = 0;

    public Stack() {
        this.stack = new int[1];
    }

    public void push(int data){
        if(top>=stack.length){
            int[] newStack = new int[stack.length*2];
            for(int i=0;i<stack.length;i++){
                newStack[i] = stack[i];
            }
            stack = newStack;
        }
        stack[top] = data;
        top++;
    }

    public int pop(){
        if(top==0){
            System.out.println("Underflow");
            return Integer.MIN_VALUE;
        }
        top--;
        return stack[top];
    }

    public void display(){
        for(int i=0;i<top;i++){
            System.out.print(stack[i]+",");
        }
        System.out.println();
    }
}