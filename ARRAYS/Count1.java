import java.util.Scanner;
import java.util.ArrayList;
public class Count1{
    public int count(int n , int m){
        int sum = 0;
        int count = 0;
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < m ; j++){
                if (mat[i][j] == 1){
                    count = (m-j);
                    break;
                }
            }
        }

        sum = max(sum , count);

    }

    public static void main(String[] args){
        ArrayList <ArrayList<Integer>> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < m ; j++){
                arr.add()
            }
        }

    }
}