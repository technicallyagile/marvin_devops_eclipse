package marvin;

import marvin.Answers;

public class Marvin {
	/* Broken implementation
	public String talk(String statement) {
		return "";
	}
	*/
	
	/* Working implementation
	 */
	public String talk(String statement)
	{
		if(statement.startsWith("Hello")) {
			return "Whatever.";
		}
		
		// else
		return Answers.random_response();
	}
}
