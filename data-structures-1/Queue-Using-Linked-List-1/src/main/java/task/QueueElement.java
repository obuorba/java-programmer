package task;

public class QueueElement {

    private Person value;
    private QueueElement next;

    public QueueElement(Person person, QueueElement next) {
        this.value = person;
        this.next = next;
    }

    public Person getValue() {
        return value;
    }

    public void setValue(Person value) {
        this.value = value;
    }

    public QueueElement getNext() {
        return next;
    }

    public void setNext(QueueElement next) {
        this.next = next;
    }
}
