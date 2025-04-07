package task;

import java.util.NoSuchElementException;

public class PersonQueueImpl implements PersonQueue {

    private QueueElement front;
    private QueueElement back;
    private int count;


    @Override
    public void enqueue(Person person) {
        //first person in the queue
        QueueElement it = new QueueElement(person,null);
        if (front==null){
            front = it;
            back = it;
            count++;
        }
        else if (front!=null){//more than one person in queue
            back.setNext(it);
            back = it;
            count++;
        }

    }
    @Override
    public Person dequeue() throws NoSuchElementException {
        if (size()==0){
            throw new NoSuchElementException();
        }
        else if (size()==1){
            QueueElement temp = front;
            front = null;
            back = null;
            count--;
            return temp.getValue();
        }
        else{
            QueueElement temp = front;
            front = front.getNext();
            count--;
            return temp.getValue();
        }
    }

    @Override
    public Person peek() throws NoSuchElementException {
        if (size()==0)
            throw new NoSuchElementException();
        else
                return front.getValue();
    }

    @Override
    public int size() {
        int count1=0;
        if (front==null){
            return 0;
        }
        else {
            QueueElement it = front;
            count1 ++;
            while (it.getNext()!=null){
                it = it.getNext();
                count1 ++;
            }
        }
        return count1;
    }


    @Override
    public String toString(){
        String string = "";
        if (front!=null){
            QueueElement it = front;
            string += it.getValue().getAge() + " ";
            while (it.getNext()!=null){
                it = it.getNext();
                string += it.getValue().getAge() + " ";
            }
        }
        return string;
    }
}
