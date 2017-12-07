package preworkshop;
/*Learn passing of input data as String arguments to main method

Print each of the String present in the String array of the main method.

1. Have a logic to print the array of Strings present as main method's argument.
2. To pass the String arguments to your main method, right click in the editor,
 Run As --> Run Configurations --> arguments tab. Give the list of input parameters separated by space.


Additional - You can also try compiling and executing your program from command line.*/
public class Arguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		int c = a + b;
		System.out.println("The sum is " + c + ". Declared in argument Tab");
	
	}

}
