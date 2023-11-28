import java.util.Arrays;
import java.util.LinkedList;

public class CISQueue {

    // Array property.
    public LinkedList<Integer> linkedList;

    // Size property.
    private int size;


    // Constructor.
    public CISQueue()
    {
        linkedList = new LinkedList<>();;
        size = 0;
    }

    // Push. This method pushes a value onto the top of the stack.
    public void enqueue (int element)
    {
        linkedList.add(element);
        size++;
    }

    // Pop. This method pops a value from the top of the stack.
    public Object dequeue()
    {
        int temp = 0;
        if (size == 0)
        {
            return null;
        }
        size--;
        temp = linkedList.getFirst();
        linkedList.removeFirst();
        return temp;
    }

    // isEmpty. Returns a boolean indicating whether the linked list is empty.
    public boolean isEmpty()
    {
        if (size == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // size. Returns the size of the queue.
    public int size()
    {
        return size;
    }

    // toString. Returns a description of the queue in, for example, the following format:
    // CISStack{stack=[7, 11], size=2, pointer=1}


    @Override
    public String toString() {
        return "CISQueue{" +
                "queue=" + linkedList +
                ", size=" + size +
                '}';
    }
}
