import java.util.Scanner;

public class Main {
	public static void main(String[] argv) {
		System.out.println("Для подсчета простых чисел введите 1;");
		System.out.println("Для проверки палиндрома введите 2;");

		int num = enterTheNumber();

		if (num == 1) {
			ProstueChisla.startSearchSimple();
		} else if (num == 2) {
			Palyndrom.startPalyndrom();
		}

	}

	public static int enterTheNumber() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
}