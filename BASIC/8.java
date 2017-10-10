public class Main{

    public static void main(String[] args) {
        for(int i=1000; i<10000; i++)
            if(i%10*1000 + i%100/10*100 + i%1000/100*10 + i/1000 == i)
                System.out.println(i);
    }

}