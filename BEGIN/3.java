import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int r;
		Scanner sc = new Scanner(System.in);
		double PI = Math.atan(1.0) * 4;
		r = sc.nextInt();
		sc.close();
		System.out.printf("%.7f", PI * r * r);
	}

}