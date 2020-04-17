package eg.edu.alexu.csd.datastructure.queue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QueueArrayBasedTest {

	@Test
	void testNumber1() {

		QueueArrayBased r = new QueueArrayBased(8);
		
		assertTrue(r.isEmpty());
		assertThrows(RuntimeException.class,()-> r.dequeue());
		r.enqueue(1);
		r.enqueue(43);
		r.enqueue(3);
		assertEquals(r.size(),3);
		r.enqueue(70);
		assertFalse(r.isEmpty());
		r.enqueue(0);
		r.enqueue("j");
		r.enqueue(-19);
		r.enqueue("orange");
		assertEquals(r.size(),8);
		r.dequeue();
		r.dequeue();
		assertEquals(r.size(),6);
		r.dequeue();
		r.dequeue();
		r.dequeue();
		assertFalse(r.isEmpty());
		r.dequeue();
		r.dequeue();
		assertEquals(r.size(),1);
		assertFalse(r.isEmpty());
		r.dequeue();
		assertTrue(r.isEmpty());
		assertThrows(RuntimeException.class,()-> r.dequeue());	
		
	 
    }

	
	@Test
	void testNumber2() {
		
		QueueArrayBased d = new QueueArrayBased(9);
		
		assertTrue(d.isEmpty());
		assertThrows(RuntimeException.class,()-> d.dequeue());
		d.enqueue(53);
		assertEquals(d.size(),1);
		d.dequeue();
		assertEquals(d.size(),0);
		d.enqueue("cat");
		d.enqueue("land");
		d.enqueue("apple");
		d.enqueue("k");
		assertEquals(d.size(),4);
		d.dequeue();
		assertEquals(d.size(),3);
		d.enqueue(3.93);
		assertFalse(d.isEmpty());
		d.enqueue(11);
		d.enqueue(0);
		d.dequeue();
		assertFalse(d.isEmpty());
		d.enqueue(-73);
		d.dequeue();
		assertEquals(d.size(),5);
		d.dequeue();
		d.dequeue();
		d.dequeue();
		d.dequeue();
		d.dequeue();
		assertThrows(RuntimeException.class,()-> d.dequeue());
		
	}
}
