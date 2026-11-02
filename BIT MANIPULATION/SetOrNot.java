import java.util.Scanner;
public class SetOrNot{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        //By Left Shift
        if ((n & (1 << i)) != 0){
            System.out.println("Set");
        }
        else{
            System.out.println("Not Set");
        }

        //By Right Shift
        if (((n >> i) & 1) == 1){
            System.out.println("Set");
        }
        else{
            System.out.println("Not Set");
        }
           
    }
}