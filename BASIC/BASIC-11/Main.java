import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.next();
        sc.close();
        System.out.println(Long.parseLong(in, 16)); // 注意不能使用Integer.parseInt(in, 16)，范围不够
    }

}