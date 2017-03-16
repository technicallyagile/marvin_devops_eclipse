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
	
	@Test
	public void basicQuestionTest() {
		Marvin marvin = new Marvin();						// Arrange
		String response = marvin.talk("How are you?");		// Act
		assertEquals("I don't care.", response);       		// Assert
	}

}
