package queue;

import java.util.LinkedList;

public class Queue<E> {
	
	private LinkedList<E> list = new LinkedList<E>();
	
	//enqueue - function adds an element to the queue
	public void enqueue(E element) {
		list.add(element);
	}
	
	//dequeue - function returns the first element in the queue
	public E dequeue() {
		 return list.poll();
	}
	
	//hasItem function return false if the queue is empty
	public boolean hasItem() {
		return !list.isEmpty(); 
	}
	
	//size function returns the number of elements in the queue
	public int size() {
		return list.size(); 
	}
	
	//addItems function
	public void addElements(Queue <? extends E> q) {
		while(q.hasItem()) list.addLast(q.dequeue());
	}

}
