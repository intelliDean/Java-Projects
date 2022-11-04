package chapter10.StackOfInteger;

public class StackDriver {
    public static void main(String[] args) {
        StackClass stack = new StackClass();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
