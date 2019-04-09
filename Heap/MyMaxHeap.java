package heap;

public class MyMaxHeap 
{

    private int[] Heap;
    private int size;
    private int maxsize;
 
    private static final int FRONT = 1;
 
    public MyMaxHeap(int maxsize)
    {
        this.maxsize = maxsize;
        this.size = 0;
        Heap = new int[this.maxsize + 1];
        Heap[0] = Integer.MAX_VALUE;
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
 
    private boolean isLeaf(int pos)
    {
        if (pos >=  (size / 2)  &&  pos <= size)
        {
            return true;
        }
        return false;
    }
 
    private void swap(int fpos,int spos)
    {
        int tmp;
        tmp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = tmp;
    }
 
    private void maxHeapify(int pos)
    {
        if (!isLeaf(pos))
        { 
            if ( Heap[pos] < Heap[leftChildPos(pos)]  || Heap[pos] < Heap[rightChildPos(pos)])
            {
                if (Heap[leftChildPos(pos)] > Heap[rightChildPos(pos)])
                {
                    swap(pos, leftChildPos(pos));
                    maxHeapify(leftChildPos(pos));
                }else
                {
                    swap(pos, rightChildPos(pos));
                    maxHeapify(rightChildPos(pos));
                }
            }
        }
    }
 
    public void insert(int element)
    {
        Heap[++size] = element;
        int current = size;
 
        while(Heap[current] > Heap[parentPos(current)])
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
 
    public void maxHeap()
    {
        for (int pos = (size / 2); pos >= 1; pos--)
        {
            maxHeapify(pos);
        }
    }
 
    public int remove()
    {
        int popped = Heap[FRONT];
        Heap[FRONT] = Heap[size--]; 
        maxHeapify(FRONT);
        return popped;
    }
 
    public static void main(String...arg)
    {
        System.out.println("Max Heap : ");
        MyMaxHeap myMaxHeap = new MyMaxHeap(10);
        myMaxHeap.insert(15);
        myMaxHeap.insert(34);
        myMaxHeap.insert(100);
        myMaxHeap.insert(44);
        myMaxHeap.insert(9);
        myMaxHeap.insert(126);
        myMaxHeap.insert(8);
        myMaxHeap.insert(19);
        myMaxHeap.maxHeap();
 
        myMaxHeap.print();
        System.out.println("Max val : " + myMaxHeap.remove());
    }
}
