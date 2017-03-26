import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=10000; i<1000000; i++){
            int m = 0, sum = 0;
            int tempi = i;
            if(isPlalindrome(i)){
                while(tempi > 0){
                    int j = tempi % 10;
                    sum += j;
                    tempi /= 10;
                }
                if(sum == n)
                    System.out.println(i);
            }
        }
    }

    private static boolean isPlalindrome(int number){
        String num2str = String.valueOf(number);
        return new StringBuffer(num2str).reverse().toString().equals(num2str);
    }

}