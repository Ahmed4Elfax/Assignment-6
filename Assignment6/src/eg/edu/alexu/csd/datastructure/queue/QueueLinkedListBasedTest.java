package eg.edu.alexu.csd.datastructure.queue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QueueLinkedListBasedTest {

	@Test
	void test1() {
		QueueLinkedListBased w = new QueueLinkedListBased();
		
		assertTrue(w.isEmpty());
		assertThrows(RuntimeException.class,()-> w.dequeue());
		w.enqueue(1);
		w.enqueue(2);
		w.enqueue(3);
		assertEquals(w.size(),3);
		w.enqueue(4);
		assertFalse(w.isEmpty());
		w.enqueue(5);
		w.enqueue("c");
		w.enqueue(7);
		w.enqueue("tiger");
		assertEquals(w.size(),8);
		w.dequeue();
		w.dequeue();
		assertEquals(w.size(),6);
		w.dequeue();
		w.dequeue();
		w.dequeue();
		assertFalse(w.isEmpty());
		w.dequeue();
		w.dequeue();
		assertEquals(w.size(),1);
		assertFalse(w.isEmpty());
		w.dequeue();
		assertTrue(w.isEmpty());
		assertThrows(RuntimeException.class,()-> w.dequeue());
	}
	
	
	@Test
	void test2() {
		QueueLinkedListBased m = new QueueLinkedListBased();
		
		assertTrue(m.isEmpty());
		assertThrows(RuntimeException.class,()-> m.dequeue());
		m.enqueue("frog");
		assertEquals(m.size(),1);
		m.dequeue();
		assertEquals(m.size(),0);
		m.enqueue("lion");
		m.enqueue("sky");
		m.enqueue(85);
		m.enqueue("k");
		assertEquals(m.size(),4);
		m.dequeue();
		assertEquals(m.size(),3);
		m.enqueue(3.86);
		assertFalse(m.isEmpty());
		m.enqueue(8);
		m.enqueue(0);
		m.dequeue();
		assertFalse(m.isEmpty());
		m.enqueue(-29);
		m.dequeue();
		assertEquals(m.size(),5);
		m.dequeue();
		m.dequeue();
		m.dequeue();
		m.dequeue();
		m.dequeue();
		assertThrows(RuntimeException.class,()-> m.dequeue());
		
	}
}
