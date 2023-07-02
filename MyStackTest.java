package ListAssignment;
import java.util.Stack;
public class MyStackTest{
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(56);
        stack.push(30);
        stack.push(56);
        System.out.println(stack);
        stack.pop();
        System.out.println("top element "+stack.peek());
        stack.pop();
        System.out.println("top element "+stack.peek());
        stack.pop();
        System.out.println(stack);
    }

}
