package testJarConnection;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testsample {

	@Test
	public void test() {
		 TestConnection t1=new TestConnection();
		 int result= t1.add(10, 20);
		 assertEquals(30, result);
	}

}
