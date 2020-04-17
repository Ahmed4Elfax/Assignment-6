package eg.edu.alexu.csd.datastructure.queue;

public class QueueLinkedListBased implements IQueue,ILinkedBased {
    
    LinkedList linkedlist = new LinkedList();
	
	public void enqueue(Object item) {
	     linkedlist.add(item);
	}

	public Object dequeue() {
		Object temp = linkedlist.get(0);
		linkedlist.remove(0);
        return temp;
	}

	public boolean isEmpty() {
          return linkedlist.isEmpty();
	}

	public int size() {
		return linkedlist.size(); 
	}
	
}
