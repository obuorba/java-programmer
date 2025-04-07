package task;
import java.util.NoSuchElementException;


public interface PersonQueue {

    /**
     * Add a person to the back of the queue.
     * @param person The element of type {@code Person} to add.
     */
    void enqueue(Person person);

    /**
     * Remove a person from the front of the queue.
     * @return The element of type {@code Person} at the front of the queue.
     */
    Person dequeue();

    /**
     * Return the element at the front of the queue without removing it.
     * @return The person of type {@code Person} at the front of the queue.
     */
    Person peek() throws NoSuchElementException;

    /**
     * Return the number of elements in the queue.
     * @return The number of elements as {@code int}.
     */
    int size();
}
