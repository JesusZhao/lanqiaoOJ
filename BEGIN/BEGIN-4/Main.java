import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] f = new int[1000001];
        Scanner sc = new Scanner(System.in);
        f[1] = f[2] = 1;
        for(int i = 3; i < f.length; i++)
            f[i] = (f[i - 1] + f[i - 2]) % 10007;
        System.out.println(f[sc.nextInt()]);
        sc.close();
    }

}