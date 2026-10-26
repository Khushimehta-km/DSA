import java.util.*;
public class TwoSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int n = sc.nextInt();
        int [] nums = new int[n];
        int [] arr = new int[2];
        for (int i = 0 ; i < n ; i++){
            nums[i] = sc.nextInt();
        }
        for (int i = 0 ; i < n ; i++){
            for (int j = i+1 ; j < n ; j++){
                if (nums[i] + nums[j] == target){
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }
        }

        System.out.println(arr);
    }
}