import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 */

/**
 * @author Andre Rodas y Diego Morales
 *
 */
public class VectorHeapTest {
	
	
	
	/**
	 * Test method for {@link VectorHeap#add(java.lang.Comparable)}.
	 */
	@Test
	public void testAdd() {
		VectorHeap<String> a = new VectorHeap<String>();
		a.add("e");
		String b = a.getFirst();
		b.equals("e");
	}

	/**
	 * Test method for {@link VectorHeap#remove()}.
	 */
	@Test
	public void testRemove() {
		VectorHeap<String> a = new VectorHeap<String>();
		a.add("e");
		String b = a.getFirst();
		b.equals("e");
	}

	/**
	 * Test method for {@link VectorHeap#getFirst()}.
	 */
	@Test
	public void testGetFirst() {
		VectorHeap<String> a = new VectorHeap<String>();
		a.add("e");
		String b = a.getFirst();
		b.equals("e");
	}

	/**
	 * Test method for {@link VectorHeap#isEmpty()}.
	 */
	@Test
	public void testIsEmpty() {
		VectorHeap<String> a = new VectorHeap<String>();
		a.isEmpty();
	}

	/**
	 * Test method for {@link VectorHeap#size()}.
	 */
	@Test
	public void testSize() {
		VectorHeap<String> a = new VectorHeap<String>();
		assertEquals(0,a.size() );  
	}

	/**
	 * Test method for {@link VectorHeap#clear()}.
	 */
	@Test
	public void testClear() {
		VectorHeap<String> a = new VectorHeap<String>();
		a.add("e");
		a.clear();
		assertEquals(0,a.size() );  
		
	}

}
