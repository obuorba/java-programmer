package task;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class PersonQueueTest {

    ArrayList<Person> getDummyPersons(int N) {
        ArrayList<Person> persons = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            persons.add(new Person(i, "a"+i, "b"+i));
        }
        return persons;
    }

    @Test
    void enqueueOnEmptyQueueYieldsQueueSizeOne() {
        PersonQueue queue = new PersonQueueImpl();

        queue.enqueue(new Person(4));

        assertEquals(1, queue.size());
    }

    @Test
    void dequeueOnNonEmptyQueueDecreasesQueueSizeByOne() {
        PersonQueue queue = new PersonQueueImpl();
        Person testPerson = new Person(5, "test", "name");

        queue.enqueue(testPerson);
        queue.enqueue(new Person(3));
        queue.enqueue(new Person(4));

        assertEquals(3, queue.size());
        assertEquals(queue.dequeue(), testPerson);
        assertEquals(2, queue.size());
    }

    @Test
    void dequeueRetrievesElementsInOriginalOrder() {
        PersonQueue queue = new PersonQueueImpl();
        int N = 100;
        ArrayList<Person> persons = getDummyPersons(N);

        for (Person p : persons)
            queue.enqueue(p);

        ArrayList<Person> dequeuedPersons = new ArrayList<>(N);
        while(queue.size() > 0) {
            dequeuedPersons.add(queue.dequeue());
        }
        assertIterableEquals(persons, dequeuedPersons);
    }

    @Test
    void dequeOnEmptyQueueThrowsNoSuchElementException() {
        PersonQueue queue = new PersonQueueImpl();
        assertThrows(NoSuchElementException.class, queue::dequeue);
    }

    @Test
    void peekOnEmptyQueueThrowsNoSuchElementException() {
        PersonQueue queue = new PersonQueueImpl();
        assertThrows(NoSuchElementException.class, queue::peek);
    }

    @Test
    void repeatedEnqueueDequeuePeekYieldsCorrectFinalQueue() {
        PersonQueue queue = new PersonQueueImpl();

        Person p1 = new Person(1);
        Person p2 = new Person(2);

        queue.enqueue(p1);
        queue.enqueue(p1);

        assertEquals(p1, queue.dequeue());
        assertEquals(1, queue.size());

        queue.enqueue(p2);

        assertEquals(p1, queue.peek());
        assertEquals(2, queue.size());
        assertEquals(p1, queue.dequeue());
        assertEquals(p2, queue.dequeue());
        assertEquals(0, queue.size());
    }
}
