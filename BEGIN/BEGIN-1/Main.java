import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		int a, b;
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		b = input.nextInt();
		input.close();
		System.out.println(a+b);
	}
}