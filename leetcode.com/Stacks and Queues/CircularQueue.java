package sq;

public class CircularQueue 
{
    private int[] data;
    private int head;
    private int tail;
    private int size;
    
	/** Constructor that sets the value of length of the queue. */
    public CircularQueue(int k) 
    {
        data = new int[k];
        head = -1;
        tail = -1;
        size = k;
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
    	 if (isFull() == true) {
             return false;
         }
         if (isEmpty() == true) {
             head = 0;
         }
         tail = (tail + 1) % size;
         data[tail] = value;
         return true;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
    	if (isEmpty() == true) {
            return false;
        }
        if (head == tail) {
            head = -1;
            tail = -1;
            return true;
        }
        head = (head + 1) % size;
        return true;
    }

    public int Front() {
    	if(isEmpty())
        {
        	return -1;
        }
        return data[head];
    }
    
    public int Rear() {
        if(isEmpty())
        {
        	return -1;
        }
        return data[tail];        
    }
    
    public boolean isEmpty() {
        return head==-1;
    }
    
    public boolean isFull() {
        return ((tail + 1) % size) == head;
    }

	public static void main(String args[])
	{
		 CircularQueue circularQueue = new CircularQueue(3);
		 circularQueue.enQueue(1);  
		 circularQueue.enQueue(2);  
		 circularQueue.enQueue(3);  
		 circularQueue.enQueue(4);  
		 //System.out.println(circularQueue.Rear());  // return 3
		 //System.out.println(circularQueue.isFull());  // return true
		 //System.out.println(circularQueue.deQueue());  // return true
		 circularQueue.deQueue();
		 circularQueue.enQueue(4);  // return true
		 circularQueue.isFull();
		 System.out.println(circularQueue.Rear());  // return 4
		 System.out.println(circularQueue.Front());  // return 2
	}
}
