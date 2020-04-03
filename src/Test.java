/**
 * @author Administrator
 */
public class Test {
    public static void main(String[] args) {
        Stack stack = new Stack(20);
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.printStack();
        System.out.println(stack.peek());
        stack.pop();
        stack.printStack();
    }
}
