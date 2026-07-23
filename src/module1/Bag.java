package module1;

import java.util.ArrayList;
import java.util.Objects;
/**
 * A generic Bag (multiset) implementation that allows duplicate elements.
 * Internally uses an ArrayList to store items.
 *
 * @param <T> the type of elements stored in the bag
 */
public class Bag<T>{
	
	private final ArrayList<T> items;

	public Bag() {
		this.items = new ArrayList<>();
	}
	
	// Returns string representation of bag contents
	@Override
	public String toString() {
		return items.toString();
	}
	
	// Method adds an item of type T to the bag
	public void add(T item) {
		items.add(item);
	}
	
	// Method removes one occurrence of the item from the bag, if it exists
	public void remove(T item) {
		items.remove(item);
	}
	
	// Method returns true if the item exists in the bag; otherwise, returns false.   
	public boolean contains(T item) {
		return items.contains(item);
	}
	
	/* Method returns the number of occurrences of the specified item in the bag. 
	 * If the item does not exist, it returns 0.
	 */
	public int count(T item) {
		int frequency = 0;
		for (T element : items) {
			if (Objects.equals(element, item)) {
				frequency++;
			}
		}
		return frequency;
	}



}
