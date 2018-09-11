import java.util.Scanner;

public class Palyndrom {

	public Palyndrom() {

	}

	public static void startPalyndrom() {
		System.out.println();
		System.out.println("Введите слово");
		String str = getWord();
		System.out.println(isPalindrom(str));
	}

	public static boolean isPalindrom(String str) {
		char[] words = str.toCharArray();
	    int j = words.length - 1;
	    for(int i = 0; j > i; i++; j--) 
		while (j > i) {
        	if (words[i] != words[j]) {
            	return false;
        	}
    	}
		return true;
	}

	public static String getWord() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}
}