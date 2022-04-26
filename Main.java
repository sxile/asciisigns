import java.util.Scanner;

public class Main {

	public static boolean dir = false;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String input = "";
		String [] byes = {"see ya!", "later!", "thanks!", "peace.", "exiting...", "beep boop...", "self-destruct..."};
		
		
		while(!input.equals("-1")){
			input = in.nextLine();
			Letter.print(input);
		}
		
		Letter.print(byes[(int)(Math.random() * byes.length)]);
	}
	
	
}

