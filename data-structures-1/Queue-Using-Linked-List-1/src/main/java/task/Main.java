package task;

public class Main {
    public static void main(String[] args) {
        PersonQueueImpl queue = new PersonQueueImpl();
        // Space for trial and error

        queue.enqueue(new Person(2));
        queue.enqueue(new Person(3));
        queue.enqueue(new Person(4));
        queue.enqueue(new Person(5));
        queue.enqueue(new Person(6));

        System.out.println(queue.toString());

        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.toString());


        System.out.println(queue.peek().getAge());

        System.out.println(queue.size());



    }
}