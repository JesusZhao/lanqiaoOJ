import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        sc.close();
        for(int i=0; i<n; i++){
            for(int j=0;j<m;j++)
                System.out.print((char)(65+Math.abs(i-j)%26));
            System.out.println();
        }
    }

}