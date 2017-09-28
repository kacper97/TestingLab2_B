package cartesian;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PointTest {
		Point point1;
		Point point2;
		Point point3;
		Point point4;
		Point point5;

@Before
public void setUp() throws Exception {
	point1 = new Point(1,2);
	point2 = new Point(1,-2);
	point3 = new Point(-1,2);
	point4 = new Point(-1,-2);
	point5 = new Point(120,100);
	}

@Test

public void testXIsLessThan100(){
	assertEquals(100, point5.getX());
}

@Test
public void testYIsLessThan100(){
	assertEquals(100, point5.getY());
}

public void testXPosForX(){
	assertEquals(1, point1.getX());
}

@Test
public void testYPosForX(){
	assertEquals(2, point1.getY());
}

@Test
public void testXPosForNegY(){
	assertEquals(1, point2.getX());
}

@Test 
public void testYNegForPosX(){
	assertEquals(-2, point2.getY());
}

@Test
public void testXNegForPosX(){
	assertEquals(1, point3.getX());
}

@Test
public void testYPosForNegX(){
	assertEquals(2, point3.getY());
}

@Test
public void testXNegForNegY(){
	assertEquals(1, point4.getX());
}

@Test
public void testYNegForNegX(){
	assertEquals(-2, point4.getY());
}
}