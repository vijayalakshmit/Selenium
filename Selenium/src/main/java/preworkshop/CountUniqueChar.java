package preworkshop;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class CountUniqueChar {

	public static void main(String[] args) {
		String s1;
		s1="Hexaware";
		//String str = "testString";
		char[] chs =s1.toCharArray(); // convert character to array
		
		Map<Character, Integer> countChar = new TreeMap<Character, Integer>();
		
		for(char ch : chs){
			
			
			if (countChar.containsKey(ch)) {				
				
				countChar.put(ch, countChar.get(ch)+1);	
			} else
				countChar.put(ch, 1);	
			
						
			
		}
		System.out.println(countChar);
	
	}

}
