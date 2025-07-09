package Queue;

public class Main {

    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();
        queue.add(5);
        queue.add(1);
        queue.add(3);
        queue.add(2);
        queue.add(4);

        System.out.println(queue);

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }

    }
}

// public class Main {
// public static void main(String[] args) {
// Queue<Integer> queue = new ArrayDeque<>();
// queue.add(10);
// queue.add(20);
// queue.add(30);
// reverse(queue);
// System.out.println(queue);
// }

// public static void reverse(Queue<Integer> queue) {
// Stack<Integer> stack = new Stack<>();
// while (!queue.isEmpty()) {
// stack.push(queue.remove());
// }

// while (!stack.isEmpty()) {
// queue.add(stack.pop());
// }
// }
// }
