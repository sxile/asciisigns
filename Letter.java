import java.util.ArrayList;

public class Letter {
	
	String[] ascii = new String[5];
	private static boolean dir = false;
	
	public Letter(char input){
		ascii = setLetter(input);
	}
	
	public static void print(String input) {
		input = input.toLowerCase();
		ArrayList<Letter> word = new ArrayList<Letter>();
		for(int i = 0 ; i < input.length(); i++) {
			Letter b = new Letter(input.charAt(i));
			word.add(b);
		}
		
		dir = !dir;
		if(dir) printA(word);
		else printB(word);
	}
	
	public static void printA(ArrayList<Letter> b) {
		System.out.print("      ");
		for(Letter e : b) {
			e.printEmpty();
		}
		System.out.print("----");
		System.out.println();
		for(int i = 0; i < 5 ; i++) {
			System.out.print(" ");
			for(int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			System.out.print("- ");
			for(Letter e : b) {
				e.printRow(i);
			}
			System.out.println(" -");
		}
		for(Letter e : b) {
			e.printEmpty();
		}
		System.out.print("----");
		System.out.println();
	}

	public static void printB(ArrayList<Letter> b) {
		
		for(Letter e : b) {
			e.printEmpty();
		}
		System.out.print("----");
		System.out.println();
		for(int i = 0; i < 5 ; i++) {
			System.out.print(" ");
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.print("- ");
			for(Letter e : b) {
				e.printRowB(i);
			}
			System.out.println(" -");
		}
		System.out.print("      ");
		for(Letter e : b) {
			e.printEmpty();
		}
		System.out.print("----");
		System.out.println();
	}
	
	private String[] setLetter(int a) {
		String[] r = null;
		if(a == 'a') {
			r = new String[] {"010","101","101","111","101"}; 
		} else if(a == 'b') {
			r = new String[] {"110","101","110","101","110"}; 
		} else if(a == 'c') {
			r = new String[] {"111","101","100","101","111"}; 
		} else if(a == 'd') {
			r = new String[] {"110","101","101","101","110"}; 
		} else if(a == 'e') {
			r = new String[] {"111","100","111","100","111"}; 
		} else if(a == 'f') {
			r = new String[] {"111","100","111","100","100"}; 
		} else if(a == 'g') {
			r = new String[] {"011","100","101","101","010"}; 
		} else if(a == 'h') {
			r = new String[] {"101","101","111","101","101"}; 
		} else if(a == 'i') {
			r = new String[] {"111","010","010","010","111"}; 
		} else if(a == 'j') {
			r = new String[] {"111","001","001","101","010"}; 
		} else if(a == 'k') {
			r = new String[] {"101","101","110","101","101"}; 
		} else if(a == 'l') {
			r = new String[] {"100","100","100","100","111"}; 
		} else if(a == 'm') {
			r = new String[] {"10001","11011","10101","10001","10001"}; 
		} else if(a == 'n') {
			r = new String[] {"1001","1101","1011","1001","1001"}; 
		} else if(a == 'o') {
			r = new String[] {"111","101","101","101","111"}; 
		} else if(a == 'p') {
			r = new String[] {"110","101","110","100","100"}; 
		} else if(a == 'q') {
			r = new String[] {"0110","1001","1001","1010","0101"}; 
		} else if(a == 'r') {
			r = new String[] {"110","101","110","101","101"}; 
		} else if(a == 's') {
			r = new String[] {"011","100","010","001","110"}; 
		} else if(a == 't') {
			r = new String[] {"111","010","010","010","010"}; 
		} else if(a == 'u') {
			r = new String[] {"101","101","101","101","111"}; 
		} else if(a == 'v') {
			r = new String[] {"101","101","101","101","010"}; 
		} else if(a == 'w') {
			r = new String[] {"10001","10001","10101","10101","01010"}; 
		} else if(a == 'x') {
			r = new String[] {"101","101","010","101","101"}; 
		} else if(a == 'y') {
			r = new String[] {"101","101","101","010","010"}; 
		} else if(a == 'z') {
			r = new String[] {"111","001","010","100","111"}; 
		} else if(a == ' ') {
			r = new String[] {"00","00","00","00","00"};
		} else if(a == '!') {
			r = new String[] {"1","1","1","0","1"};
		} else if(a == '.') {
			r = new String[] {"0","0","0","0","1"};
		} else if(a == '?') {
			r = new String[] {"111","001","011","000","010"};
		} else if(a == '/') {
			r = new String[] {"001","010","010","010","100"};
		} else if(a == '\"') {
			r = new String[] {"101","101","000","000","000"};
		} else if(a == '-') {
			r = new String[] {"00","00","11","00","00"};
		} else if(a == '1') {
			r = new String[] {"010","110","010","010","111"};
		} else if(a == '2') {
			r = new String[] {"010","101","001","010","111"};
		} else if(a == '3') {
			r = new String[] {"110","001","110","001","110"};
		} else if(a == '4') {
			r = new String[] {"101","101","111","001","001"};
		} else if(a == '5') {
			r = new String[] {"111","100","110","001","110"};
		} else if(a == '6') {
			r = new String[] {"011","100","111","101","111"};
		} else if(a == '7') {
			r = new String[] {"111","001","010","100","100"};
		} else if(a == '8') {
			r = new String[] {"010","101","010","101","010"};
		} else if(a == '9') {
			r = new String[] {"111","101","111","001","110"};
		} else if(a == '0') {
			r = new String[] {"0110","1011","1101","1001","0110"};
		} else if(a == '\'') {
			r = new String[] {"1","1","0","0","0"};
		} 
		
		return r;
	}

	public void printEmpty() {
		for(int j = -1; j < ascii[0].length() ; j++) {
			System.out.print("--");
		}
	}
	
	public void printRow(int i) {
		System.out.print(" ");
		for(int j = 0; j < ascii[i].length() ; j++) {
			if(ascii[i].charAt(j) == '1') {
				System.out.print("_/");
			} else {
				System.out.print("  ");
			}
		}
		System.out.print(" ");
	}
	
	public void printRowB(int i) {
		System.out.print(" ");
		for(int j = 0; j < ascii[i].length() ; j++) {
			if(ascii[i].charAt(j) == '1') {
				System.out.print("\\_");
			} else {
				System.out.print("  ");
			}
		}
		System.out.print(" ");
	}
	
}
