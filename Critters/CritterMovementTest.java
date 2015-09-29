import static org.junit.Assert.*;

import org.junit.Test;

import Critter.Direction;
//import Critter cannot be resolved

public class CritterMovementTest{

	//assert equals
	
	@Test
	public void testAnt() {
		Ant a = new Ant(true);
		assertEquals("ant first move", Direction.NORTH, a.getMove());
		//getting error when calling Direction
		//recommends to import Critter.Direction, but then error is still not resolved
	}

	@Test
	public void testBird() {
		Bird b = new Bird();
		assertEquals("bird symbol on creation", "<", b.toString());
	}

	@Test
	public void testCat() {
		Cat c = new Cat();
		//getMove() selects a random direction... unpredictable 
		assertEquals("cat symbol", "c", c.toString());
	}

	@Test
	public void testLion() {
		Lion l = new Lion();
		assertEquals("lion symbol on creation", "L", l.toString());
	}

	@Test
	public void testHuman() {
		Human h = new Human(true);
		assertEquals("human first move", Direction.NORTH, h.getMove());
		//similar error to above
	}

	
}
