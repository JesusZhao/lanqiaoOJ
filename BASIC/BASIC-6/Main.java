import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        sc.close();
        int[][] arr = new int[row][];
        for(int i=0; i<row; i++){
            arr[i] = new int[i+1];
            arr[i][0] = arr[i][i] = 1;
        }
        for(int i=2; i<arr.length; i++)
            for(int j=1;j<i;j++)
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];

        for(int i=0; i<arr.length; i++)
            for(int j=0; j<arr[i].length; j++){
                if(arr[i].length-1 == j)
                    System.out.println(arr[i][j]);
                else
                    System.out.print(arr[i][j] + " ");
            }
        
    }

}