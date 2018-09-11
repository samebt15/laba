import java.util.Scanner;

public class ProstueChisla {
	public static void startProstueChisla() {
	int inp = enter();
	int j = 0;
	for (int P = 1; P <= inp; P++) {
		for (int i = 1; i <= P; i++) {
			j = check(P,i,j);
		}
		if (s_out(j)) {
			System.out.println(P);
		}
		j=0;
		}
	}

	public static int enter() {
		System.out.println("Введите положительное число: ");
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		return input;
	}

	public static int check(int a, int b, int c) {
		if (a % b == 0) {
			c++;
		}
		return c;
	}

	public static boolean s_out(int m) {
		if (m ==2 ) {
			return true;
		} else {
			return false;
		}
	}
}