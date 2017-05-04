package marvin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import marvin.Marvin;

public class TalkToMarvin {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("What do you want to say to Marvin? ");
        String s = br.readLine();
        
        Marvin marvin = new Marvin();
        System.out.println("Marvin replies:" + marvin.talk(s));
	}

}
