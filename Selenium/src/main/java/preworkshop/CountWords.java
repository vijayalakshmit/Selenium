package preworkshop;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			String s1 = "I am the winner";
			int i = s1.length(); 
			int count = 0;
			//String newCount = s1.trim();
			//System.out.println(i + " " + newCount);
			String[] arrayName = s1.split(" ");
			for(String eachWord : arrayName ){
				System.out.println(eachWord);
				count++;
			}
		
			System.out.println(count);

	}
}
	
}
