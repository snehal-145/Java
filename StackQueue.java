import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

public class StackQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Stack Implementation
        Stack<Integer> stack = new Stack<>();
        System.out.println("Enter 5 numbers to push onto the stack:");
        for (int i = 0; i < 5; i++) {
            stack.push(sc.nextInt());
        }

        System.out.println("\nStack elements (LIFO - Last In First Out): " + stack);
        System.out.println("Popped element from stack: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // Queue Implementation
        Queue<Integer> queue = new LinkedList<>();
        System.out.println("\nEnter 5 numbers to add to the queue:");
        for (int i = 0; i < 5; i++) {
            queue.add(sc.nextInt());
        }

        System.out.println("\nQueue elements (FIFO - First In First Out): " + queue);
        System.out.println("Dequeued element from queue: " + queue.poll());
        System.out.println("Queue after dequeue: " + queue);

        sc.close();
    }
}
