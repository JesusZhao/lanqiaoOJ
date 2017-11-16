import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int n = input.nextInt();
        String[] str = new String[n];
        for(int i=0;i<n;i++){
            str[i] = input.next();
        }
        input.close();
        for(int i=0;i<n;i++){
            String binStr = hexToBinary(str[i]);
            int len = binStr.length();
            if(len%3==1){// 使得转换为二进制的字符串长度刚好为3的倍数
                binStr = "00"+binStr;
            } else if(len%3==2) {
                binStr = "0"+binStr;
            }
            System.out.println(binToOctalString(binStr));
        }
    }

    public static String hexToBinary(String hexStr){
        int len = hexStr.length();
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<len;i++){
            switch (hexStr.charAt(i)) {
                case '0':
                    sb.append("0000");
                    break;
                case '1':
                    sb.append("0001");
                    break;
                case '2':
                    sb.append("0010");
                    break;
                case '3':
                    sb.append("0011");
                    break;
                case '4':
                    sb.append("0100");
                    break;
                case '5':
                    sb.append("0101");
                    break;
                case '6':
                    sb.append("0110");
                    break;
                case '7':
                    sb.append("0111");
                    break;
                case '8':
                    sb.append("1000");
                    break;
                case '9':
                    sb.append("1001");
                    break;
                case 'A':
                    sb.append("1010");
                    break;
                case 'B':
                    sb.append("1011");
                    break;
                case 'C':
                    sb.append("1100");
                    break;
                case 'D':
                    sb.append("1101");
                    break;
                case 'E':
                    sb.append("1110");
                    break;
                case 'F':
                    sb.append("1111");
                    break;
                default:
                    break;
            }
        }
        return sb.toString();
    }

    public static String binToOctalString(String binStr){
        int len = binStr.length(), k;
        StringBuffer sb = new StringBuffer();
        k=(binStr.substring(0,3).equals("000"))?3:0;// 防止第一位输出0
        for(int i=k;i<len-2;i+=3){
            switch (binStr.substring(i,i+3)) {
                case "000":
                    sb.append("0");
                    break;
                case "001":
                    sb.append("1");
                    break;
                case "010":
                    sb.append("2");
                    break;
                case "011":
                    sb.append("3");
                    break;
                case "100":
                    sb.append("4");
                    break;
                case "101":
                    sb.append("5");
                    break;
                case "110":
                    sb.append("6");
                    break;
                case "111":
                    sb.append("7");
                    break;
                default:
                    break;
            }
        }
        return sb.toString();
    }
}