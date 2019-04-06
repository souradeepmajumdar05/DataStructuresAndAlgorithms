package MyDataStructuresImplemenation;

import java.util.Arrays;

public class MyArrayList 
{
	public static void main(String args[])
	{
		MyArrayListUtility<Integer> list = new MyArrayListUtility<Integer>();
        list.add(1);
        list.add(17);
        list.add(13);
        list.add(41);
        list.add(11);

        list.display();
        System.out.println("\nvalue at position in custom ArrayList > " + 1 + " = " + list.get(1));

        //Remove element from custom ArrayList
        System.out.println("value removed from position " + 1 + " = " + list.remove(1));

        list.display();
	}
}
class MyArrayListUtility<E> 
{
    private static final int INITIAL_CAPACITY = 10;
    private int size = 0;
    private Object elementData[] = {};

    public MyArrayListUtility() 
    {
           elementData = new Object[INITIAL_CAPACITY];
    }

    public void add(E e) 
    {
    	if (size == elementData.length) 
    	{
    		ensureCapacity();
        }
        elementData[size++] = e;
    }
 
    @SuppressWarnings("unchecked")
	public E get(int index) 
    {
		if (index < 0 || index >= size) 
		{
			throw new IndexOutOfBoundsException("Index: " + index + ", Size " + size);
		}
		return (E) elementData[index];
	}
 
	public Object remove(int index) 
	{
		if (index < 0 || index >= size) 
		{
			throw new IndexOutOfBoundsException("Index: " + index + ", Size " + size);
		}

		Object removedElement = elementData[index];
		for (int i = index; i < size - 1; i++) {
			elementData[i] = elementData[i + 1];
		}
		size--; // reduce size of ArrayListCustom after removal of element.

		return removedElement;
	}

    private void ensureCapacity() 
    {
    	int newIncreasedCapacity = elementData.length * 2;
        elementData = Arrays.copyOf(elementData, newIncreasedCapacity);
    }

	public void display() 
	{
		System.out.print("Displaying list : ");
		for (int i = 0; i < size; i++) 
		{
			System.out.print(elementData[i] + " ");
		}
	}
}
