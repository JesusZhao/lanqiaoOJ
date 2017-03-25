import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		long n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextLong();
		sc.close();
		System.out.println(n * (n + 1) / 2);
	}

}
