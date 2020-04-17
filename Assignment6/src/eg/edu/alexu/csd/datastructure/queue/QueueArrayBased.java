package eg.edu.alexu.csd.datastructure.queue;

public class QueueArrayBased implements IQueue,IArrayBased{
    Object queue[];
    int size;
    int front;
    int rear;
    /*
     * make a constructor
     */
    public QueueArrayBased(final int N) {
		queue=new Object[N];
		size=0;
		front=0;
		rear=0;
	}
	@Override
	public void enqueue(Object item) {
		if(size==queue.length) {
			throw new RuntimeException("Full Queue !!");
		}
		queue[rear]=item;
		rear=(rear+1)%queue.length;
		size++;
	}

	@Override
	public Object dequeue() {
		if(size==0) {
			throw new RuntimeException("Empty Queue !!");
		}
		Object item = queue[front];
		queue[front]=null;
		front=(front+1)%queue.length;
		size--;
		return item;
	}

	@Override
	public boolean isEmpty() {
		return (size==0);
	}

	@Override
	public int size() {
		return size;
	}

}
