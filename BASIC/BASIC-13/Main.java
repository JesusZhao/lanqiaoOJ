import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int[] numArr = new int[n];
        for(i=0; i<n; i++)
            numArr[i] = sc.nextInt();
        sc.close();
        Arrays.sort(numArr);
        for(i=0; i<numArr.length-1; i++)
            System.out.print(numArr[i] + " ");
        System.out.println(numArr[i]);
    }

}