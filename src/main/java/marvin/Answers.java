package marvin;

import java.util.List;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Answers {
	private static List<String> list = Arrays.asList(
			"Freeze? I'm a robot. I'm not a refrigerator.",
		    "I think you ought to know I'm feeling very depressed.",
		    "Life? Don't talk to me about life!",
		    "I'm a personality prototype. You can tell, can't you...?",
		    "Incredible...  it's even worse than I thought it would be.",
		    "I'd make a suggestion, but you wouldn't listen.  No one ever does.",
		    "I've been talking to the main computer.  It hates me.",
		    "I've calculated your chance of survival, but I don't think you'll like it.",
		    "This will all end in tears.",
		    "Here I am, brain the size of a planet, and they ask me to take you to the bridge. Call that job satisfaction, 'cause I don't.",
		    "I have a million ideas, but, they all point to certain death.",
		    "The first ten million years were the worst. And the second ten million: they were the worst, too. The third ten million I didn't enjoy at all. After that, I went into a bit of a decline.",
		    "It gives me a headache just trying to think down to your level.",
		    "Life. Loathe it or ignore it. You can't like it.",
		    "You think you've got problems. What are you supposed to do if you are a manically depressed robot? No, don't even bother answering. I'm 50,000 times more intelligent than you and even I don't know the answer."
		);
			
	public static String random_response() {
		return Answers.list.get(ThreadLocalRandom.current().nextInt(Answers.list.size()));
	}
}