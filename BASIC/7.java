public class Main {

    public static void main(String[] args) {

        for(int i=100; i<1000; i++)
            if(isSpecial(i))
                System.out.println(i);

    }

    private static boolean isSpecial(int i){
        int b = i / 100;
        int s = i % 100 / 10;
        int g = i % 10;
        if(b*b*b + s*s*s + g*g*g == i)
            return true;
        return false;
    }

}