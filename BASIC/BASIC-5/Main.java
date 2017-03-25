import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = -1;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        for(int i=0; i<n; i++)
        	if(m == arr[i]){
        		index = i;
        		break;
        	}
        if(index != -1)
            System.out.println(index + 1);
        else
            System.out.println(-1);
    }

}