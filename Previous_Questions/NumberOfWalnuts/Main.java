import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        sc.close();
        int lcm = arr[0];
        for(int i=1; i<3; i++)
            lcm = LCM(lcm, arr[i]);
        System.out.println(lcm);
    }

    private static int GCD(int a, int b) {
	    return a % b == 0 ? b : GCD(b, a % b);
    }

    private static int LCM(int a, int b) { 
        return a * b / GCD(a, b);
    }

}