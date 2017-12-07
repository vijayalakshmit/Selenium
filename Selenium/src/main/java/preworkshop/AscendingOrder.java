package preworkshop;
import java.util.Scanner;

public class AscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sortNum = 0;
		for (int i = 9; i >= 0; i--) {
			int tmpNum = num;
			while (tmpNum > 0) {
				int digit = tmpNum % 10;
				if (digit == i) {
					sortNum =sortNum* 10;
					sortNum =sortNum+ digit;
				}
				tmpNum =tmpNum/ 10;
			}
		}
		System.out.println("Sorted digits in ascending order: " + 

sortNum);
		scan.close();
	}
}
