import java.util.LinkedList;
import java.util.Queue;

public class GenericQueue<T> {
    Queue<T> myList;

    public GenericQueue() {
        this.myList = new LinkedList<>();
    }

    // add method
    public void enQueue(T t) {
        myList.add(t);
    }

    public void dequeue() {
        System.out.println("Birinci element " + "'" + myList.peek() + "'");
    }

    public void isEmpty() {
        if (myList.isEmpty()) {
            System.out.println("list bosdur");
        } else {
            System.out.println("list doludur");
        }
    }

    @Override
    public String toString() {
        return "GenericQueue{" +
                "myList=" + myList +
                '}';
    }
}
