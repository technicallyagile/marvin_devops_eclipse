package marvin;

import static org.junit.Assert.*;

import org.junit.Test;

public class MarvinTest {

	@Test
	public void basicStatementTest() {
		Marvin marvin = new Marvin();						// Arrange
		String response = marvin.talk("Hello Marvin.");		// Act
		assertEquals("Whatever.", response);        		// Assert
	}

}
