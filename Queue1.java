package ListAssignment;
import java.util.LinkedList;
import java.util.Queue;
public class Queue1 {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(56);
        queue.add(30);
        queue.add(70);
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);

    }
}

