package heap;

public class MyMinHeap
{
    private int[] Heap;
    private int size;
    private int maxsize;
 
    private static final int FRONT = 1;
 
    public MyMinHeap(int maxsize)
    {
        this.maxsize = maxsize;
        this.size = 0;
        Heap = new int[this.maxsize + 1];
        Heap[0] = Integer.MIN_VALUE;
    }
 
    private int parentPos(int pos)
    {
        return pos / 2;
    }
 
    private int leftChildPos(int pos)
    {
        return (2 * pos);
    }
 
    private int rightChildPos(int pos)
    {
        return (2 * pos) + 1;
    }
 
    private boolean isPosLeaf(int pos)
    {
        if (pos >=  (size / 2)  &&  pos <= size)
        { 
            return true;
        }
        return false;
    }
 
    private void swap(int fpos, int spos)
    {
        int tmp;
        tmp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = tmp;
    }
 
    private void minHeapify(int pos)
    {
        if (!isPosLeaf(pos))
        { 
            if ( Heap[pos] > Heap[leftChildPos(pos)]  || Heap[pos] > Heap[rightChildPos(pos)])
            {
                if (Heap[leftChildPos(pos)] < Heap[rightChildPos(pos)])
                {
                    swap(pos, leftChildPos(pos));
                    minHeapify(leftChildPos(pos));
                }else
                {
                    swap(pos, rightChildPos(pos));
                    minHeapify(rightChildPos(pos));
                }
            }
        }
    }
 
    public void insert(int element)
    {
        Heap[++size] = element;
        int current = size;
 
        while (Heap[current] < Heap[parentPos(current)])
        {
            swap(current,parentPos(current));
            current = parentPos(current);
        }	
    }
 
    public void print()
    {
        for (int i = 1; i <= size / 2; i++ )
        {
            System.out.print(" parent : " + Heap[i] + " left child : " + Heap[2*i] 
                + " right child :" + Heap[2 * i  + 1]);
            System.out.println();
        } 
    }
 
    public void minHeap()
    {
        for (int pos = (size / 2); pos >= 1 ; pos--)
        {
            minHeapify(pos);
        }
    }
 
    public int remove()
    {
        int popped = Heap[FRONT];
        Heap[FRONT] = Heap[size--]; 
        minHeapify(FRONT);
        return popped;
    }
 
    public static void main(String...arg)
    {
        System.out.println("Min Heap : ");
        MyMinHeap myMinHeap = new MyMinHeap(10);
        myMinHeap.insert(1);
        myMinHeap.insert(3);
        myMinHeap.insert(17);
        myMinHeap.insert(10);
        myMinHeap.insert(58);
        myMinHeap.insert(19);
        myMinHeap.insert(6);
        myMinHeap.insert(89);
        myMinHeap.minHeap();
 
        myMinHeap.print();
        System.out.println("The Min val is " + myMinHeap.remove());
    }
}
