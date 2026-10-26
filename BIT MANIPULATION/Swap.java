import java.util.Scanner;

public class Swap{
    /*By using third var */
    public static String thirdvar(int a , int b){
        int temp = a;
        a = b;
        b = temp;

        return (a + " " + b);
    }

    /*Without using third var (arithematic)*/
    public static String arith(int a , int b){
        a = a + b;
        b = a - b;
        a = a - b;

        return (a + " " + b);
    }

    /*Without using Third var (xor)*/
    public static String xor(int a , int b){
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        return (a + " " + b);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(thirdvar(a , b));
        System.out.println(arith(a , b));
        System.out.println(xor(a , b));
    }
}
