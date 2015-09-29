import static org.junit.Assert.*;

import org.junit.Test;

public class CritterMovementTest{

	//assert equals
	
	@Test
	public void testAnt() {
		Ant a = new Ant(true);
		assertEquals("ant first move", Direction.NORTH, a.getMove());
	}

	@Test
	public void testBird() {
		Bird b = new Bird();
		assertEquals("bird symbol on creation", "<", b.toString());
	}

	@Test
	public void testCat() {
		Cat c = new Cat();
		assertEquals("umm...?", 5, 5);
	}

	@Test
	public void testLion() {
		Lion l = new Lion();
		assertEquals("lion symbol on creation", "L", l.toString());
	}

	@Test
	public void testHuman() {
		Human h = new Human();
		assertEquals("human first move", , h.getMove());
	}

	
}
